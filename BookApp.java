class BookApp
{
	public static void main(String arg[])
	{
		Book book1=new Book();
		book1.displayBook();
		Book book2=new Book("Introduction to Java","David Cameron",700);
		book2.displayBook();
		book2.setNoOfPages(650);
		book2.displayBook();
		Book book3=new Book("Introduction to C#","Nilson Carol",800,900);
		book3.displayBook();
		book3.setPrice(1500);
		book3.displayBook();
	}
}
/*

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>javac Book.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>javac BookApp.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>java BookApp
This is the constructor Book()...
Title : No title
Author : No author
No of pages : 0
Price : 0.0
Title : Introduction to Java
Author : David Cameron
No of pages : 0
Price : 700.0
Title : Introduction to Java
Author : David Cameron
No of pages : 650
Price : 700.0
Title : Introduction to C#
Author : Nilson Carol
No of pages : 900
Price : 800.0
Title : Introduction to C#
Author : Nilson Carol
No of pages : 900
Price : 1500.0

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>

*/