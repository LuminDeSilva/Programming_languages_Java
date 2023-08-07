class myCircle
{
	public static void main(String[] args)
	{
		Cylinder cylinder1=new Cylinder();
		Cylinder cylinder2=new Cylinder("Blue",2.0,10.0);
		
		Cone cone1=new Cone();
		Cone cone2=new Cone("Red",7.0,15.0);
		
		cylinder1.display();
		cylinder2.display();
		cone1.display();
		cone2.display();
		
		cone2.setColor("Green");
		cone2.setRadius(20.0);
		cone2.display();
	}
}