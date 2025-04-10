//package ex_17_OOPS_Polymorphism.Method_Overloading;
//
//public class Lab112_Return_Type_Loading {
//    public static void main(String[] args) {
//        InvalidOverloading obj = new InvalidOverloading();
//
//        // How would Java know which add() to call here?
//        System.out.println(obj.add(5, 10));
//
//        // Even if we capture the return, it's still ambiguous at call site
//        int result = obj.add(5, 10);  // Which version?
//    }
//}
//class InvalidOverloading {
//    // First method
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    // Second method - same parameters, different return type
//    double add(int a, int b) {  // COMPILE ERROR!
//        return (double)(a + b);
//    }
//}
//
//// exception: method add(int,int) is already defined in class
////            ex_17_OOPS_Polymorphism.Method_Overloading.InvalidOverloading
//
