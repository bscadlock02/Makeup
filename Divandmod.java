import java.util.*;
public class Divandmod {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int num;
        int num2;
        System.out.println("Enter an integer:");
        num = input.nextInt();
        System.out.println("Enter an second integer:");
        num2 = input.nextInt();
        int sum = (num / num2);
        int sum2 = (num % num2);
        System.out.println(num  + "/" + num2 + "=" + sum);
        System.out.println(num  + "%" + num2 + "=" + sum2);
}
}