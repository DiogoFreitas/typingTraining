import java.util.Scanner;

class AreaOfRectangule{

public static void main(String args[]){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the lenght of Rectangule:");

double lenght = scanner.nextDouble();

System.out.println(" Enter the with of Rectangule:");

double width = scanner.nextDouble();

// Area = lenght * with.

double area = lenght*width;

System.out.println("Area of Rectangle is: " + area);
}
}

