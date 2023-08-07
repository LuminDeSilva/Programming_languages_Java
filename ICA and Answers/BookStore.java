class BookStore
{
	public static void main(String[] args)
	{
		Author author1=new Author("D.R.David",'M',40);
		Author author2=new Author("K.N.Irfhan",'M',45);
		Author author3=new Author("T.K.M.Kumari",'F',36);
		Author author4=new Author("S.Y.Nimali",'F',32);
		Author author5=new Author("L.Ramanan",'M',30);
		
		Book book1=new Book("Introduction to Java",2000,340,author2);
		Book book2=new Book("Object-Oriented Design",2500,500,author4);
		Book book3=new Book("Object-Oriented Design",1800,300,author1);
		Book book4=new Book("Introduction to C",1500,250,author5);
		Book book5=new Book("Java Script for Beginners ",1700,550,author3);
		
		Author[] authors=new Author[5];
		authors[0]=author2;
		authors[1]=author4;
		authors[2]=author1;
		authors[3]=author5;
		authors[4]=author3;
		
		Book[] books=new Book[5];
		books[0]=book1;
		books[1]=book2;
		books[2]=book3;
		books[3]=book4;
		books[4]=book5;
		
		System.out.println("######################################################################################################");
		System.out.println("The details of all books:");
		for(int i=0;i<5;i++)
		{
			books[i].display();
		}
		
		
		System.out.println("######################################################################################################");
		System.out.println("The details of all books which are written by female authors:");
		for(int i=0;i<5;i++)
		{
			if(authors[i].getGender()=='F')
			{
				books[i].display();
			}
		}
		
		
		System.out.println("######################################################################################################");
		System.out.println("The details of all books which are written by youngest author:");
		int young=authors[0].getAge();
		int index=0;
		for(int i=0;i<5;i++)
		{
			if(authors[i].getAge()<young)
			{
				young=authors[i].getAge();
				index=i;
			}
		}
		books[index].display();
		
		
		System.out.println("######################################################################################################");
		System.out.println("The details of all books:");
		for(int i=0;i<5;i++)
		{
			if(books[i].getPage()<500)
			{
				books[i].setPrice(books[i].getPrice()*0.2);
			}
			else
			{
				books[i].setPrice(books[i].getPrice()*0.1);
			}
		}
		for(int i=0;i<5;i++)
		{
			books[i].display();
		}
	}
}


/*

C:\Users\Lumin\Desktop>javac Author.java

C:\Users\Lumin\Desktop>javac Book.java

C:\Users\Lumin\Desktop>javac BookStore.java

C:\Users\Lumin\Desktop>java BookStore
######################################################################################################
The details of all books:
Title:Introduction to Java      Price:2000.0    Page:340
Author's Detail:
Name:K.N.Irfhan Sex:M   Age:45
Title:Object-Oriented Design    Price:2500.0    Page:500
Author's Detail:
Name:S.Y.Nimali Sex:F   Age:32
Title:Object-Oriented Design    Price:1800.0    Page:300
Author's Detail:
Name:D.R.David  Sex:M   Age:40
Title:Introduction to C Price:1500.0    Page:250
Author's Detail:
Name:L.Ramanan  Sex:M   Age:30
Title:Java Script for Beginners         Price:1700.0    Page:550
Author's Detail:
Name:T.K.M.Kumari       Sex:F   Age:36
######################################################################################################
The details of all books which are written by female authors:
Title:Object-Oriented Design    Price:2500.0    Page:500
Author's Detail:
Name:S.Y.Nimali Sex:F   Age:32
Title:Java Script for Beginners         Price:1700.0    Page:550
Author's Detail:
Name:T.K.M.Kumari       Sex:F   Age:36
######################################################################################################
The details of all books which are written by youngest author:
Title:Introduction to C Price:1500.0    Page:250
Author's Detail:
Name:L.Ramanan  Sex:M   Age:30
######################################################################################################
The details of all books:
Title:Introduction to Java      Price:2400.0    Page:340
Author's Detail:
Name:K.N.Irfhan Sex:M   Age:45
Title:Object-Oriented Design    Price:2750.0    Page:500
Author's Detail:
Name:S.Y.Nimali Sex:F   Age:32
Title:Object-Oriented Design    Price:2160.0    Page:300
Author's Detail:
Name:D.R.David  Sex:M   Age:40
Title:Introduction to C Price:1800.0    Page:250
Author's Detail:
Name:L.Ramanan  Sex:M   Age:30
Title:Java Script for Beginners         Price:1870.0    Page:550
Author's Detail:
Name:T.K.M.Kumari       Sex:F   Age:36

C:\Users\Lumin\Desktop>


*/