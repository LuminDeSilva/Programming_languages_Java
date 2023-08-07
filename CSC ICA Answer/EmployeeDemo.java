class EmployeeDemo
{
	public static void main(String[] args)
	{
		Employee emp1=new Employee();
		emp1.display();
		Employee emp2=new Employee("Daniel",23);
		emp2.display();
		Employee emp3=new Employee("Anna",22);
		emp3.display();
		
		
		
		
	}
}

/*

C:\Users\Lumin\Desktop>javac Employee.java

C:\Users\Lumin\Desktop>javac EmployeeDemo.java

C:\Users\Lumin\Desktop>java EmployeeDemo
Employee name : Unknown
Employee age : 0
Employee count : 1
Employee name : Daniel
Employee age : 23
Employee count : 2
Employee name : Anna
Employee age : 22
Employee count : 3

C:\Users\Lumin\Desktop>

*/