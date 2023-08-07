class Student
{
	private String name;
	private String regno;
	private char gender;
	private int yearofstudy;
	private int age;
	
	public  Student(String regno,String name,char gender,int yearofstudy,int age)
	{
		this.regno=regno;
		this.name=name;
		this.gender=gender;
		this.yearofstudy=yearofstudy;
		this.age=age;
	}
	
	public void setYearofstudy(int yearofstudy)
	{
		this.yearofstudy=yearofstudy;
	}
	
	public String getRegno()
	{
		return this.regno;
	}
	public String getName()
	{
		return this.name;
	}
	public char getGender()
	{
		return this.gender;
	}
	public int getYearofstudy()
	{
		return this.yearofstudy;
	}
	public int getAge()
	{
		return this.age;
	}
	
	public void display()
	{
		System.out.println("Regno:"+this.regno+"\tName:"+this.name+"\tGender:"+this.gender+"\nYear of Study:"+this.yearofstudy+"\tAge:"+this.age);
	}
}