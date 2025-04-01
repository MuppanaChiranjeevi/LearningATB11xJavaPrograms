package ex_14_OOPS_Class_Object;

/**
 * A single .java file, can contain multiple classes, but there are some rules to follow:
 * Only one public class – A .java file can contain only one public class.
 * The name of this class must match the filename.
 * Multiple non-public classes – You can have any number of non-public classes in the same .java file,
   as long as they are not declared as public.
 * Nested (Inner) Classes – You can define multiple nested (inner) classes within a class.
 * These can be static, private, protected, or public.
 *
 * A single .java file containing multiple classes can have multiple main methods,
 * but each class can have at most one main method.
 * There is no limit on how many main methods you can have in a single .java file
 * containing multiple classes, but only one main method per class.
 * The JVM starts execution from the main method of the class you specified when running the program.
 */
public class Lab089_Multiple_Classes {
    public static void main(String[] args) {
        System.out.println("Multiple classes in one file");
    }
}
class P1 {
}

class P2 {
}

class $123 {
}

class $ {
}
class __ {
}
class _$ {
}

class P3 {
}

class P4 {
};

class P5 {

    class P6 {
        public class P7 {
            private class P8 {
                protected class p10 {

                }

            }
        }
    }

}
class P7{
    public static void main(String[] args) {
        System.out.println("P7");
    }
}
class P8{
    public static void main(String[] args) {
        System.out.println("P8");
    }
}
class P9{
    public static void main(String[] args) {
        System.out.println("P9");
    }
}
