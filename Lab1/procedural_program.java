import java.util.*;
public class procedural_program
{
    public static void main(String[] args)
        {
            double radius = 1;
            double volume_sphere = (4/3)* Math.PI * (radius*radius*radius);  
            System.out.println("The volume of the Spehere is: " + volume_sphere);

            double surface_sphere = 4 * Math.PI * (radius*radius);
            System.out.println("The surface area of a Sphere is: " + surface_sphere);

            double side1 = 3;
            double side2 = 5;
            double side3 = 4;
            double volume_cube = side1 * side2 * side3; 
            System.out.println("the Volume of the Cube is " + volume_cube);

            double surface_cube = 6 * (side1 * side2); 
            System.out.println("the Surface area of a Cube is " + surface_cube);



        }
}