package ScannerandBuffer;
public class Ibuffer {
    public static void main(String[] args) {
        StringBuffer a=new StringBuffer("india");
        System.out.println(a.capacity());
        a.append("  is great.");
        a.append("Long Live India");
        System.out.println(a);
        a.deleteCharAt(3);
        System.out.println(a);
    }
}
