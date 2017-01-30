import java.util.Scanner;

class MultiplicationTable{
	public static void main(String args[])
	{
		int n,c;

		System.out.println("Enter a integer to print it's multiplication table");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.println("Multiplication table of " + n + " is :-");
		for(c=1;c<=10;c++)
			{
				System.out.println(n + " * " + c + " = " + (n*c));
			}

// How to do? This repetition control structure, does not elegant. It has many blank line and the multiply number all one digit number by integers.
//		for(n=1; n<10; n++)
//		{
//			for(c=1;c<11;c++)
//			{
//				System.out.println(n*c);
//				System.out.println();
//			}
//		}
	}
}
 
