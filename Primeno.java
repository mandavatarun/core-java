import java.util.*;
public class Primeno {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter starting number :");
		int start = s.nextInt();
		System.out.println("Enter last number :");
		int end = s.nextInt();
		System.out.println("Prime numbers between " +start+ " and " +end);
		for(int j=start;j<end;j++) {
			
			int count=0;
			for(int i=1;i<=j;i++) {
				if(j%i==0) {
					count+=1;
				}
			}
			if(count==2) {
				System.out.println(j);
			}
			
		}
	}

}
