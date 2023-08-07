class Person
{
	private String name;
	private int age;
	private char gender;
	
	public Person(String name,char gender,int age)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void display()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Gender : "+this.gender);
		System.out.println("Age : "+this.age);
	}
}