
/**
 * Program to calculate the area of circle
 *
 * @author (Slesha)
 * @version (28/08/2023)
 */

import java.util.Scanner;
public class CircleArea
{
    // instance variables - replace the example below with your own
    //private double radius;
    private double area;

    /**
     * Constructor for objects of class CircleArea
     */
    public CircleArea()
    {
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        
        CircleArea circle1 = new CircleArea();
        circle1.getArea(radius);
    }
    
    /**
     * Method to get area
     *
     * @param  radius  Radius of the circle
     * @return    the radius of circle
     */
    public void getArea(double radius)
    {
        this.area = radius * radius * 3.14;
        System.out.println("The area of the circle = " + this.area);
    }
}
