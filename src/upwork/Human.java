package upwork;

public class Human {

    public String name;
    public int age;

    //static : shared fields between all the objects from the same class
    public static final String color = "white";

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getColor(){
        return this.color;
    }

}
