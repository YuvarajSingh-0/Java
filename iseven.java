import java.util.Scanner;

class IsEven{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int r=num%2;
		if(r==0)
			System.out.println("Even");
		else
		    System.out.println("Odd");
		obj.close();  //I don't know why this statement should help clear the warning -_-
	}
}