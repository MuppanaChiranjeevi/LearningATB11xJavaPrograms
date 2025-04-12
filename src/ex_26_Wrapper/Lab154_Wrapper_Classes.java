package ex_26_Wrapper;

public class Lab154_Wrapper_Classes {
        public static void main(String[] args) {
            // Converting Strings to Primitives
            // String to int
            String numberStr = "123";
            int num = Integer.parseInt(numberStr);
            System.out.println("String to int: " + num);

            // String to double
            String doubleStr = "45.67";
            double d = Double.parseDouble(doubleStr);
            System.out.println("String to double: " + d);

            // String to boolean
            String boolStr = "true";
            boolean b = Boolean.parseBoolean(boolStr);
            System.out.println("String to boolean: " + b);

            // String to char
            String charStr = "A";
            char c = charStr.charAt(0);  // We use the first character
            System.out.println("String to char: " + c);

            // String to long
            String longStr = "9876543210";
            long l = Long.parseLong(longStr);
            System.out.println("String to long: " + l);

            // String to float
            String floatStr = "12.34";
            float f = Float.parseFloat(floatStr);
            System.out.println("String to float: " + f);

            // String to short
            String shortStr = "1234";
            short s = Short.parseShort(shortStr);
            System.out.println("String to short: " + s);

            // String to byte
            String byteStr = "127";
            byte by = Byte.parseByte(byteStr);
            System.out.println("String to byte: " + by);

        }
    }


