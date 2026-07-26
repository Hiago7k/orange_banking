package models;

public class Bank {
    private String accountType;
    private String OwnerAccount;
    private int accountNumber;
    private String cpfOwner;
    private double balance;
    private String clientLevel;
    private String clientAddress;
    private int numberOfBranch;

    public Bank(String accountType, int numberOfBranch, String clientAddress, String clientLevel,
                double balance,
                String cpfOwner, int accountNumber, String ownerAccount) {

        this.accountType = accountType;
        this.numberOfBranch = numberOfBranch;
        this.clientAddress = clientAddress;
        this.clientLevel = clientLevel;
        this.balance = balance;
        this.cpfOwner = cpfOwner;
        this.accountNumber = accountNumber;
        this.OwnerAccount = ownerAccount;

        }

    public void showBankInformation(){
        System.out.println("Your bank details is: " + balance );
        System.out.println(accountType + " " + cpfOwner + " " + numberOfBranch + " " + clientAddress + " " + accountNumber );
    }

    public void depositBalance(double value){
        if (value > 0) {
            balance = balance + value;
            System.out.println("Your new balance after deposit is: " + balance);
        }else {
            System.out.println("Value for deposit invalid!");
        }
    }

    public void withdrawBalance(double value){
        if(value <= balance){
            balance = balance - value;
            System.out.println("Your new balance after withdraw is: " + balance);
        }else {
            System.out.println("Value for withdraw insufficient");
        }
    }

    public void makeTransaction(double value, String address){
        if(value <= balance){
            balance = balance - value;
            System.out.println("Transaction confirmed for " + address + " you send " + value);
            System.out.println("Your new balance after transaction is " + balance);
        }else {
            System.out.println("insufficient balance for transaction");
        }
    }

    }
