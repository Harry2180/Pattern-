class Student{
    int age;
    String name;
    public void Info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class This_keyword{
    public static void main(String[] args) {
        Student S1=new Student();
        S1.name="Harshu";
        S1.age=23;
        S1.Info();
    }
}
 