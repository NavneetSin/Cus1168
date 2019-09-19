// subclass
public class Cube extends Shape  {
	private double side;

	public Cube() {

	}

	public Cube(double side) {
		this.side = side;
	}

	public double getside() {
		return side;
	}

	public void setside(double side) {
		this.side = side;
	}

     @Override
	public double surface_area() {
		return 6 * side * side;
	}
    @Override
	public double volume() {

		return side * side * side;
	}
	public String toString() {
		return "\n\nSurface area for the cube: " + surface_area() + "\nVolume of cube: " + volume();
	}

}
