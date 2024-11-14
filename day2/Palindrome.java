package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 121;
		int originalnum = num;
		int a = 12345;
		int reverse = 0;
		
		for(; num>0 ; num=num/10) {
			
			int rem = num%10;
			reverse = reverse*10 + rem;
		}
		
		if(originalnum == reverse) {
			System.out.println("Given number is palindrome:" + originalnum);
		}
		else {
			System.out.println("Given number is not palindrome:" + a);
		}
		
		
	}	

}
