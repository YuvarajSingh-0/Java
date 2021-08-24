package mypack.staticpack;
public class DigitsCount {
    public static int digitcount(int n) {
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int uniquecount(int n) {
        int digit[]={0,0,0,0,0,0,0,0,0,0},r=0,count=0;
        while(n>0){
            r=n%10;
            digit[r]++;
            n=n/10;
        }
        for(int i=0;i<digit.length;i++)
            if(digit[i]>=1)
                count++;
        return count;
    }
    public static int nonrepeatedcount(int n) {
        int digit[]={0,0,0,0,0,0,0,0,0,0},r=0,count=0;
        while(n>0){
            r=n%10;
            digit[r]++;
            n=n/10;
        }
        for(int i=0;i<digit.length;i++)
            if(digit[i]==1)
                count++;
        return count;
    }
}