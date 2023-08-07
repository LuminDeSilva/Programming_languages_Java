class CampusTest
{
	public static void main(String[] args)
	{
		Staff st1=new Staff("David","Colombo","Lecture","5694646454v",5,145000);
		Staff st2=new Staff("Lucifer","Kandy","Senior Lecture","4541646465v",3,345000);
		Staff st3=new Staff("Anna","Galle","Demostrator","1634434543v",5,55000);
		
		General gen1=new General("Kevin","Matara","ST001","BS",3.2,3.5,3.5);
		General gen2=new General("Jennie","Kandy","ST002","PM",3.6,3.5,3.8);
		General gen3=new General("Jennifer","Colombo","ST003","IT",3.5,3.2,2.9);
		
		Special sp1=new Special("Stephan","Matara","ST004","TECH",3.2,3.5,3.5,3.6);
		Special sp2=new Special("Harry","Kandy","ST005","ASP",2.6,2.5,2.8,3.8);
		Special sp3=new Special("Juliet","Colombo","ST006","IT",3.5,3.2,2.9,3.9);
		
		System.out.println("Final Results of students : ");
		gen1.print();
		System.out.println("Final result:"+gen1.getFinalResult());
		gen2.print();
		System.out.println("Final result:"+gen2.getFinalResult());
		gen3.print();
		System.out.println("Final result:"+gen3.getFinalResult());
		sp1.print();
		System.out.println("Final result:"+sp1.getFinalResult());
		sp2.print();
		System.out.println("Final result:"+sp2.getFinalResult());
		sp3.print();
		System.out.println("Final result:"+sp3.getFinalResult());
		
		
		System.out.println("\nTotal Salary of Satff : ");
		st1.print();
		System.out.println("Total Salary :"+st1.getSalary());
		st2.print();
		System.out.println("Total Salary :"+st2.getSalary());
		st3.print();
		System.out.println("Total Salary :"+st3.getSalary());
	}
}


/*

C:\Users\Lumin\Desktop>javac Campus.java

C:\Users\Lumin\Desktop>javac Staff.java

C:\Users\Lumin\Desktop>javac Student.java

C:\Users\Lumin\Desktop>javac General.java

C:\Users\Lumin\Desktop>javac Special.java

C:\Users\Lumin\Desktop>javac CampusTest.java

C:\Users\Lumin\Desktop>java CampusTest
Final Results of students :
Name : Kevin    District : Matara
SID : ST001     Course : BS
Final result:Second Class(Upper Division)
Name : Jennie   District : Kandy
SID : ST002     Course : PM
Final result:Second Class(Upper Division)
Name : Jennifer District : Colombo
SID : ST003     Course : IT
Final result:Second Class(Lower Division)
Name : Stephan  District : Matara
SID : ST004     Course : TECH
Final result:Second Class(Upper Division)
Name : Harry    District : Kandy
SID : ST005     Course : ASP
Final result:Pass
Name : Juliet   District : Colombo
SID : ST006     Course : IT
Final result:Second Class(Upper Division)

Total Salary of Satff :
Name : David    District : Colombo
Total Salary :160500.0
Name : Lucifer  District : Kandy
Total Salary :380500.0
Name : Anna     District : Galle
Total Salary :61500.0

C:\Users\Lumin\Desktop>


*/