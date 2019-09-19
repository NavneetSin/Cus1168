// subclass
public class Sphere extends Shape  {
	private double radius;

	public Sphere() {

	}

	public Sphere(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
    @Override
	public double surface_area() {
		return 4 * Math.PI * radius * radius;
	}

	@Override
	public double volume() {

		return (4.0 / 3.0) * (Math.PI * radius * radius);
	}
	public String toString() {
		return "\n\nSurface area for the sphere: " + surface_area() + "\nThe volume of a sphere is: " + volume();
	}

}
