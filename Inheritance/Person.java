class Person
{
	
	private String name;
	private char gender;
	private int age;
	
	public Person()
	{
		this.name="Unknown";
		this.gender='-';
		this.age=0;
	}
	
	public Person(String name,char gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public char getGender()
	{
		return gender;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void displayDetail()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Gender : "+this.gender);
		System.out.println("Age : "+this.age);
	}

}