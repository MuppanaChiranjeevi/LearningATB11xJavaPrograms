package ex_15_Constructors;

public class Lab092_Constructor {

    public static void main(String[] args) {
        Company company;
        company=new Company();
        new Company();
        System.out.println("-----------------------");
        Company company1=new Company();
        company1.displayDetails();
        System.out.println("-----------------------");
        Company company2=new Company("Naveen",123456,15468.23);
        company2.displayDetails();
        System.out.println("-----------------------");
        Company company3=new Company("Sekhar",133976);
        company3.displayDetails();
        System.out.println("-----------------------");
        Company company5=new Company("Roman Reigns");
        company5.displayDetails();
        System.out.println("-----------------------");
        Company company4=new Company(company3);
        company4.displayDetails();

    }

}
class Company{
    String empName;
    int empId;
    double salary;


    // Default Constructor
    Company(){
        System.out.println("Default Constuctor is called");
        empId=1189139;
        empName="Chiranjeevi";
        salary=29865.432;
    }
    // Parameterized constructor
    Company(String name){
        System.out.println("parameterized constructor with 1 parameter");
        empName=name;
        empId= 987654;
        salary=75000;

    }
    // Parameterized constructor
    Company(String name,int id,double amount){
        System.out.println("parameterized constructor with 3 parameter");
        empName=name;
        empId=id;
        salary=amount;

    }
    // Parameterized constructor
    Company(String name,int id){
        System.out.println("parameterized constructor with 2 parameter");
        empName=name;
        empId=id;
        salary=50000;

    }

    // Copy constructor
    Company(Company c){
        System.out.println("Copy constructor");
        empName=c.empName;
        empId=c.empId;
        salary=c.salary;
    }
    void displayDetails() {

        System.out.println("Name: "+empName);
        System.out.println("Id: "+empId);
        System.out.println("Salary: "+salary);
    }
}

