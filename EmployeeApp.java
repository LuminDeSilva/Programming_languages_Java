class EmployeeApp
{
	public static void main(String arg[])
	{
		Employee emp1=new Employee();
		emp1.displayEmployee();
		emp1.setEmpName("Ramana");
		emp1.setEmpID("EMP001");
		emp1.setEmpSalary(75000);
		emp1.displayEmployee();
		Employee emp2=new Employee("Hariharn","EMP002",150000);
		emp2.displayEmployee();
		Employee emp3=new Employee("David Dilshan","EMP003");
		emp3.displayEmployee();
		emp3.setEmpSalary(200000);
		emp3.displayEmployee();
	}
}
/*

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>javac Employee.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>javac EmployeeApp.java

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>java EmployeeApp
Employee Name : Unknown
Employee ID : Unknown
Employee Salary : 0.0
Employee Name : Ramana
Employee ID : EMP001
Employee Salary : 75000.0
Employee Name : EMP002
Employee ID : Hariharn
Employee Salary : 150000.0
Employee Name : EMP003
Employee ID : David Dilshan
Employee Salary : 0.0
Employee Name : EMP003
Employee ID : David Dilshan
Employee Salary : 200000.0

F:\Vavuniya Campus UOJ\Practical\1st year\2nd sem\IT 1214\Practical>

*/