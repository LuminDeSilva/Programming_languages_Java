import java.util.Scanner;

class BMI
{
	public static void main(String[] args)
	{
		Scanner reader=new Scanner(System.in);
		System.out.print("Enetr your weight in pounds : ");
		double weight=reader.nextDouble();
		System.out.print("Enetr your height in inches : ");
		double height=reader.nextDouble();
		
		weight=weight*0.48359237;
		height=height*0.0264;
		
		double bmi=weight/(height*height);
		
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi>=18.5 && bmi<25)
		{
			System.out.println("Normal");
		}
		else if(bmi>=25 && bmi<30)
		{
			System.out.println("OverWeight");
		}
		else
		{
			System.out.println("Obesity");
		}
		
	}
}