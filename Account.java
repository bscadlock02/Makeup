import java.util.*;
public class Account {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int name;
        int pass;
        System.out.println("Enter your full name:");
        name = input.nextInt();
        System.out.println("Enter your password:");
        pass = input.nextInt();
        System.out.println("Your name is " + name);
        System.out.println("Your password is" + pass);
        input.close();
}
}