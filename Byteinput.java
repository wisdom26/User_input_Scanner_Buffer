package ScannerandBuffer;
import java.math.BigInteger;
import java.util.Scanner;

public class Byteinput {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter your age");
        byte b=a.nextByte();
        int i=a.nextInt();
        float f=a.nextFloat();
        double d=a.nextDouble();
        short s=a.nextShort();
        BigInteger B=a.nextBigInteger();
        System.out.println(""+b);
        System.out.println(""+i);
        System.out.println(""+f);
        System.out.println(""+d);
        System.out.println(""+s);
        System.out.println(""+B);
    }
}
