import java.util.*;

public class stringToInt {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.next();
        try {
            System.out.println(Integer.parseInt(s));
        }
        catch(NumberFormatException e) {
            System.out.println("Inputmismatch");
        }
        catch(Exception e1) {
            System.out.println("Error");
        }
    }

}

/*
Enter string
sfg
Inputmismatch

Enter string
123
123

 */