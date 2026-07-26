import models.Bank;

import java.util.Scanner;

class Main {
    static void main() {

        Bank bank1 = new Bank("Savings", 93432, "Street Santos Dummont 1032", "Diamond", 15000.0, "323.2323-14", 5555, "Hiago Mendes");

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

            switch(response){
                case 1:
                    // Agency Physical
                    System.out.println("Who can help you today? ");
                    System.out.println("1 - Check balance");

                    // Create method for show balance
                    bank1.showBalance();

                    System.out.println("2 - make a deposit");
                    System.out.println("3 - make a withdraw");
                    System.out.println("4 - make a transaction");
                    System.out.println("0 - Back to menu ");
                    int secondResponse = data.nextInt();
                    break;
                case 2:
                    // Agency Virtual
                    System.out.println("For continue your order access this link: http.orange.bank/com.br");

                    break;
                case 3:
                    // Finance Investments
                    System.out.println("Welcome to your wallet who can help you today? ");
                    System.out.println("1 - Check balance of investments");
                    System.out.println("2 - Invest money");
                    int responseInvestments = data.nextInt();

                    if (responseInvestments == 2){
                        System.out.println("Choose your type of investments you want buy today");
                        System.out.println("1 - ETFs");
                        System.out.println("2 - Stocks");
                        System.out.println("3 - Criptos");
                        int responseInvestmentsBuy = data.nextInt();
                    }


                    break;
                case 0:
                    // Leave
                    break;
                default:
                    System.out.println("Unknow option please type again: ");
                    break;
            }
        }
    }
}
