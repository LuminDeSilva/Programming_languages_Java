class Student extends Campus
{
	private String sid;
	private String course;
	
	public Student(String name,String district,String sid,String course)
	{
		super(name,district);
		this.sid=sid;
		this.course=course;
	}
	
	public void print()
	{
		super.print();
		System.out.println("SID : "+this.sid+"\tCourse : "+this.course);
	}
}