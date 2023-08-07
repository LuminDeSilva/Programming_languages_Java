class Book
{
	private String title;
	private String author;
	private int noOfpages;
	private double price;
	
	public Book()
	{
		this.title="No title";
		this.author="No author";
		this.noOfpages=0;
		this.price=0;
		System.out.println("This is the constructor Book()...");
	}
	
	public Book(String title,String author,double price)
	{
		this.title=title;
		this.author=author;
		this.noOfpages=0;
		this.price=price;
	}
	
	public Book(String title,String author,double price,int noOfpages)
	{
		this.title=title;
		this.author=author;
		this.noOfpages=noOfpages;
		this.price=price;
	}
	
	public void setNoOfPages(int noOfpages)
	{
		this.noOfpages=noOfpages;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public int getNoOfPages()
	{
		return this.noOfpages;
	}
	
	public void displayBook()
	{
		System.out.println("Title : "+this.title);
		System.out.println("Author : "+this.author);
		System.out.println("No of pages : "+this.noOfpages);
		System.out.println("Price : "+this.price);
	}
}