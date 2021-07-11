import java.util.*;
import mypack.nonstaticpack.ispalindromepossible;
public class palindrome {
    public static void main(String[] args){
        Scanner readobj=new Scanner(System.in);
        int num=readobj.nextInt();
        ispalindromepossible palindromecheck=new ispalindromepossible(); //Creating object.
        System.out.println(palindromecheck.ispalindromepossible(num));
        readobj.close();
    }
    /*public static boolean ispalindromepossible(int n){
        int[] digit=new int[10];
        int no_of_digits=0;
        Arrays.fill(digit,0);
        while(n>0){
            int r=n%10;
            digit[r]++;
            n=n/10;
            no_of_digits++;
        }
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<10;i++){
            if(digit[i]%2!=0)
                oddcount++;
            else if(digit[i]%2==0 && digit[i]!=0)
                evencount++;
        }
        if(no_of_digits%2!=0){
            if(oddcount==1)
                return true;
        }
        if(evencount==(no_of_digits/2))
            return true;
        return false;
    }*/
}