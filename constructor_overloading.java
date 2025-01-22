class student{
    private int age;
    private String name;
    student(){
        System.out.println("default constructor");
        age = 22;
        name = "natasha";
    }
    student(String name){
        this.name=name;
        age=19;
    }
    student(int age, String name){
        this.age= age;
        this.name= name;
    }
    public void disp(){
        System.out.println(age);
        System.out.println(name);
    }

}
public class constructor_overloading {
    public static void main(String[]args){
      student obj = new student();
      obj.disp();
      student obj1 = new student("rahul");
      obj1.disp();
      student obj2 = new student(22,"natalia");
      obj2.disp();
    }
}
