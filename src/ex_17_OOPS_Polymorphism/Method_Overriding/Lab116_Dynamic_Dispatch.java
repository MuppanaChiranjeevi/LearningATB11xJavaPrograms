package ex_17_OOPS_Polymorphism.Method_Overriding;

public class Lab116_Dynamic_Dispatch {
    public static void main(String[] args) {
        Company c = new Company();
        c.work();
        c.salary();
        System.out.println(c.name);
        System.out.println("-----------------");
        Infosys infy = new Infosys();
        infy.work();
        infy.salary();
        infy.project();
        System.out.println(infy.name);
        System.out.println("-----------------");
        Company ci=new Infosys(); // dynamic dispatch
        ci.work();
        ci.salary();
//        ci.project();
        System.out.println(ci.name);
    }
}

class Company {
    String name;
    Company(){
        name="Company";
    }

    void work(){
        System.out.println("Company is working");
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
    void project(){
        System.out.println("Infosys project");
    }


}

