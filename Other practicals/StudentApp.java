class StudentApp
{
	public static void main(String[] args)
	{
		Student st1=new Student("2011/ICT/45","N.Ratna",'M',3,24);
		Student st2=new Student("2011/ASP/30","K.S.Ramani",'F',3,22);
		Student st3=new Student("2012/ICT/12","L.N.Rafthy",'M',2,22);
		Student st4=new Student("2012/ICT/56","J.N.Silva",'M',2,23);
		Student st5=new Student("2011/ASP/30","H.M.Malini",'F',3,21);
		
		Student[] stu=new Student[5];
		stu[0]=st1;
		stu[1]=st2;
		stu[2]=st3;
		stu[3]=st4;
		stu[4]=st5;
		
		System.out.println("Details of the students in third year: ");
		for(int i=0;i<5;i++)
		{
			if(stu[i].getYearofstudy()==3)
				stu[i].display();
		}
		
		System.out.println("\nDetails of the youngest student : ");
		int young=stu[0].getAge();
		int index=0;
		for(int i=0;i<5;i++)
		{
			if(young>stu[i].getAge())
			{
				young=stu[i].getAge();
				index=i;
			}
		}
		stu[index].display();
		
		
		System.out.println("\nDetails of the female students: ");
		for(int i=0;i<5;i++)
		{
			if(stu[i].getGender()=='F')
				stu[i].display();
		}
		
		
	}
}

/*

C:\Users\Lumin\Desktop>javac Student.java

C:\Users\Lumin\Desktop>javac StudentApp.java

C:\Users\Lumin\Desktop>java StudentApp
Details of the students in third year:
Regno:2011/ICT/45       Name:N.Ratna    Gender:M
Year of Study:3 Age:24
Regno:2011/ASP/30       Name:K.S.Ramani Gender:F
Year of Study:3 Age:22
Regno:2011/ASP/30       Name:H.M.Malini Gender:F
Year of Study:3 Age:21

Details of the youngest student :
Regno:2011/ASP/30       Name:H.M.Malini Gender:F
Year of Study:3 Age:21

Details of the female students:
Regno:2011/ASP/30       Name:K.S.Ramani Gender:F
Year of Study:3 Age:22
Regno:2011/ASP/30       Name:H.M.Malini Gender:F
Year of Study:3 Age:21

C:\Users\Lumin\Desktop>


*/