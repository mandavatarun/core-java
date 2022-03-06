import java.util.*;
public class sumofevenodddigitsinnum {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = s.nextInt();
		int digit=0,even=0,odd=0;
		while(n>0) {
			digit = n%10;
			if(digit%2==0) {
				even+=digit;
			}
			else {
				odd+=digit;
			}
			n=n/10;
			
		}
		System.out.println("The sum of even digits in number is :"+even);
		System.out.println("The sum of odd digits in number is :"+odd);

	}
}
