package assesment;
// 1. Create a class named Person with attributes name and age. Use Scanner to get user input for a name and age, then create a Person object and greet the user by name and age. 

import java.util.Scanner;
class Person {
    String name;
    int age;
    public Person(String name, int age) {  
        this.name = name;
        this.age = age;
    }

    public void greet(){
        System.out.println("hey! "+ name+" and "+ age);
    }
}
public class Greet {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=a.nextLine();
        System.out.println("Enter your Age: ");
        int age=a.nextInt();
        Person person=new Person(name,age);
        person.greet();
        
    }
}
