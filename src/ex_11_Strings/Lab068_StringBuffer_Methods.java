package ex_11_Strings;

public class Lab068_StringBuffer_Methods {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Chiranjeevi");
        System.out.println(sb);
        // length() – Returns the length of the string
        System.out.println(sb.length());
        // append() – Adds text at the end
        sb.append("Muppana");
        System.out.println(sb);
        System.out.println(sb.length());
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

        StringBuffer sbnew=new StringBuffer();
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
        StringBuffer SB=new StringBuffer(50);
        System.out.println(SB);
        System.out.println(SB.capacity());
        SB.append("My name is Chiranjeevi Muppana. I am learning java, selenium, API testing");
        System.out.println(SB);
        System.out.println(SB.capacity()); //( 50*2 ) + 2 =102
        System.out.println("---------------------------------");
        // ensureCapacity() – Ensures minimum capacity
        StringBuffer chiru = new StringBuffer();
        System.out.println(chiru.capacity());
        chiru.ensureCapacity(50);  // Ensures capacity of at least 50
        System.out.println(chiru.capacity());
        // setCharAt() – Modifies a specific character
        StringBuffer sbf = new StringBuffer("Python");
        sbf.setCharAt(0, 'J');
        System.out.println(sbf);  // Output: Lava

    }
}
