package mypack.nonstaticpack;
public class EvenOdds {
    public int countevens(int[] a, int size){
        int ecount=0;
            for(int i=0;i<size;i++)
               if(a[i]%2==0)
                  ecount++;
            return ecount;
    }
    public int countodds(int[] b, int size){
        int ocount=0;
            for(int i=0;i<size;i++)
               if(b[i]%2!=0)
                  ocount++;
            return ocount;
    }
}
/*final class isperfect {
    public isperfect(int n){
        int sum=0;
        for(int i=1;i<n;i++)
            if(n%i==0)
                sum+=i;
        if(sum==n)
            System.out.println("Sunny Number");
            //return true;
        else
             System.out.println("Not a sunny nummber");
            //return false;
    }
}*/