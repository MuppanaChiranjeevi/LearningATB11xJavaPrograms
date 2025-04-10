package ex_18_OOPS_Encapsulation;

public class Lab119_Encapsulation {
    /**
     * Encapsulation is one of the fundamental principles of Object-Oriented Programming (OOP) in Java.
     * It refers to the bundling of data (variables) and methods (functions) that operate on that data into a single unit, known as a class.
     * Binding (or wrapping) code and data together into a single unit are known as encapsulation.
     * Key Aspects of Encapsulation
         * Data Hiding: Prevents direct access to fields by making them private.
         * Controlled Access: Uses public getters and setters to allow controlled access to the private fields.
         * Bundling: Combines both the data and the methods that work on that data into one logical unit (class).
     * Getters and Setters in Java
     * Getters and setters are fundamental methods used to access and modify the private fields of a class in Java.
     * Getter Method
     * A getter method is used to retrieve the value of a private field.
     * It's typically named by using the prefix 'get' followed by the name of the field with the first letter capitalized.
     * Syntax:
     * public type getFieldName() {
     *     return fieldName;
     * }
     * Setter Method
     * A setter method is used to set or update the value of a private field.
     * It's typically named by using the prefix 'set' followed by the name of the field with the first letter capitalized.
     * Syntax:
     * public void setFieldName(type fieldValue) {
     *     this.fieldName = fieldValue;
     * }
     *
     * Best Practices
     * Naming convention: Use getVariableName for getters and setVariableName for setters
     * Boolean fields: For boolean fields, use isVariableName for the getter
     * Validation: Add validation logic in setters when appropriate
     * Immutable objects: Omit setters for immutable fields
     *
     */
    public static void main(String[] args) {
        Student p = new Student();
        System.out.println("Name = " + p.getName());
        p.setName("Geek");
        System.out.println("Name = " + p.getName());
        System.out.println("------------------------");
        p.setName("Chiranjeevi");
        System.out.println("Name: "+p.getName());


        // you cannot set the value of the college.
        // you can only get the value of the college.
//        p.setCollege("MVGR");
        System.out.println("College: "+p.getCollege());

        // you cannot get the value of the emailId;
        // you can only set the value of the emailId.
        p.setEmailId("chiru123@gmail.com");
//        System.out.println(p.getEmailId);
    }
}
// Java program demonstrating Encapsulation
class Student {
    // private data members
    private String name;

    private String college="AKG";

    private String emailId;

    // Getter and Setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // only getter method for college (Read-Only)
    public String getCollege(){
        return college;
    }
    // only setter method for college (Write-Only)
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
}



