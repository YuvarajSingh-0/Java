import java.util.Scanner;
public class EvenOrOdds{
    public static void main(String[] args){
        Scanner readobj=new Scanner(System.in);
        int[] num=new int[100];
        System.out.println("No.of Inputs to be given are: ");
        int n=readobj.nextInt();
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++)
            num[i]=readobj.nextInt();;  
        System.out.println("Which type to numbers to find (even/odd)?");
        readobj.nextLine();
        String decision=readobj.nextLine();
        if(decision.equals("odd"))
            System.out.println("No.of Odd numbers are: "+mypack.staticpack.evenodds.countodds(num,n));
        else if(decision.equals("even"))
            System.out.println("No.of Even numbers are: "+mypack.staticpack.evenodds.countevens(num,n));
        else 
            System.out.println("Invalid type!");
        readobj.close();
    }
}