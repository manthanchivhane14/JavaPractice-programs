
//Reverse number
// Algorithm:
// 1.Start 
// 2.take two variable int num and int res and another variable temp=num
// 3.while(num>0)
// 4.create varible to store mod---->num%10
// 5.logic ----> rev*=10+rem 
// 6.remove last digit 
// 7.print----> rev
// 8.end
//******************************************************************************
package JAVAPRACTICE;
import java.util.Scanner;
public class Day_1_Reverse
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number");
	int input=sc.nextInt();
	
// 		int input=123345;
		int rev=0;
		
		while(input>0)
		{
		    int rem=input%10;
		    rev=rev*10+rem;
		    input=input/10;
		}
		System.out.println("Rev :"+rev);
	}
}
