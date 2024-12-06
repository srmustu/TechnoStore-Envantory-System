import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String m1 = "Welcome to the Patika Store product management system";
        String m2 = "1 : Notebook operations";
        String m3 = "2 : Mobile phone operations";
        String m4 = "3 : List brands in inventory";
        String m5 = "0 : Log out";
        String m6 = "Please select to action you want to perform : ";
        String brandInfoMessage = "List of brands in our store inventory : ";
        String choiceMessage = "Please select the action you want to perform : ";

        System.out.println();

        EnvantorySystem envantorySystem = new EnvantorySystem();

        System.out.println(m1);
        while (true) {


            System.out.println();
            Scanner input = new Scanner(System.in);
            System.out.print(choiceMessage + "\n" + m2 + "\n" + m3 + "\n" + m4 + "\n" + m5 + "\n" + m6);
            int choice = input.nextInt();
            System.out.println();


            switch (choice) {
                case 1:
                    envantorySystem.envNotebookInfo();
                    break;
                case 2:
                    envantorySystem.envPhoneInfo();
                    break;
                case 3:
                    System.out.println(brandInfoMessage);
                    envantorySystem.printBrands();
                    break;
                case 0:
                    System.out.println("Successfully logged out.");
                    break;
                default:
                    break;
            }
        }

    }
}