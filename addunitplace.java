//One of the most Satisfying Problem at the beginning stage :-) 
import java.util.Scanner;
public class AddUnitPlace {
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int num1=obj.nextInt();
		int num2=obj.nextInt();
		int result=addlastdigits(num1,num2);
		System.out.println("Sum of last digits of given numbers: "+result);
		obj.close(); //I don't know why this statement should help clear the warning -_-
	}
	public static int addlastdigits(int a1, int a2){
		int ld1=lastdigit(a1);
		int ld2=lastdigit(a2);
		return ld1+ld2;
	}
	public static int lastdigit(int b){
		if(b<0)
			   b=b*(-1);
		return b%10;
    }
}
