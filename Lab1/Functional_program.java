public class Functional_program {
    private double radius, side, volume, surface_area;

    public Functional_program (double side, double radius)
    {
        this.side = side;
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getside() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // cube
    public double calculate_volume() {
        return volume = Math.pow(side, 3);
    }

    public double calculate_surface_area() {
        return surface_area = 6 * Math.pow(side, 2);
    }

    // sphere
    public double cal_volume() {
        return volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double cal_surface_area() {
        return surface_area = 4 * Math.PI * Math.pow(radius, 2);
    }
    public String toString () {
        return "\n\nSurface area for the Sphere: " + cal_surface_area() + "\nThe volume of a sphere is: " + cal_volume()
        + "\n\nSurface area for the Cube: " + calculate_surface_area() + "\nThe volume of a Cube is: " + calculate_volume();
    }
    
}
