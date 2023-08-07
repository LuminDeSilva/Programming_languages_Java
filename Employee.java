class Employee
{
	private String empName;
	private String empId;
	private double empSalary;
	public Employee()
	{
		this.empName="Unknown";
		this.empId="Unknown";
		this.empSalary=0;
	}
	
	public Employee(String empId,String empName)
	{
		this.empName=empName;
		this.empId=empId;
		this.empSalary=0;
	}
	
	public Employee(String empId,String empName,double empSalary)
	{
		this.empName=empName;
		this.empId=empId;
		this.empSalary=empSalary;
	}
	
	//setter and getter methods for salary
	public String getEmpName()
	{
		return this.empName;
	}
	
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	
	public String getEmpID()
	{
		return this.empId;
	}
	
	public void setEmpID(String empId)
	{
		this.empId=empId;
	}
	
	public double getEmpSalary()
	{
		return this.empSalary;
	}
	
	public void setEmpSalary(double empSalary)
	{
		this.empSalary=empSalary;
	}
	
	public void displayEmployee()
	{
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Salary : "+empSalary);
	}
}