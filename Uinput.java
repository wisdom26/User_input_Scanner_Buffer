package ScannerandBuffer;
public class Uinput{
public static void main(String[] args) {
    java.util.Scanner a= new java.util.Scanner(System.in);
    System.out.println("Enter your age: ");
    int age=a.nextInt();
    if(age>=18){
        System.out.println("You can vote");
    }else{
        System.out.println("You cannot vote");
    }
}
}