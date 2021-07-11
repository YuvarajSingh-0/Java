import java.util.Scanner;
class sumofdigits{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int org=num;
		int sum=0;
		while(num>0){
			int r=num%10;
			sum+=r;
			num=num/10;
		}
		System.out.print("Sum of digits in "+org);
		System.out.println(": "+sum);
		obj.close();
	}
}