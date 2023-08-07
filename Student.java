class Student
{
	private String regno;
	private String name;
	private char gender;
	private int yearofStudy;
	private int age;
	
	public Student()
	{
		this.regno="Unknown";
		this.name="Unknown";
		this.gender='-';
		this.yearofStudy=0;
		this.age=0;
	}
	
	public Student(String regno,String name,char gender,int yearofStudy,int age)
	{
		this.regno=regno;
		this.name=name;
		this.gender=gender;
		this.yearofStudy=yearofStudy;
		this.age=age;
	}
	
	public void setYearOfStudy(int setYearOfStudy)
	{
		this.yearofStudy=yearofStudy;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String getRegno()
	{
		return regno;
	}
	
	public String getName()
	{
		return name;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public int getYearOfStudy()
	{
		return yearofStudy;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void displayDetail()
	{
		System.out.println("Registration number : "+this.regno);
		System.out.println("Name : "+this.name);
		System.out.println("Gender : "+this.gender);
		System.out.println("Year of study : "+this.yearofStudy);
		System.out.println("Age : "+this.age);
	}
}