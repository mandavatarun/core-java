import java.util.Scanner;
public class top2maxno {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);	
		System.out.println("Enter n value");
		int n= s.nextInt();
		int max=0,smax=0,num=0;
		System.out.println("Enter "+n+"values");
		for(int i=1;i<=n;i++) {
			num=s.nextInt();
			if(max<num) {
				smax=max;
				max=num;
			}
			else if(smax<num) {
				smax=num;
			}
		}
		System.out.println("max value is :"+max);
		System.out.println("Second max value is :"+smax);
	}
}
