import java.util.Scanner;
public class TDArr{
     Scanner s=new Scanner(System.in);
	 void read(int a[][],int r,int c)
	 {
	    for(int i=0;i<r;i++)
		{
		   for(int j=0;j<c;j++)
		     a[i][j]=s.nextInt();
		}
	}
	int[][] add(int a[][],int b[][],int r, int c)
    {
	   int rs[][]=new int[r][c];
	   for(int i=0;i<r;i++)
	   {
	      for(int j=0;j<c;j++)
		  rs[i][j]=a[i][j]+b[i][j];
	   }
	   return rs;
	}
	void disp(int a[][])
	{
	   for(int i=0;i<a.length;i++)
	   {
	     for(int j=0;j<a[i].length;j++)
		   System.out.print(a[i][j]+"\t");
		 System.out.println();
	   }
	}
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       TDArr o=new TDArr();
       int r=s.nextInt();
       int c=s.nextInt();
       int a[][]=new int[r][c];
       int b[][]=new int[r][c];
       o.read(a,r,c);
       o.read(b,r,c);
       int ans[][];
       ans=o.add(a,b,r,c);
       System.out.println("A matrix");
       o.disp(a);
       System.out.println("B matrix");
       o.disp(b);
       System.out.println("Result");
       o.disp(ans);
	   s.close();
    }
}	