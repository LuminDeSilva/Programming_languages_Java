class Circle
{
	private double radius;
	private static final double PI=3.14;
	private String color;
	
	public Circle()
	{
		radius=10;
		color="blue";
	}
	
	public Circle(double radius)
	{
		this.radius=radius;
		color="blue";
	}
	
	public Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public double findArea()
	{
		return PI*radius*radius;
	}
	
	public double findCircumference()
	{
		return 2*PI*radius;
	}
}