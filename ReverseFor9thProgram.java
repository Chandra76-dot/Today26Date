import java.util.Scanner;

public class ReverseFor {

	public static void main(String[] args) {
		int num=0;
		int reversenum=0;
		System.out.println("Enter your number: ");
		//This statement will capture the user input
		Scanner sc=new Scanner(System.in);
		//captured input would be stored in number num
		num = sc.nextInt();
		/* for loop: No initialization part as num is already
	       * initialized and no increment/decrement part as logic
	       * num = num/10 already decrements the value of num
	       */
		
		for(;num !=0;)
		{
			reversenum = reversenum*10;
			reversenum = reversenum + num%10;
			num = num/10;
			
		}
		System.out.println("Reverse of specified number is: "+reversenum);
			
		

	}

}
