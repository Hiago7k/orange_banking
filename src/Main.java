import java.util.Scanner;

class Main {
    static void main() {

        System.out.println("---------------------------------");
        System.out.println("**** Welcome to Orange Bank ****");
        System.out.println("---------------------------------");

        System.out.println("Please chose your necessity: ");
        System.out.println("1 - Agency Physical ");
        System.out.println("2 - Agency Virtual ");
        Scanner data = new Scanner(System.in);
        int response = data.nextInt();

        System.out.println("Your type is confirm? " + response);
    }
}
