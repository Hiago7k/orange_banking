import java.util.Scanner;

class Main {
    static void main() {

        System.out.println("---------------------------------");
        System.out.println("**** Welcome to Orange Bank ****");
        System.out.println("---------------------------------");

        int response = 1;
        while(response != 0){

            System.out.println("Please chose your necessity: ");
            System.out.println("1 - Agency Physical ");
            System.out.println("2 - Agency Virtual ");
            System.out.println("3 - Finance Investments");
            System.out.println("0 - To leave");
            Scanner data = new Scanner(System.in);
            response = data.nextInt();


            if (response == 2){
                System.out.println("For continue your order access this link: http.orange.bank/com.br");
            }else if(response == 1) {
                System.out.println("Who can help you today? ");
                System.out.println("1 - Check balance");
                System.out.println("2 - make a deposit");
                System.out.println("3 - make a withdraw");
                System.out.println("4 - make a transaction");
                System.out.println("0 - To Leave");
                int secondResponse = data.nextInt();
            }else {
                break;
            }
        }
    }
}
