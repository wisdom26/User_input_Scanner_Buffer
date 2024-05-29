package assesment;

import java.util.Scanner;

// 5. Create a class to find out the distance b/w two coordinates. (d=√((x2 – x1)² + (y2 – y1)²).
class Coordinates{
    double x1,x2,y1,y2;

public Coordinates(double x1, double x2, double y1, double y2){
    this.x1=x1;
    this.x2=x2;
    this.y1=y1;
    this.y2=y2;
}
public double Two_coordinates(){
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

}
public void display(){
System.out.println("the distance b/w two coordinates"+Two_coordinates());
}
}


public class Distance {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the X1:");
        double x1=a.nextDouble();
        System.out.println("Enter the X2:");
        double x2=a.nextDouble();
        System.out.println("Enter the Y1:");
        double y1=a.nextDouble();
        System.out.println("Enter the Y2:");
        double y2=a.nextDouble();
        Coordinates coordinates=new Coordinates(x1,x2,y1,y2);
        coordinates.display();
    }
   
    
}
