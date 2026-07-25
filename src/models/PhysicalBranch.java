package models;

public class PhysicalBranch extends Bank {
    private String addressBranch;
    private String dateOfBranchWork;

    public PhysicalBranch(String accountType, int numberOfBranch, String clientAddress, String clientLevel, double balance, String cpfOwner, int accountNumber, String ownerAccount) {
        super(accountType, numberOfBranch, clientAddress, clientLevel, balance, cpfOwner, accountNumber, ownerAccount);
    }
}
