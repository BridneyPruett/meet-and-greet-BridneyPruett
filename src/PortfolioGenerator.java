import java.util.Scanner;
public class PortfolioGenerator {
    public static void main(String[] args) {

                Scanner input=new Scanner (System.in);
                String Name;
                String Background;
                System.out.println("    What is your name?");
                Name=input.next();
                System.out.println(" What is your background?");
                Background=input.next();
                System.out.println(" What programming languages do you know?");
                System.out.println("Hi, My name is " + Name);
                System.out.println("My Personal Background: " + Background);

        String[] thisIsAStringArray = {"JavaScript" , "Sql"};
        System.out.println("Programming Languages:");
        System.out.println( thisIsAStringArray[0] );
        System.out.println( thisIsAStringArray[1] );

    }
}


