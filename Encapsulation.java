class demo {
    private int age;
    private String name;

    public void setdata1(int age) {
        this.age = age;
        //to tell the jvm that this is an
        // instance variable we use this keyword,means current object

    }
    public void setdata2(String name){
        this.name = name;
    }

    public void show() {
        System.out.println(age + " " + name);
    }
}
public class Encapsulation {
    public static void main(String args[]) {
        demo obj = new demo();
        obj.setdata1(18);
        obj.setdata2("nats");
        obj.show();

    }
}
