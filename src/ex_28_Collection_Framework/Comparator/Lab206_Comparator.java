package ex_28_Collection_Framework.Comparator;
import java.util.*;
public class Lab206_Comparator {

    /**
     * The Comparator interface in Java is used to define custom sorting logic for objects.
     * The Comparator interface is present in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
     * public int compare(Object obj1, Object obj2) --> It compares the first object with the second object.
     * Returns a negative number if obj1 < obj2
     * Returns 0 if obj1 == obj2
     * Returns a positive number if obj1 > obj2
     *
     * public boolean equals(Object obj) --> It is used to compare the current object with the specified object.
     *
     * The comparator interface is useful when,
     * We need multiple sorting strategies for a class.
     * When we want to keep the sorting logic separate from the class.
     */
    public static void main(String[] args) {
        List<Employee> empList = Arrays.asList(
                new Employee(101, "John Sena", "Engineering", 75000, 5),
                new Employee(103, "Roman reigns", "Marketing", 68000, 3),
                new Employee(102, "Mike Johnson", "Engineering", 82000, 7),
                new Employee(100, "Sarah Williams", "HR", 65000, 2));
        System.out.println("Given ArrayList");
        for(int i=0;i<empList.size();i++){
            System.out.println(empList.get(i));
        }
        System.out.println("Sorting by Name");
        Collections.sort(empList, new ENameComparator());
        empList.forEach(System.out::println);
        System.out.println("----------------------");

        System.out.println("Sorting by Department");
        Collections.sort(empList, new DepartmentComparator());
        for(Employee emp : empList) {
            System.out.println(emp);
        }
        System.out.println("----------------------");

        System.out.println("Sorting by Salary (Descending)");
        Collections.sort(empList, new SalaryComparator());
        Iterator<Employee> itr = empList.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("----------------------");

        System.out.println("Sorting by Experience (Ascending)");
        Collections.sort(empList, new ExperienceComparator());
        ListIterator<Employee> litr = empList.listIterator();
        while(litr.hasNext()) {
            System.out.println(litr.next());
        }
        System.out.println("Sorting by Experience (Descending)");
        while(litr.hasPrevious()) {
            System.out.println(litr.previous());
        }

        // Using chained comparators
        System.out.println("----------------------");
        System.out.println("Sorting by EmpId then by Salary");
        empList.sort(Comparator
                .comparing((Employee e) -> e.getEmpId())
                .thenComparingDouble(e -> e.getSalary()));

        empList.forEach(System.out::println);
    }
}

class Employee {
    private int empId;
    private String name;
    private String department;
    private double salary;
    private int experienceYears;

    public Employee(int empId, String name, String department, double salary, int experienceYears) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", experienceYears=" + experienceYears +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public int getEmpId() {
        return empId;
    }
}

class ENameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareToIgnoreCase(e2.getName());
    }
}

class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getDepartment().compareToIgnoreCase(e2.getDepartment());
    }
}

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e2.getSalary(), e1.getSalary()); // Descending order
    }
}

class ExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getExperienceYears(), e2.getExperienceYears());
    }
}