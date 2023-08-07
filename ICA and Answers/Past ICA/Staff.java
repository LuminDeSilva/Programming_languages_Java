class Staff extends Campus
{
	private String designation;
	private String nic;
	private int experience;
	private double basicSalary;
	private final int allowance=1000;
	
	public Staff(String name,String district,String designation,String nic,int experience,double basicSalary)
	{
		super(name,district);
		this.designation=designation;
		this.nic=nic;
		this.experience=experience;
		this.basicSalary=basicSalary;
	}
	
	public double getSalary()
	{
		return (this.basicSalary+this.basicSalary*0.1+this.allowance);
	}
}