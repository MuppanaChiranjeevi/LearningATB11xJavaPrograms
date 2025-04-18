package ex_27_Exception;

public class Lab167_User_Defined {
    public static void main(String args[])
    {
        try
        {
            // throw an object of user defined exception
            throw new UserDefinedException("This is user-defined exception");
        }
        catch (UserDefinedException ude)
        {
            System.out.println("Caught the user-defined exception exception");
            // Print the message from MyException object
            System.out.println(ude.getMessage());
        }
    }
}
class UserDefinedException extends Exception
{
    public UserDefinedException(String str)
    {
        // Calling constructor of parent Exception
        super(str);
    }
}
