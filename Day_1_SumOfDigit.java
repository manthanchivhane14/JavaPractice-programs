//1. Sum of Digits
// Algorithm:
// 1.start 
// 2.take two variable int num,sum 
// 3.while (num>0) 
// 4.create varible to store rem num%10
// 5.logic----> sum=sum+rem
// 6.remove last number num=num/10
// 7.print---->sum
// 8.End 

package JavaPractice;
import java.util.Scanner;
public class Day_1_SumOfDigit 
{

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter number");
	    int num=sc.nextInt();
	    int sum=0;
	    
	    while(num>0)
	    {
	       int rem=num%10;
	       sum=sum+rem;
	       num=num/10;
	    }
	    System.out.println("Sum :"+sum);
	}
}
