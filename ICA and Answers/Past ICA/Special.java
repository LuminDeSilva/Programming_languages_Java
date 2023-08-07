class Special extends Student
{
	private double gpa1;
	private double gpa2;
	private double gpa3;
	private double gpa4;
	private String result;
	private Student student;
	
	public Special(String name,String district,String sid,String course,double gpa1,double gpa2,double gpa3,double gpa4)
	{
		super(name,district,sid,course);
		this.gpa1=gpa1;
		this.gpa2=gpa2;
		this.gpa3=gpa3;
		this.gpa4=gpa4;
	}
	
	public String getFinalResult()
	{
		double sum=(gpa1+gpa2+gpa3+gpa4)/4;
		if(sum>=3.7)
			return "First Class";
		else if(sum<3.7 && sum>=3.30)
			return "Second Class(Upper Division)";
		else if(sum<3.30 && sum>=3.0)
			return "Second Class(Lower Division)";
		else 
			return "Pass";
	}
}