package ScannerandBuffer;
public class Uinput1{
    public static void main(String[] args) {
        java.util.Scanner a= new java.util.Scanner(System.in);
        System.out.println("Enter your Name: ");
        String Name=a.nextLine();
        System.out.println("Enter your Password: ");
        String Password=a.nextLine();
        if(Name.equals("Vivek")||Name.equals("")){
            if(Password.equals("123")){
                System.out.println("Authorised user");
            }
            
        }else{
            System.out.println("Logging out ..");
        }
    }
    }