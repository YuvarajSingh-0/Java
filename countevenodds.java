//Finding number of odd and even numbers. It's been a hell of a problem... uff!
import java.util.Scanner;
//import mypack.staticpack.*; (No need to import package for static packs.)
public class CountEvenOdds{
        public static void main(String[] args){
        Scanner readobj=new Scanner(System.in);
        int[] num=new int[100];    
        System.out.println("No.of numbers to be inputed are: ");
        int n=readobj.nextInt(); //number of numbers to be inputed
        System.out.println("Enter the numbers: ");
        for(int i=0;i<n;i++)
            num[i]=readobj.nextInt();
        System.out.println("No.of Even numbers are: "+mypack.staticpack.evenodds.countevens(num,n));
        System.out.println("No.of odd numbers are: "+mypack.staticpack.evenodds.countodds(num,n));
        readobj.close(); //Don't know why to keep but prevents obj leakage -_-
        }
}