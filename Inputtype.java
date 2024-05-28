package ScannerandBuffer;
import java.util.Scanner;
public class Inputtype {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Do you have laptop.");
        boolean laptop=a.nextBoolean();
        if(laptop){
            System.out.println("You have a laptop");
        }else{
            System.out.println("You don't have a laptop");
        }
    }
}
