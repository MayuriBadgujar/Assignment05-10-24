import java.util.*;
public class Vowels {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string : ");
        String s=sc.next();
        String s1= s.toLowerCase();

        try {
            if (s.contains("a") || s.contains("e") ||
                    s.contains("i") || s.contains("o") ||
                    s.contains("u")) {

                System.out.println("The string contains vowels.");
            }
        }
            catch(InputMismatchException e){
                System.out.println("The string  not contains vowels.");
            }
            catch(Exception e1){
            System.out.println("Error");
            }


    }
}
/*

Enter string :
anu
The string contains vowels.
 */