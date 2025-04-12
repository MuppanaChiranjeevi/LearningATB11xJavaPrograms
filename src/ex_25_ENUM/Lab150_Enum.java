package ex_25_ENUM;

public class Lab150_Enum {
    enum Planet {
        EARTH(5.97), MARS(0.642), JUPITER(18.98);

        private double mass;

        Planet(double mass) {
            this.mass = mass;
            System.out.println("Constructor called for: " + this.name());
        }
    }

    public static void main(String[] args) {
        System.out.println("-----------Main----------------");
        for(Planet p: Planet.values()){

            System.out.print(p.ordinal());
            System.out.print(" "+p);
            System.out.println(" "+p.mass);
            System.out.println(p.name()+"\n");
        }
    }
}
