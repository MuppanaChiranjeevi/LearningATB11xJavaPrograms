package ex_11_Strings;

public class Lab066_String_Methods {
    public static void main(String[] args) {
        // 1.length() : Returns the length (number of characters) of the string.
        String str = "Chiranjeevi";
        System.out.println("Length: "+str.length()); // Output: 11
        System.out.println("------------- 1 ------------");

        // 2.charAt(int index) : Returns the character at the specified index
        // C h i r a n j e e v i  --> Start with 0 index
        // 0 1 2 3 4 5 6 7 8 9 10
        System.out.println(str.charAt(6));  // Output: j
        System.out.println(str.charAt(4));  // Output: a
        System.out.println(str.charAt(10)); // Output: i
        System.out.println("------------- 2 ------------");

        // 3.substring(int beginIndex) : Returns a substring from the specified index to  end of the string.
        System.out.println(str.substring(5));
        System.out.println(str.substring(2));
        System.out.println(str.substring(6));
        System.out.println("------------ 3 -------------");

        // 4.substring(int beginIndex, int endIndex) : Returns a substring starting from beginIndex to endIndex - 1.
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(5,9));
        System.out.println(str.substring(1,7));
        System.out.println("------------- 4 ------------");

        // 5.toUpperCase(): Converts the string to uppercase.
        System.out.println(str.toUpperCase());
        System.out.println("java".toUpperCase());
        System.out.println("------------- 5 ------------");

        // 6.toLowerCase() : Converts the string to lowercase.
        str="MUPPANA";
        System.out.println(str.toLowerCase());
        System.out.println("CHIRANJEEVI".toLowerCase());
        System.out.println("------------- 6 ------------");
        // 7.trim() : Removes leading and trailing spaces from the string.
        str = "     Hello      ";
        System.out.println(str.trim());  // Output: Hello
        System.out.println("------------- 7 ------------");

        // 8.startsWith(String prefix) : Checks if the string starts with the specified prefix.
        str = "Manasa";
        System.out.println(str.startsWith("Mana"));
        System.out.println(str.startsWith("M"));
        System.out.println(str.startsWith("N"));
        System.out.println("------------- 8 ------------");

        // 9.endsWith(String suffix) : Checks if the string ends with the specified suffix.
        str = "Structures";
        System.out.println(str.endsWith("res"));
        System.out.println(str.endsWith("s"));
        System.out.println(str.endsWith("ab"));
        System.out.println("------------- 9 ------------");

        // 10.indexOf(String str) : Returns the index of the first occurrence of the specified character or substring.
        str = "Chiranjeevhi";
        System.out.println(str.indexOf("e"));
        System.out.println(str.indexOf("i"));
        System.out.println(str.indexOf("hi"));
        System.out.println(str.indexOf("ran"));
        System.out.println(str.indexOf("jeev"));
        System.out.println("------------ 10 -------------");

        // 11.lastIndexOf(String str) : Returns the index of the last occurrence of the specified character or substring.
        System.out.println(str.lastIndexOf("e"));
        System.out.println(str.lastIndexOf("i"));
        System.out.println(str.lastIndexOf("hi"));
        System.out.println(str.lastIndexOf("ran"));
        System.out.println(str.lastIndexOf("jeev"));
        System.out.println("------------- 11 ------------");

        // 12.equals(Object obj) : Compares two strings for equality. (Case Sensitive)
        //                         compares if two strings are equal (case-sensitive)
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        System.out.println(str1.equals(str2));  // Output: true
        System.out.println(str1.equals(str3));  // Output: false
        System.out.println("------------ 12 -------------");

        // 13.equalsIgnoreCase(String anotherString) : Compares two strings for equality, ignoring case differences. (Case In-Sensitive)
        System.out.println(str1.equalsIgnoreCase(str3));
        str1="CHIRAnjeevi";
        str2="chiraNJEEVI";
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println("------------ 13 -------------");

        // 14.split(String regex) : Splits the string into an array of substrings based on the specified delimiter.
        String str0 = "apple,banana,orange";
        String[] fruits = str0.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("\n");
        str0 = "infosys@tcs@orange@capgemini@accenture";
        String[] com = str0.split("@");
        for (String fruit : com) {
            System.out.println(fruit);
        }
        System.out.println("\n");
        com = str0.split("@",3);
        for (String fruit : com) {
            System.out.println(fruit);
        }
        System.out.println("------------ 14 -------------");

        // 15.contains(CharSequence s) : Checks if the string contains the specified substring.
        str="Infosys Limited";
        System.out.println(str.contains("sys"));
        System.out.println(str.contains("Info"));
        System.out.println(str.contains("Limit"));
        System.out.println(str.contains("Infy"));
        System.out.println(str.contains("a"));
        System.out.println("------------ 15 -------------");

        // 16.concat(String str) : Concatenates the specified string to the end of this string.
        str0 = "Muppana";
        str1 =  "Chiranjeevi";
        System.out.println(str0.concat(str1));
        System.out.println(str1.concat(str0));
        System.out.println(str1+str0);
        System.out.println(str0+str1);
        System.out.println("------------ 16 -------------");

