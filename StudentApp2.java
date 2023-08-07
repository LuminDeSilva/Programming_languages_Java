class StudentApp2
{
	public static void main(String[] args)
	{
		Student data1=new Student("2011/ICT/45","N.Ratna",'M',3,24);
		Student data2=new Student("2011/ASP/30","K.S.Ramani",'F',3,22);
		Student data3=new Student("2012/ICT/12","L.M.Rifthy",'M',2,22);
		Student data4=new Student("2012/ICT/56","J.N.Silva",'M',2,23);
		Student data5=new Student("2011/ASP/30","H.M.Malini",'F',3,21);
		
		Student[] stu=new Student[5];
		stu[0]=data1;
		stu[1]=data2;
		stu[2]=data3;
		stu[3]=data4;
		stu[4]=data5;
		
		System.out.println("Listing details of the students in 3rd year : ");

		for(int i=0;i<5;i++)
		{
			if(stu[i].getYearOfStudy()==3)
			{
				stu[i].displayDetail();
				System.out.println();
			}
		}
		
		System.out.println("Detail of the youngest student : ");
		
		int min,index=0;
		min=stu[0].getAge();
		for(int i=0;i<5;i++)
		{
			if(min>stu[i].getAge())
			{
				min=stu[i].getAge();
				index=i;
			}
		}
		stu[index].displayDetail();
		System.out.println();

		
		System.out.println("Detail of the female student : ");
		
		for(int i=0;i<5;i++)
		{
			if(stu[i].getGender()=='F')
			{
				stu[i].displayDetail();
				System.out.println();
			}
		}

	}
}


/*

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>javac Student.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>javac StudentApp2.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>java StudentApp2
Listing details of the students in 3rd year :
Registration number : 2011/ICT/45
Name : N.Ratna
Gender : M
Year of study : 3
Age : 24

Registration number : 2011/ASP/30
Name : K.S.Ramani
Gender : F
Year of study : 3
Age : 22

Registration number : 2011/ASP/30
Name : H.M.Malini
Gender : F
Year of study : 3
Age : 21

Detail of the youngest student :
Registration number : 2011/ASP/30
Name : H.M.Malini
Gender : F
Year of study : 3
Age : 21

Detail of the female student :
Registration number : 2011/ASP/30
Name : K.S.Ramani
Gender : F
Year of study : 3
Age : 22

Registration number : 2011/ASP/30
Name : H.M.Malini
Gender : F
Year of study : 3
Age : 21


F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>

*/