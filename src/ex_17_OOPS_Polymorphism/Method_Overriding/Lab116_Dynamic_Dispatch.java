package ex_17_OOPS_Polymorphism.Method_Overriding;

public class Lab116_Dynamic_Dispatch {
    public static void main(String[] args) {
        Company c = new Company();
        Infosys infy = new Infosys();
        c.salary();
        infy.salary();
        System.out.println(c.name);
        System.out.println(infy.name);
        System.out.println("-----------------");
        Company ci=new Infosys(); // dynamic dispatch
        ci.salary();
        System.out.println(ci.name);
    }
}

class Company {
    String name;
    Company(){
        name="Company";
    }

    void salary(){
        System.out.println("Company salary");
    }

}
class Infosys extends Company {

    Infosys(){
        name="Infosys";
    }

    void salary(){
        System.out.println("Infosys salary");
    }

}

