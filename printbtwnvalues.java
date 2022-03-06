import java.util.*;
public class printbtwnvalues {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the start value :");
		int start = s.nextInt();
		System.out.println("Enter the stop value :");
		int stop = s.nextInt();
		for (int i=start+1;i<stop;i++) {
			System.out.print(+i+" ");
		}
	}
}
