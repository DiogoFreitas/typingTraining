import java.util.Scanner;

class CircleDemo{

//Scanner sc = new Scanner(System.in);

public static void main(String args[]){

Scanner sc = new Scanner(System.in);


System.out.print("Enter the radius: ");
/* We are storing the entered radius in double * because a user can enter radius in decimals*/
double radius=sc.nextDouble();
// Area = PI * radius

double area = Math.PI *(radius*radius);
System.out.println("The area of circle is: " + area);

}
}
 
