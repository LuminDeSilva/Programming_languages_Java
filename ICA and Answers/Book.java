class Book
{
	private String title;
	private double price;
	private int page;
	private Author author;
	
	public Book(String title,double price,int page,Author author)
	{
		this.title=title;
		this.price=price;
		this.page=page;
		this.author=author;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	public int getPage()
	{
		return this.page;
	}
	public Author getAuthor()
	{
		return this.author;
	}
	
	public void setPrice(double price_x)
	{
		this.price=price+price_x;
	}
	
	public void display()
	{
		System.out.println("Title:"+this.title+"\tPrice:"+this.price+"\tPage:"+this.page);
		System.out.println("Author's Detail:");
		author.display();
	}
}