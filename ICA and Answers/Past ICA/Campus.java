class Campus
{
	private String name;
	private String district;
	
	public Campus(String name,String district)
	{
		this.name=name;
		this.district=district;
	}
	
	public void print()
	{
		System.out.println("Name : "+this.name+"\tDistrict : "+this.district);
	}	
}