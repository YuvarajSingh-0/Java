import java.util.Scanner;
class lastdigit{
	public static void main(String[] args){
		Scanner obj=new Scanner(System.in);
		int num=obj.nextInt();
		int i=1;
		while(i<3){
		   if(num<0)
			   num=num*(-1);
		   int r=num%10;
		   System.out.println(i+"st Last digit is: "+r);
		   num=num/10;
		   i++;
		}
		obj.close();  //I don't know why this statement should help clear the warning -_-
	}
}