package ex_16_OOPS_Inheritance.Multi_Level_Inheritance;

public class Lab100_MultiLevel_Inheritance {
    /*
     * Multilevel Inheritance – A subclass inherits from another subclass, forming a chain of inheritance
     * Forms a parent-child-grandchild relationship
     * This creates a chain of inheritance with multiple levels.
     *
     */
    public static void main(String[] args) {
        Son son = new Son();

        // Accessing methods from all levels
        son.showGrandfatherTraits();  // Inherited from Grandfather
        son.showFatherTraits();       // Inherited from Father
        son.showSonTraits();          // Defined in Son

        System.out.println(son.surname);
        System.out.println(son.property);
        System.out.println(son.money);
    }
}

// Grandfather class (Base Class)
class Grandfather {
    String surname = "Muppana";
    void showGrandfatherTraits() {
        System.out.println("Grandfather: Wise and experienced.");
    }
}

// Father class (Inheriting from Grandfather)
class Father extends Grandfather {
    String property="Home";
    void showFatherTraits() {
        System.out.println("Father: Strong and hardworking.");
    }
}

// Son class (Inheriting from Father)
class Son extends Father {
    int money = 1500000;
    void showSonTraits() {
        System.out.println("Son: Young and energetic.");
    }
}


