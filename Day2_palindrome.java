//Palindrome Number
// Algorithm:
// 1.Start 
// 2.take two variable int num and int res and another variable temp=num
// 3.while(num>0)
// 4.create varible to store mod---->num%10
// 5.logic ----> rev*=10+rem 
// 6.remove last digit
// 7.print----> rev
// 8.check if(temp==rev)---->print Palindrome Number
// 9.else---->Not Palindrome Number
// 10.end
//*******************************************************************************/
public class Day2_palindrome {
	public static void main(String[] args) {
		int num=121;
		int rev=0;
		int temp=num;
		
		while(num>0)
		{
		    int last_Digit=num%10;
		    rev=rev*10+last_Digit;
		    num=num/10;
		}
		//System.out.println(rev);
		if(temp==rev)
		{
		    System.out.println("Palindrome Number");
		}
		else{
		    System.out.println("Not Palindrome Number");
		}
	}
	
}


//Dry-Run 
// Iteration 1
// Step-by-step:
// lastDigit = 121 % 10 = 1
// rev = 0 * 10 + 1 = 1
// num = 121 / 10 = 12

// num	       lastDigit	rev
// 121 → 12	       1	    1

// Iteration 2
// lastDigit = 12 % 10 = 2
// rev = 1 * 10 + 2 = 12
// num = 12 / 10 = 1

// num	   lastDigit    	rev
// 12 → 1   	2	        12

// Iteration 3
// lastDigit = 1 % 10 = 1
// rev = 12 * 10 + 1 = 121
// num = 1 / 10 = 0

// num	    lastDigit   	rev
// 1 → 0    	1       	121

