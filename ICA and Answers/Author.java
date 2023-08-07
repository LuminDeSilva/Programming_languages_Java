class Author
{
	private String name;
	private char gender;
	private int age;
	
	public Author(String name,char gender,int age)
	{
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	public char getGender()
	{
		return this.gender;
	}
	
	public void display()
	{
		System.out.println("Name:"+this.name+"\tSex:"+this.gender+"\tAge:"+this.age);
	}
}