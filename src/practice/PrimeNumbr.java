package practice;

public class PrimeNumbr {
	public static void main(String[] args) {
		int n=3;
		if(isPrime(n)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
		
	}
	public static boolean isPrime(int m) {
		if(m<2) return false;
		for(int i=2;i<m/2;i++) {
			if(m%i==0) return false;
		}
		return true;
		
	}

}
