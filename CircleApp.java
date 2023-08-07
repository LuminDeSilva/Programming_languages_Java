class CircleApp
{
	public static void main(String[] args)
	{
		Circle circle1=new Circle();
		Circle circle2=new Circle(7.7);
		Circle circle3=new Circle(14.7,"Green");
		
		System.out.println("The area of Circle with radius 10 = "+circle1.findArea());
		System.out.println("The circumference of Circle with radius 10 = "+circle1.findCircumference());
		System.out.println("The color of Circle with radius 10 = "+circle1.getColor());
		circle1.setColor("Red");
		System.out.println("The color of Circle with radius 10 = "+circle1.getColor());
		
		System.out.println("The area of Circle with radius 7.1 = "+circle2.findArea());
		System.out.println("The circumference of Circle with radius 7.1 = "+circle2.findCircumference());
		
		System.out.println("The area of Circle with radius 14.7 = "+circle3.findArea());
		System.out.println("The circumference of Circle with radius 14.7 = "+circle3.findCircumference());
		System.out.println("The color of Circle with radius 14.7 = "+circle3.getColor());
		circle3.setColor("Yellow");
		System.out.println("The color of Circle with radius 14.7 = "+circle3.getColor());
	}
}