        // 17.isEmpty() : Checks if the string is empty (length = 0).
        String str10 = "";
        String str20 = "Hi";
        System.out.println(str10.isEmpty()); // Output: true
        System.out.println(str20.isEmpty()); // Output: false
        System.out.println("------------- 17 ------------");
        // 18.valueOf(dataType value) : The valueOf() method in Java is a static method in the String class
        // used to convert values of different data types (like int, float, double, boolean, char, etc.)
        // into their string representation.
        int num = 123;
        String  strstr= String.valueOf(num);
        System.out.println(strstr);  // Output: 123
        System.out.println(strstr + 456);

        double dnum = 12.34;
        String strnew = String.valueOf(dnum);
        System.out.println(strnew);
        System.out.println(strnew+56.78);

        System.out.println("------------ 18 -------------");
        // 19.replace(char oldChar, char newChar) / replace(CharSequence target, CharSequence replacement)
        //  Replaces all occurrences of the specified old character/target with a new character/replacement.
        str = "Java is fun";
        System.out.println(str.replace('a', 'e'));
        System.out.println(str.replace("fun", "awesome"));
        System.out.println(str.replace("Java", "Python"));
        System.out.println(str.replace('f', 's'));

        System.out.println("------------- 19 ------------");
        // 20.replaceAll(String regex, String replacement) : Replaces all occurrences of the substring matching the regular
        // expression with the given replacement string.
        str = "Hello123World456";
        System.out.println(str.replaceAll("[0-9]", "#"));
        System.out.println(str.replaceAll("[0-9]+", "#"));

        str = "The year is 2023, not 1999.";
        System.out.println(str.replaceAll("\\d+", "XXXX")); // \\d+ is a regex pattern that matches one or more digits.

        str = "One...Two...Three";
        System.out.println(str.replaceAll("\\.+", "-"));
        System.out.println(str.replaceAll("\\.", "-"));

        /* \\.+ matches one or more dots (. is a special regex character, so it’s escaped with \\). */
        System.out.println("------------- 20 ------------");

        // 21.matches(String regex) : Checks if the string matches the given regular expression.
        str = "hello";
        System.out.println(str.matches("[a-z]+"));  // Output: true
        // [a-z] matches any lowercase letter, and + means "one or more."

        str = "12345";
        System.out.println(str.matches("\\d+"));
        // \d represents any digit (0-9), and + means "one or more occurrences."

        str = "user@example.com";
        System.out.println(str.matches("[a-z]+@[a-z]+\\.com"));

        str = "3.14";
        System.out.println(str.matches("\\d\\.\\d+"));
        System.out.println("------------- 21------------");

        // 22. The compareTo method in Java is used to compare two strings lexicographically (dictionary order).
        // Returns < 0 (negative) if string1 comes before string2
        // Returns 0 if string1 equals string2
        // Returns > 0 (positive) if string1 comes after string2

        str1 = "apple";
        str2 = "banana";
        int result = str1.compareTo(str2);
        System.out.println(result); // Output: -1

        str1 = "cat";
        str2 = "cat";
        result = str1.compareTo(str2);
        System.out.println(result);

        str1 = "book";
        str2 = "books";
        result = str1.compareTo(str2);
        System.out.println(result);
        // "book" is a prefix of "books" and is shorter, so it comes first (negative result)

         str1 = "Apple";
         str2 = "apple";
         result = str1.compareTo(str2);
        System.out.println(result);

        // Explanation: Uppercase 'A' (Unicode 65) comes before lowercase 'a' (Unicode 97),
        // so result is negative. The exact number (-32) is the difference in Unicode values.
        System.out.println("------------ 22 -------------");

        // 23.compareToIgnoreCase(String anotherString) : Compares two strings lexicographically, ignoring case differences.
        str1 = "APPLE";
        str2 = "apple";
        result = str1.compareToIgnoreCase(str2);
        System.out.println(result);
        System.out.println("----------- 23 --------------");
        // 24.isBlank() Checks if the string is empty or contains only white spaces
        String s1="  ";
        String s2="";
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());

        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());

        System.out.println("------------ 24 -------------");
        // 25.repeat(int count) : Repeats the string the specified number of times
        String myname="Chiru ";
        System.out.println(myname.repeat(10));
        System.out.println("------------- 25 ------------");
        // toCharArray() : Converts the string to character array
        myname = "Chiranjeevi";
        char[] ch = myname.toCharArray();
        for(char c:ch){
            System.out.println(c);
        }
        System.out.println("-------------------------");
        // 26.joins(CharSequence delimiter, CharSequence... elements) : joins elements with a delimiter
        String join=String.join("-","Java","C++","Python","Ruby");
        System.out.println(join);
        System.out.println("------------- 26 ------------");
        // format(String format, Object...args)- Returns a formatted string
        System.out.println(String.format("My name is %s and I am %d years old.","Chiranjeevi",25));
        System.out.println("------------- 27 ------------");


    }
}
