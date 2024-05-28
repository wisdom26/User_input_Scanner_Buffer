package ScannerandBuffer;
import java.io.*;

public class ibuffer1 {
    public static void main(String[] args)throws IOException {
        // java.io.BufferedReader br=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your age: ");
        String age =a.readLine();
        int age1=Integer.parseInt(age);
        System.out.println(2*age1);

    }
}
