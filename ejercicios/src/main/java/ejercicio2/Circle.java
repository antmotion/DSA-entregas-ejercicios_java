package ejercicio2;

/**
 * Created by carlos on 26/09/2015.
 */
public class Circle extends AbstractShape {
    private double radius;

    public Circle(double radius)
    {
        super("circle");
        this.radius=radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }
}