package week1.day1;

//Displaying the generated Fibonacci series as the program output – 0, 1, 1, 2, 3, 5, 8, and 13. 

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, sum=0;
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2; i<8; i++) 
		{
			sum=a+b; //0+1
			System.out.println(" "+sum); //0 1 1
			a=b; // 1=1, 
			b=sum; //1=0 again looping 1+1=2, sum will print 2
		}
	}

}
