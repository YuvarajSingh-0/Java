import java.util.Scanner;
public class nthprime {
    public static void main(String[] args){
        Scanner readobj=new Scanner(System.in);
        int n=readobj.nextInt();
        int count=0,p=0;
        for(int i=2;i<10000;i++){
            count=0;
            for(int j=2;j<i;j++)
                if(i%j==0)
                    count=count+1;
            if(count==0)
                p=p+1;
            if(p==n){
                System.out.println(i);
                break;
            }
        }
        readobj.close();
    }
}