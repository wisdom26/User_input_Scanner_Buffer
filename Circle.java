package assesment;

import java.util.Scanner;

// 3. Create a class named Circle with an attribute radius and a method to calculate the area. Use Scanner to get user input for the circle's radius (Area of Circle = πr*r) 
class CircleArea {
    int radius;
public CircleArea(int radius) {
        this.radius=radius;
    }

public float Area_of_Circul(){
    return (float) (Math.PI*radius*radius);
}

public void display() {
    System.out.println(Area_of_Circul());
}
    
}
public class Circle {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius=a.nextInt();
        CircleArea circleArea=new CircleArea(radius);
       circleArea.display();
    }
}
