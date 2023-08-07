class CarApp
{
	public static void main(String[] args)
	{
		Person per1=new Person("K.N.De Silva",'M',29);
		Person per2=new Person("I.Rathika",'F',32);
		Person per3=new Person("T.R.Regmen",'M',36);
		
		Car car1=new Car("SKL001R200","Toyota","Red",per2);
		Car car2=new Car("MKY008G400","Honda","Blue",per1);
		Car car3=new Car("GHT018H390","Suzuki","White",per2);
		Car car4=new Car("LKY090Y200","Toyota","Black",per1);
		
		System.out.println("Details of the car owners : ");
		car1.display();
		car2.display();
		car3.display();
		car4.display();
		
		car2.setOwner(per3);
		car3.setColor("Dark Red");
		
		
		System.out.println("Details of the car owners after modifications : ");
		car1.display();
		car2.display();
		car3.display();
		car4.display();
		
		
		
	}
}

/*

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical\CSC ICA Answer>javac Person.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical\CSC ICA Answer>javac Car.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical\CSC ICA Answer>javac CarApp.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical\CSC ICA Answer>java CarApp
Details of the car owners :
Name : I.Rathika
Gender : F
Age : 32
Serial Number : SKL001R200
Manufacturer : Toyota
Color : Red
Name : K.N.De Silva
Gender : M
Age : 29
Serial Number : MKY008G400
Manufacturer : Honda
Color : Blue
Name : I.Rathika
Gender : F
Age : 32
Serial Number : GHT018H390
Manufacturer : Suzuki
Color : White
Name : K.N.De Silva
Gender : M
Age : 29
Serial Number : LKY090Y200
Manufacturer : Toyota
Color : Black
Details of the car owners after modifications :
Name : I.Rathika
Gender : F
Age : 32
Serial Number : SKL001R200
Manufacturer : Toyota
Color : Red
Name : T.R.Regmen
Gender : M
Age : 36
Serial Number : MKY008G400
Manufacturer : Honda
Color : Blue
Name : I.Rathika
Gender : F
Age : 32
Serial Number : GHT018H390
Manufacturer : Suzuki
Color : Dark Red
Name : K.N.De Silva
Gender : M
Age : 29
Serial Number : LKY090Y200
Manufacturer : Toyota
Color : Black

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical\CSC ICA Answer>



*/