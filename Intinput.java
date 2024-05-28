package ScannerandBuffer;
import java.util.Scanner;

public class Intinput {
    public static void main(String[] args) {
        Scanner a =new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=a.nextInt();
        System.out.println("Table of"+num);
        for(int i=1;i<=10;i++){
           System.out.println(num*i);
        }
    }
}
