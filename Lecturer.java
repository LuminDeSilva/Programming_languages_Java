public class Lecturer{
    private String employeeID;
    private String department;
    private Person person;

    public Lecturer(String employeeID,String department,Person person){
        this.person=person;
        this.employeeID=employeeID;
        this.department=department;
    }

    public String getEmployeeID(){
        return this.employeeID;
    }
    public void setEmployeeID(String regno){
        this.employeeID=employeeID;
    }

    public String getDepartment(){
        return this.department;
    }
    public void setDepartment(String course){
        this.department=department;
    }

    public Person setPerson(Person person){
        this.person=person;
    }
    public Person getPerson(){
        return this.person;
    }

    public void display(){
        person.display();
        System.out.print(this.employeeID+"\t"+this.department+"\n")
    }
}