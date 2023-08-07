class Car
{
	private String serialNumber;
	private String manufacturer;
	private String color;
	private Person owner;
	
	public Car(String serialNumber,String manufacturer,String color,Person owner)
	{
		this.owner=owner;
		this.serialNumber=serialNumber;
		this.manufacturer=manufacturer;
		this.color=color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void setOwner(Person owner)
	{
		this.owner=owner;
	}
	
	public void display()
	{
		owner.display();
		System.out.println("Serial Number : "+this.serialNumber);
		System.out.println("Manufacturer : "+this.manufacturer);
		System.out.println("Color : "+this.color);
	}
}