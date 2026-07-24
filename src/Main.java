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

        if (response == 2){
            System.out.println("For continue your order acess this link: http.orange.bank/com.br");
            System.out.println("Who can help you today? ");
            System.out.println("1 - Check balance");
            System.out.println("2 - make a deposit");
            System.out.println("3 - make a withdraw");
            System.out.println("4 - make a transaction");
            System.out.println("5 - back to menu");
            int secondResponse = data.nextInt();
        }else {
            System.out.println("What address is your agency? ");
        }

    }
}
