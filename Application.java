import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        int myNumber;

        myNumber = 99;

        System.out.println(myNumber);

        Scanner input = new Scanner(System.in);

        String line = input.nextLine();

        System.out.println(line);
    }
}