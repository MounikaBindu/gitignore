package practice;
import java.util.*;

public class Armstrong {
	public static void main(String[] args) {
		int n=153;
		int sum=0;
		while(n!=0) {
			int d=n%10;
			int p=1;
			for(int i=0;i<3;i++) {
				p=p*d;
			}
		     sum=sum+p;
		     n=n/10;
		}
		System.out.println(sum);
	}

}
