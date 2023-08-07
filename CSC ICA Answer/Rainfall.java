import java.util.Scanner;

class Rainfall
{
	public static void main(String[] args)
	{
		double[] rain=new double[7];
		Scanner reader=new Scanner(System.in);
		double sum=0;
		double high=0;
		
		for(int i=0;i<7;i++)
		{
			System.out.print("Enter the rainfall of "+(i+1)+" : ");
			rain[i]=reader.nextDouble();
			if(rain[i]>high)
			{
				high=rain[i];
			}
			sum=sum+rain[i];
		}
		double average=sum/7;
		
		System.out.println("\nThe highest rainfall : "+high+"\nAverage rainfall : "+average);
	}
}