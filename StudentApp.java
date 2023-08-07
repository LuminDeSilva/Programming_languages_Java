class StudentApp
{
	public static void main(String[] args)
	{
		Student data1=new Student("2011/ICT/45","N.Ratna",'M',3,24);
		Student data2=new Student("2011/ASP/30","K.S.Ramani",'F',3,22);
		Student data3=new Student("2012/ICT/12","L.M.Rifthy",'M',2,22);
		Student data4=new Student("2012/ICT/56","J.N.Silva",'M',2,23);
		Student data5=new Student("2011/ASP/30","H.M.Malini",'F',3,21);
		
		//01.Listing details of the students
		System.out.println("Listing details of the students in 3rd year : ");
		if (data1.getYearOfStudy()==3)
			data1.displayDetail();
		if (data2.getYearOfStudy()==3)
			data2.displayDetail();
		if (data3.getYearOfStudy()==3)
			data3.displayDetail();
		if (data4.getYearOfStudy()==3)
			data4.displayDetail();
		if (data5.getYearOfStudy()==3)
			data5.displayDetail();
		System.out.println();
		//02.Listing the youngest student
		System.out.println("Detail of the youngest student : ");
		int[] age=new int[5];
		age[0]=data1.getAge();
		age[1]=data2.getAge();
		age[2]=data3.getAge();
		age[3]=data4.getAge();
		age[4]=data5.getAge();
		int min,index=0;
		min=age[0];
		for(int i=0;i<5;i++)
		{
			if(min>age[i])
			{
				min=age[i];
				index=i;
			}
		}
		if (data1.getAge()==min)
			data1.displayDetail();
		if (data2.getAge()==min)
			data2.displayDetail();
		if (data3.getAge()==min)
			data3.displayDetail();
		if (data4.getAge()==min)
			data4.displayDetail();
		if (data5.getAge()==min)
			data5.displayDetail();
		System.out.println();
		
		//03.Detail of the female student
		System.out.println("Detail of the female student : ");
		if (data1.getGender()=='F')
			data1.displayDetail();
		if (data2.getGender()=='F')
			data2.displayDetail();
		if (data3.getGender()=='F')
			data3.displayDetail();
		if (data4.getGender()=='F')
			data4.displayDetail();
		if (data5.getGender()=='F')
			data5.displayDetail();
	}
}

/*

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>javac Student.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>javac StudentApp.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>java StudentApp
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