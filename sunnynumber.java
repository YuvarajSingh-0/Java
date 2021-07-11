import java.util.Scanner;
import mypack.nonstaticpack.evenodds;
public class sunnynumber{
    public static void main(String[] args){
        Scanner readobj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=readobj.nextInt();
        new iperfect(num+1);  //no need for naming the object since it calls the method while creating it.
        /*if(perfectobj.isperfect(num+1))
            System.out.println("The given number is a Sunny number");
        else  
            System.out.println("The given number is not a Sunny number");
        readobj.close();*/
        readobj.close();
    }
}