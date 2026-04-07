 //largest 3 number 
//Algorithm:
// 1. Start
// 2. Take 3 numbers (a, b, c)
// 3. If a > b and a > c → print a
// 4. Else if b > c → print b
// 5. Else → print c
// 6. End

//*******************************************************************************/
public class Day_2_largest_3_number 
{

	public static void main(String[] args) {
		int a=60;
		int b=20;
		int c=30;
		
		if(a>b && a>c)
		{
		    System.out.println("A is larger: "+a);
		}
		else if(b>c)
		{
		    System.out.println("B is larger: "+b);
		}
		else{
		    System.out.println("c is larger: "+c);
		}
	}
}


