class Cylinder extends Circle
{
	private double height;
	
	public Cylinder()
	{
		super();
		this.height=1.0;
	}
	
	public Cylinder(double radius)
	{
		super(radius);
		this.height=1.0;
	}
	
	public Cylinder(double radius,double height)
	{
		super(radius);
		this.height=height;
	}
	
	public Cylinder(String color,double radius,double height)
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
		return super.getArea()*height;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Height : "+this.height);
	}
}