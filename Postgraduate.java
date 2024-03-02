public class Postgraduate extends Person{
    private String regno;
    private String course;
    public Postgraduate(String regno,String course,String name,int age,String nic){
        super(name,age,nic);
        this.regno=regno;
        this.course=course;
    }

    public String getRegno(){
        return this.regno;
    }
    public void setRegno(String regno){
        this.regno=regno;
    }

    public String getCourse(){
        return this.course;
    }
    public void setCourse(String course){
        this.course=course;
    }
} 