package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		
		//2, 3, 5, 7, 11, 13, 17, 19.... are prime number
		int num = 11;
		for(int i=2; i<=num; i++)
		{
			if(num%i==0) {
				System.out.println("Given number is not prime");
			}else {
				System.out.println("Given number is prime");
				break;
			}
		}
	}
}
