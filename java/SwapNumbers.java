import java.util.Scanner;

class SwapNumbers{
	public static void main(String args[]){
		int x, y, aux;
		Scanner in = new Scanner(System.in);

		System.out.println("Enter x and y");
		x = in.nextInt();
		y = in.nextInt();

		System.out.println("Before Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		aux = x;
		x = y;
		y = aux;

		System.out.println("After Swapping");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}

// Não havia o código no tutorial. Mas tinha a tela do computador. O que é Swap? Achei que deveria ser trocar o número um pelo outro.




