package ex_01_Java_Basics_part1;

public class Lab003_Keywords {
    /*
    Java keywords are predefined reserved words that have special meanings in the Java.
    keywords cannot be used as identifiers (such as variable names, method names, or class names).
    used to define the structure and behavior of the program.
    -->All the keywords are defined in Lower Case only.
    As of Java 21, there are 67 reserved keywords in Java.

    List of 67 Java Keywords (Java 21)
    1. Control Flow Keywords
    if
    else
    switch
    case
    default
    while
    do
    for
    break
    continue
    return
    yield (Introduced in Java 13 for enhanced switch expressions)
    2. Exception Handling Keywords
    try
    catch
    finally
    throw
    throws
    3. Class and Object Keywords
    class
    interface
    extends
    implements
    this
    super
    new
    instanceof
    abstract
    final
    static
    4. Access Modifiers
    private
    protected
    public
    5. Variable and Method Modifiers
    volatile
    transient
    synchronized
    native
    strictfp
    6. Primitive Data Types
    byte
    short
    int
    long
    float
    double
    char
    boolean
    void
    7. Object-Oriented Programming (OOP) Keywords
    enum (Introduced in Java 5)
    record (Introduced in Java 14)
    sealed (Introduced in Java 17)
    non-sealed (Introduced in Java 17)
    permits (Introduced in Java 17)
    8. Concurrency & Memory Management
    synchronized
    volatile
    strictfp
    native
    9. Module System Keywords (Introduced in Java 9)
    module
    requires
    exports
    opens
    uses
    provides
    with
    transitive
    10. Assertion Keyword
    assert
    11. Reserved Future Use Keywords (Not Used Yet)
    goto (Reserved but not used)
    const (Reserved but not used)
    Special Reserved Literals (Not Keywords)
    Although not keywords, the following are reserved literals:
    true
    false
    null
     */
    public static void main(String[] args) {
        String[] keywords = {
                // Control Flow Statements
                "if", "else", "switch", "case", "default", "while", "do", "for", "break", "continue", "return", "yield",

                // Exception Handling
                "try", "catch", "finally", "throw", "throws",

                // Class and Object Keywords
                "class", "interface", "extends", "implements", "this", "super", "new", "instanceof", "abstract", "final", "static",

                // Access Modifiers
                "private", "protected", "public",

                // Variable and Method Modifiers
                "volatile", "transient", "synchronized", "native", "strictfp",

                // Primitive Data Types
                "byte", "short", "int", "long", "float", "double", "char", "boolean", "void",

                // OOP and Advanced Features
                "enum", "record", "sealed", "non-sealed", "permits",

                // Module System Keywords (Introduced in Java 9)
                "module", "requires", "exports", "opens", "uses", "provides", "with", "transitive",

                // Assertion Keyword
                "assert",

                // Reserved for Future Use
                "goto", "const"
        };

        System.out.println("Total Java Keywords (Java 21): " + keywords.length);
        System.out.println("Java Keywords: ");

        // Print in tabular format (5 keywords per line)
        for (int i = 0; i < keywords.length; i++) {
            System.out.printf("%-12s", keywords[i]); // Left-aligned, 12-character width
            if ((i + 1) % 5 == 0) System.out.println(); // New line after 5 keywords
        }
    }
}
