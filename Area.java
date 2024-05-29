package assesment;

import java.util.Scanner;

// 2. Create a class named Rectangle with attributes length and breadth (or width) and methods to calculate and display the area. Use the Scanner class to get user input for the rectangle's dimensions. (Area of Rectangle = Length*Breadth) 
class Rectangle {
    int length;
    int width;
    public Rectangle(int length, int width) {  
        this.length = length;
        this.width = width;
    }

    public int Area(){
        return length*width;
        
    }
    public void display(){
        System.out.println("Length: "+ length+" and "+"width :"+ width+"="+Area());
    }
}
public class Area {

    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("Enter the length:");
            int length=a.nextInt();
            System.out.println("Enter the width: ");
            int width=a.nextInt();
            Rectangle rectangle=new Rectangle(length,width);
            rectangle.display();
        }
        
    }
}

