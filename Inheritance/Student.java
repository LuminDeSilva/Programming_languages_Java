class Student extends Person
{
	private String regno;
	private int yearofStudy;
	
	public Student()
	{
		super();
		this.regno="Unknown";
		this.yearofStudy=0;
	}
	
	public Student(String regno,String name,char gender,int yearofStudy,int age)
	{
		super(name,gender,age);
		this.regno=regno;
		this.yearofStudy=yearofStudy;
	}
	
	public void setYearOfStudy(int setYearOfStudy)
	{
		this.yearofStudy=yearofStudy;
	}
	
	public void setRegno(String regno)
	{
		this.regno=regno;
	}
	
	public String getRegno()
	{
		return regno;
	}
	
	public int getYearOfStudy()
	{
		return yearofStudy;
	}
	
	public void displayDetail()
	{
		//super.displayDetail();
		System.out.println("Registration number : "+this.regno);
		System.out.println("Year of study : "+this.yearofStudy);
	}
}