package ex_12_Arrays;

public class Lab072_Arrays {
    public static void main(String args[]){
        //declaration, instantiation and initialization of an array
        int b[]={22,333,4444,55555};
        //traversing array
        for(int i=0;i<b.length;i++){//length is the property of array
            System.out.println(b[i]);
    }
        System.out.println("-------------------------");
    //declaration and instantiation of an array
        int a[]=new int[5];
        a[0]=10;//initialization
        a[1]=20;
        a[2]=70;
        a[3]=40;
        a[4]=50;
        //traversing array
        for(int i=0;i<a.length;i++){//length is the property of array
            System.out.println(a[i]);
        }
        System.out.println("-------------------------");
        /*
        The syntax of the for-each loop is given below:
        for(data_type variable:array){
        //body of the loop
        }
         */
        int [] num;
        num = new int [6]; //Creates an array of size 6 with default values
        for(int i:num){
            System.out.println(i);
        }
        System.out.println("-------------------------");

        num = new int[]{1, 2, 3, 4, 5, 6};

        for(int i:num){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        String [] numes;
        numes = new String [5]; //Creates an array of size 6 with default values (null)
        for(String i:numes){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        numes[0]= "chiru";
        numes[1]= "muppana";
        numes[2]= "python";
        numes[3]= "QA";
        numes[4]= "Selenium";
        for(String i:numes){
            System.out.println(i);
        }
    }
}
