class demo2 {
    private int age;
    private String name;
    //constructor
    demo2(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
public class constructor_java {
    public static void main(String args[]) {
        demo2 obj = new demo2(25, "ronit");
        //directly giving data to class object
        // means call to constructor
        int stuage = obj.getAge();
        String stuname = obj.getName();
        System.out.println(stuage);
        System.out.println(stuname);
    }
}
