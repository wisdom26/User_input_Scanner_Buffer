package assesment;

import java.util.Scanner;

// 4. Create a class name Calculator which will add, subtract, multiply and divide.
 class Calcul {
    float a;
    float b;
    public Calcul(float a, float b) {  
        this.a = a;
        this.b = b;
    }
    public float add(){
        return a+b;
        
    }
    public float subtract(){
        return a-b;
        
    }
    public float multiply(){
        return a*b;
        
    }
    public float divide(){
        return a/b;
        
    }
    public void display(){
        System.out.println("a: " + a + " and b: " + b);
        System.out.println("Addition: " + add());
        System.out.println("Subtraction: " + subtract());
        System.out.println("Multiplication: " + multiply());
        System.out.println("Divide: " + divide());
    }
}
public class Calculator {

    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("Enter the a:");
        float a=aa.nextFloat();
        System.out.println("Enter the b: ");
        float b=aa.nextFloat();
        Calcul calcul=new Calcul(a,b);
        calcul.display();
        
    }
}
