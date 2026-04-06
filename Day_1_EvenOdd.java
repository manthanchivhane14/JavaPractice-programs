//Even/Odd
// Algorithm:
// 1.Start 
// 2.take one variable int num 
// 3.check condition if num%2==0----->print Even
// 4.else ----> print Odd
// 5.End 
package JavaPractice;
import java.util.Scanner;
public class Day_1_EvenOdd
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		//int num=12;
		
		if(num%2==0)
		{
		    System.out.println("Number is even: "+num);
		}
		else{
		    System.out.println("Number is Odd: "+num);
		}
	}
}
