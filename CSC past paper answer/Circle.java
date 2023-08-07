class Circle
{
	private String color;
	private double radius;
	private final double PI=3.14;
	
	public Circle()
	{
		this.radius=1.0;
		this.color="Red";
	}
	
	public Circle(double radius)
	{
		this.radius=radius;
		this.color="Red";
	}
	
	public Circle(String color,double radius)
	{
		this.color=color;
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public double getArea()
	{
		return PI*radius*radius;
	}
	
	public void display()
	{
		System.out.println("Radius : "+this.radius);
		System.out.println("Color : "+this.color);
	}
}