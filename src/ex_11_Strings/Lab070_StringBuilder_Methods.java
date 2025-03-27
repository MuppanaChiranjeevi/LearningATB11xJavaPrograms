package ex_11_Strings;

public class Lab070_StringBuilder_Methods {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Chiranjeevi");
        System.out.println(sb);
        // length() – Returns the length of the string
        System.out.println(sb.length());
        // setLength() to change the length
        sb.setLength(5); //  // Setting the length to 5, truncating the string
        System.out.println(sb);
        System.out.println("---------------------------------");
        // append() – Adds text at the end
        sb=new StringBuilder("Chiranjeevi");
        System.out.println(sb);
        sb.append("Muppana");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println("---------------------------------");
        // insert() –  inserts the given String  at specific index
        sb.insert(11,"java");
        System.out.println(sb);
        // replace() – replaces the given String from the specified beginIndex and endIndex.
        sb.replace(11,15,"python");
        System.out.println(sb);
        // delete() - deletes the characters in a String from the specified beginIndex to endIndex.
        sb.delete(11,17);
        System.out.println(sb);
        // reverse() – Reverses the string
        sb.reverse();
        System.out.println(sb);
        System.out.println("---------------------------------");
        // capacity() – Returns the buffer capacity
        // The default capacity of the buffer is 16.
        System.out.println(sb.capacity()); // 16 + 11 =27

        StringBuilder sbnew=new StringBuilder();
        System.out.println(sbnew);
        System.out.println(sbnew.capacity());

        sbnew.append("Chiranjeevi");
        System.out.println(sbnew);
        System.out.println(sbnew.capacity());

        sbnew.append("Muppana");
        System.out.println(sbnew);
        System.out.println(sbnew.capacity());
        // If the number of character increases from its current capacity,
        // it increases the capacity by (oldcapacity*2)+2 = (16*2)+2=34
        System.out.println("---------------------------------");
        StringBuilder SB=new StringBuilder(50);
        System.out.println(SB);
        System.out.println(SB.capacity());
        SB.append("My name is Chiranjeevi Muppana. I am learning java, selenium, API testing");
        System.out.println(SB);
        System.out.println(SB.capacity()); //( 50*2 ) + 2 =102
        System.out.println("---------------------------------");
        // ensureCapacity() – Ensures minimum capacity
        StringBuilder chiru = new StringBuilder();
        System.out.println(chiru.capacity());
        chiru.ensureCapacity(50);  // Ensures capacity of at least 50
        System.out.println(chiru.capacity());
        // setCharAt() – Modifies a specific character
        StringBuilder sbf = new StringBuilder("Python");
        sbf.setCharAt(0, 'J');
        System.out.println(sbf);  // Output: Lava

    }
}
