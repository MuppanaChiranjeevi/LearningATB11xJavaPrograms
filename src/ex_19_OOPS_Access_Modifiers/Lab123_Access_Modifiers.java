package ex_19_OOPS_Access_Modifiers;

public class Lab123_Access_Modifiers {
    /**
     * Access Modifiers in Java
     * Access modifiers are keywords that determine the accessibility (visibility) of classes,
     * interfaces, variables, methods, constructors, and other members in Java.
     * They determine where the members of a class can be accessed (within the class,
     * from other classes, within the same package, or from anywhere in the application).
     * There are four main access modifiers in Java:
     * private
     * default (no modifier)
     * protected
     * public
     * 1. Private Access Modifier
     * Most restrictive access level
     * Accessible only within the declared class
     * Not visible to any other class (including subclasses)
     *
     * 2. Default (Package-Private) Access Modifier
     * No keyword is used (when no modifier is specified)
     * Accessible only within the same package
     * Also called package-private access
     *
     * 3. Protected Access Modifier
     * Accessible within the same package
     * Accessible in subclasses (even if they're in different packages)
     *
     * 4. Public Access Modifier
     * The Least restrictive access level
     * Accessible from any other class
     * Used for methods/fields that need to be available to all
     *
     * Note: A class cannot be private or protected except nested class.
     *
     * Access Modifiers Summary Table
     * Modifier	 Class	Package	Subclass(same pkg)	Subclass(diff pkg)	World
     * private	  Yes	 No	     No   	              No	             No
     * default	  Yes	 Yes	 Yes	              No	             No
     * protected  Yes	 Yes	 Yes	              Yes	             No
     * public	  Yes	 Yes	 Yes	              Yes	             Yes
     *
     * How to access package from another package?
     * There are three ways to access the package from outside the package.
     * ➢ import package.*;
     *  If you use package.* then all the classes and interfaces of this package will be accessible but not subpackages.
     *
     * ➢ import package.classname;
     * If you import package.classname then only declared class of this package will be accessible.
     *
     * ➢ fully qualified name.
     * If you use fully qualified name then only declared class of this package will be
     * accessible. Now there is no need to import. But you need to use fully qualified name
     * every time when you are accessing the class or interface. It is generally used when two
     * packages have same class name.
     *
     * Note: If you import a package, subpackages will not be imported.
     */
    public static void main(String[] args) {
        System.out.println("Access Modifiers Notes");
    }
}
