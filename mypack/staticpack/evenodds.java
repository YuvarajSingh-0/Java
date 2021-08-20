package mypack.staticpack;
public class evenodds{
    public static int countevens(int[] a, int size){
        int ecount=0;
            for(int i=0;i<size;i++)
               if(a[i]%2==0)
                  ecount++;
            return ecount;
    }
    public static int countodds(int[] b, int size){
        int ocount=0;
            for(int i=0;i<size;i++)
               if(b[i]%2!=0)
                  ocount++;
            return ocount;
    }
}