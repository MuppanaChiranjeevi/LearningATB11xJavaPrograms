package ex_18_OOPS_Encapsulation;

public class Lab122_Encap_Example3 {

    public static void main(String[] args) {


        VWOLogin vwoLogin1 = new VWOLogin("admin", "pwd123");

//        System.out.println(vwoLogin1.password);
//        System.out.println(vwoLogin1.username);

        System.out.println(vwoLogin1.getUsername());

        System.out.println(vwoLogin1.getPassword());

        vwoLogin1.setUsername("Chiranjeevi");
        System.out.println(vwoLogin1.getUsername());
        vwoLogin1.setPassword("12345",true);
        System.out.println(vwoLogin1.getPassword());



    }


}


class VWOLogin {


    private String username; // Instance Variable | Data variable | Attribute | Fields |  properties | member variables
    private String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        }else{
            System.out.println("Not allowed to change the password!");
        }
    }


}