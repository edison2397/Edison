package javapractiseprogram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			    int num=1234;
			    int reversed = 0;
			    
			    System.out.println("Original Alphabets: " + num);

			    // run loop until num becomes 0
			    while(num!= 0) {
			    
			      // get last digit from num
			      int digit = num % 10;   //1234%10==0
			      reversed = reversed * 10 + digit;//0*10+1234

			      // remove the last digit from num
			      num/= 10;
			    }

			    System.out.println("Reversed Number: " + reversed);
			  }
			}


