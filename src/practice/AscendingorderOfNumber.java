package practice;
import java.util.*;

public class AscendingorderOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n,asc=0;
		for(int i=0;i<=9;i++) {
			while(n!=0) {
				int d=n%10;
				if(d==i) {
					asc=(asc*10)+d;
				}
				n=n/10;
			}
			n=temp;
		}
		System.out.println(asc);
		

	}

}
