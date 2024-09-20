//import stuff here!
import java.util.Scanner;

public class Program6{
    public static void main(String[] args){
        
        //declare variables and create scanner
        double radius = 0;
        double diameter = 0;
        double area = 0;
        double circumference = 0;
        final double pi = 3.14159;
        
        Scanner circleScanner = new Scanner(System.in);
        
        //get user input
        System.out.println("Enter the radius ");
        radius = circleScanner.nextDouble();

        //calculate
        diameter = 2*radius*1000;
        area = pi*(radius*radius)*1000;
        circumference = pi*diameter;
     
        //print 
        System.out.println("The radius of the circle is " + (int)radius/1000.0);
        System.out.println("The diameter of the circle is " + (int)diameter/1000.0);
        System.out.println("The area of the circle is " + (int)area/1000.0);
        System.out.println("The circumference of the circle is " + (int)circumference/1000.0);

    }
}
//Your code here

//Paste console output below:
/*

Enter the radius 
3.712
The radius of the circle is 0.003
The diameter of the circle is 7.424
The area of the circle is 43.287
The circumference of the circle is 23.323

*/
