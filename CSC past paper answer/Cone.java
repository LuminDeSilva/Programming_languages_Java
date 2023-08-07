class Cone extends Circle
{
	private double height;
	
	public Cone()
	{
		super();
		this.height=1.0;
	}
	
	public Cone(double radius)
	{
		super(radius);
		this.height=1.0;
	}
	
	public Cone(double radius,double height)
	{
		super(radius);
		this.height=height;
	}
	
	public Cone(String color,double radius,double height)
	{
		super(color,radius);
		this.height=height;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public void setHeight(double height)
	{
		this.height=height;
	}
	
	public double getVolume()
	{
		return ((1/3)*super.getArea()*height);
	}
	
	public void display()
	{
		super.display();
		System.out.println("Height : "+this.height);
	}
}