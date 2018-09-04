public class BankAccount {
    private String name;
    private float balance;
    private String accountNumber;
    private BankAccount overdraftProtection;

    //	here are my getters and setters
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount getOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(BankAccount overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    //	here are my methods to manage my object

    /**
     * 	withdraw
     * @param howMuch	float - amount of money to be transferred out of he account
     * @return			float - current balance of the account
     */
    public float withdraw(float howMuch) {
        //	do we have enough in the account for the transfer?
        if (balance >= howMuch) {
            balance -= howMuch;							//	remove money from account
        } else if (overdraftProtection != null) {       //	do we have an overdraft account?
            //	is there enough between the two accounts to cover the withdrawal request
            if (overdraftProtection.getBalance() + balance > howMuch) {
                howMuch -= balance;        				//	this account will cover what it can
                balance = 0;            				//	this account will be drained
                //	take the remaining amount from the overdraft account
                overdraftProtection.withdraw(howMuch);
            } else {
                System.out.println("Even with your overdraft account you do not have sufficient funds");
            }
        } else {
            System.out.println("You have insufficient funds. Account Balance is: $" + balance);
        }
        return balance;
    }

    public float deposit(float howMuch) {
        balance += howMuch;
        return balance;
    }

    //		here are my constructors
    public BankAccount(String name) {        //	notice that we only have the single parameter
        this.name = name;
        this.balance = 0;            //	yup we created an account but no balance was defined
    }

    public BankAccount(String name, float balance) {    //	here we are going to use two params
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount		checking = null, savings = null;
        String 			accountName;
        int 			amount, option;

        do {
            option = Utils.getNumber("ATM Options" +
                    "\n 1 - Create Checking Account		2 - Make Deposit to Checking" +
                    "\n 3 - Create Savings Account		4 - Withdraw from Checking" +
                    "\n 5 - Xfer Checking to Savings	6 - Get Balance" +
                    "\n 7 - Xfer Savings to Checking" +
                    "\n 0 - exit");
            switch (option) {
                case 1		:
                    accountName = Utils.getInput("Account Name: ");
                    amount = Utils.getNumber("Starting Balanace: ");
                    checking = new BankAccount(accountName, amount);
                    System.out.println(checking);
                    break;

                case 2		:
                    if (checking != null) {
                        amount = Utils.getNumber("Atm to Deposit: ");        //	ask user for amount to deposit
                        checking.deposit(amount);                            //	make deposit
                        System.out.println(checking);                        //	show account status

                    }
                    else {
                        System.out.println("Checking Account Not yet created.");
                    }
                    break;

                case 3	:
                    accountName = Utils.getInput("Everyday Save:");
                    amount = Utils.getNumber("Starting Balance");
                    savings= new BankAccount(accountName,amount);
                    System.out.println(savings);
                    break;

                case 4		:

                    amount = Utils.getNumber("Amt To Withdraw");
                    checking.withdraw(amount);
                    System.out.println(checking);
                    break;

                case 5		:	//	TODO - Transfer from Checking to Savings
                    break;

                case 6		:	//	TODO - Get Balance for Accounts (Checking and Savings)
                    if (checking!= null) {
                        System.out.println(checking.getBalance());
                        System.out.println(savings.getBalance());
                    }
                    else {
                        System.out.println("Checking Not Created");
                    }
                    break;

                case 7		:	//	TODO - Transfer from Checking to Savings
                    break;

            }
        } 	while (option != 0);
    }
}