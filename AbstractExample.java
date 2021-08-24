import java.util.Scanner;
public class AbstractExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dec;
        int n1,n2;
        do{
            System.out.println("Enter the Operation (add/sub): ");
            String op=sc.next();
            System.out.println("Enter the numbers: ");
            n1=sc.nextInt();
            n2=sc.nextInt();
            if(op.equals("add")){
                System.out.println("Addition: "+(n1+n2));
            }
            else
                System.out.println("Subtraction: "+(n1-n2));
                System.out.println("Do you want to continue? (y/n)");
            dec=sc.next();
            if((dec.toLowerCase()).equals("y")){
                continue;
            }
            else
                break;
        }while(true);
        sc.close();
    }
}