package inheritanceshape;
import java.util.*;
public abstract class Shape {
	protected double width;
	protected double length;
	protected double radius;
	protected Scanner sc;
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String getType();
}
