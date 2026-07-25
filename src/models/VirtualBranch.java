package models;

public class VirtualBranch extends Bank {
    private String app;

    public VirtualBranch(String accountType, int numberOfBranch, String clientAddress, String clientLevel, double balance, String cpfOwner, int accountNumber, String ownerAccount) {
        super(accountType, numberOfBranch, clientAddress, clientLevel, balance, cpfOwner, accountNumber, ownerAccount);
    }
}
