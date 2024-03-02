public class Student{
    private String name;
    private String regno;
    private int age;
    private String course;

    public Student(String name,String regno,int age,String course){
        this.name=name;
        this.regno=regno;
        this.age=age;
        this.course=course;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getRegno(){
        return this.regno;
    }
    public void setRegno(String regno){
        this.regno=regno;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getCourse(){
        return this.course;
    }
    public void setCourse(String course){
        this.course=course;
    }

    public String display(){
        return this.name+"\t"+this.regno+"\t"+this.age+"\t"+this.course;
    }
}
