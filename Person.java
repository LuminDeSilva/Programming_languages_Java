/*
undergraduate students
postgraduate student
lecturer
instructor
technical officer
head
dean
*/

public class Person{
    private String name;
    private int age;
    private String nic;

    public Person(String name,int age,String nic){
        this.name=name;
        this.age=age;
        this.nic=nic;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getNic(){
        return this.nic;
    }
    public void setNic(String nic){
        this.nic=nic;
    }

    public String display(){
        return this.name+"\t"+this.age+"\t"+this.nic;
    }
}