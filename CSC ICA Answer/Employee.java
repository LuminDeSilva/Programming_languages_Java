class Employee
{
	private String employeeName;
	private int age;
	private static int employeeCount=0;
	
	public Employee()
	{
		this.employeeName="Unknown";
		this.age=0;
		employeeCount++;
	}
	
	public Employee(String employeeName,int age)
	{
		this.employeeName=employeeName;
		this.age=age;
		employeeCount++;
	}
	
	public String  getName()
	{
		return employeeName;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String employeeName)
	{
		this.employeeName=employeeName;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void display()
	{
		System.out.println("Employee name : "+this.employeeName);
		System.out.println("Employee age : "+this.age);
		System.out.println("Employee count : "+this.employeeCount);
	}
	
}