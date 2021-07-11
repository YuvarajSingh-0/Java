import java.util.Scanner;
public class nthfactorial{
    public static void main(String[] args){
        Scanner readobj=new Scanner(System.in);
        System.out.println("Enter the factorial number: ");
        int n=readobj.nextInt(),m=1;
        int org=n;
        while(n>0){
            m=m*n;
            n=n-1;
        }
        System.out.printf("The factorial of "+org+" is: "+m);
        readobj.close();
    }
}