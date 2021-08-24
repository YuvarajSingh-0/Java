package mypack.nonstaticpack;
public class SpecialPin {
	public SpecialPin(int input1,int input2,int input3){
		int f[]=new int[3],s[]=new int[3],t[]=new int[3],r[]=new int[3],l[]=new int[1],pin;
	    for(int i=0;i<3;i++){
	    	f[i]=input1%10;
	    	input1=input1/10;
	    }
	    for(int i=0;i<3;i++){
	    	s[i]=input2%10;
	    	input2=input2/10;
	    }
	    for(int i=0;i<3;i++){
	    	t[i]=input3%10;
	    	input3=input3/10;
	    }
	    for(int i=0;i<3;i++){
	    	if(f[i]<=s[i] && f[i]<=t[i])
	    	    r[i]=f[i];
	    	if(s[i]<=f[i] && s[i]<=t[i])
	    	    r[i]=s[i];
	    	if(t[i]<=f[i] && t[i]<=s[i])
	    	    r[i]=t[i];
	    	if(f[i]>=s[i] && f[i]>=t[i] && f[i]>=l[0])
	    	    l[0]=f[i];
	    	if(s[i]>=f[i] && s[i]>=t[i] && s[i]>=l[0])
	    	    l[0]=s[i];
	    	if(t[i]>=f[i] && t[i]>=s[i] && t[i]>=l[0])
	    	    l[0]=t[i];
        }
		pin=(l[0]*1000)+(r[2]*100)+(r[1]*10)+(r[0]);
		System.out.println("Created pin: "+pin);
	}
}