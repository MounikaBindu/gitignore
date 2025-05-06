package practice;

public class DigitcountNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=0;i<=9;i++) {
//			int n=312531;
//			int c=0;
//			while(n!=0) {
//				int d=n%10;
//				if(d==i) {
//					c++;
//				}
//				n=n/10;
//			}
//			if(c!=0) {
//				System.out.println(i+"-->"+c);
//			}
//		}
		int asc=0;
		for(int i=0;i<=9;i++) {
			int n=526641;
			while(n!=0) {
				int d=n%10;
				if(i==d) {
					asc=(asc*10)+d;
					
				}
				n=n/10;
			}
		}
		System.out.println(asc);

	}

}
