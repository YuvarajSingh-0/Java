import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args){
        Scanner readobj=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=readobj.nextInt();
        IsPrime primeobj=new IsPrime();
        primeobj.prime(num);
        readobj.close();
    }
    public void prime(int n) {
        int temp=0;
        for(int i=2;i<=(n/2);i++){
            if(n%i==0)
                temp++;
            if(temp>0)
                break;
        }
        if(temp>0)
            System.out.println(n+" is not a prime number.");
        else
            System.out.println(n+" is a prime number.");
    }
}