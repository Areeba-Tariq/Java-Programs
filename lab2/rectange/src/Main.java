class Rectangle
{
    private double length;
    private double width;
    public Rectangle(double l,double w)
    {
        length=l;
        width=w;
    }
    public Rectangle()
    {
        length=0.0;
        width=0.0;
    }
    public double calculateArea()
    {
        return length*width;
    }
    public double calculatePerimeter()
    {
        return 2*(length+width);
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(1.0,2.2);
        System.out.println("Area=" +r1.calculateArea());
        System.out.println("Perimeter= "+r1.calculatePerimeter());
    }
}