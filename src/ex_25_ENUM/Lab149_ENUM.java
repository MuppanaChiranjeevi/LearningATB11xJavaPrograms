package ex_25_ENUM;

public class Lab149_ENUM {

    enum Color{
        RED(5), BLACK(10), WHITE(15), ORANGE(20), BLUE(30);

        private int value;
        private Color(int value){
            this.value=value;
            System.out.println("Constructor called for: " + this.name());

        }
    }
    public static void main(String args[]){
        System.out.println("-----------Main----------------");
        for (Color c : Color.values()) {
            System.out.println(c + " " + c.value);
            System.out.println(c.ordinal()+" "+c.name());
        }

    }}