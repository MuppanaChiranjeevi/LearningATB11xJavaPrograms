package ex_15_OOPS_Constructors;

public class Lab091_PC {

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.display();

        Car c2 = new Car();

        c2.display();

        Car c3 = new Car("Model 3", "Tesla", 2015);

        c3.display();

        Car c4 = new Car("Mahindra", "Scorpoio", 2020);

        c4.display();

        Car c5 = new Car("CURVV", "TATA", 2024);

        c5.display();

    }

}


class Car {

    String name;
    String model;
    int year;


    // DC
    Car() {
        model = "Unkown";
        year = 1900;
        name = "Unknown Car!";
        System.out.println("Default");

    }

    // Param - Constructor
    Car(String model_oc_arg, String name_oc_arg, int year_oc_arg) {
        this.name = name_oc_arg;
        this.model = model_oc_arg;
        this.year = year_oc_arg;
        System.out.println("Parameterised");
    }
    void display(){
        System.out.println("Model: "+model);
        System.out.println("Name: "+name);
        System.out.println("Year: "+year);
    }

}