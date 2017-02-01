import java.util.*;
class PrimeNo{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no to test wheater its PRIME:");
	int n = sc.nextInt();
	int b = 2;
	if(n==2){
		System.out.println("It is a prime no");
	}
	else{
		while((n%b!=0) && (n-1>b))	/*No tutorial estava digitado o nome do operador lógico: 'and' */
		{
			b++;
		}
		if(n == 1){
			System.out.println("Not a prime no");
		}
		else{
			if(n%b == 0){
				System.out.println("Not a prime no!" + " Since Divisible by: " + b);
			}
			else{
				System.out.println("It is a prime no!");
			}
		}
	}
}
}

