package lab1;

public class Rectangle {
	
	public double area(double length,double breadth)
	{		
		return length * breadth;
	}	
	public double perimeter(double length,double breadth)
	{
		return 2* (length + breadth);
	}	

public static void main(String[] args)
{
	Rectangle r = new Rectangle();
	double area = r.area(12.3,6.5);
	System.out.println(" Area of Rectangle is:"+area);
	double perimeter = r.perimeter(12.3,6.5);
	System.out.println(" perimeter of Rectangle is:"+perimeter);
}

}
