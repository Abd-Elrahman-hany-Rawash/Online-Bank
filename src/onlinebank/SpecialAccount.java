package onlinebank;

/**
 *
 * @author Abdelrahman Hany
 */
public class SpecialAccount extends Account {

    public SpecialAccount(float balance, String accountNumber) {
        super(balance, accountNumber);
    }

    public SpecialAccount() {
    }

    @Override
    public void withdraw(float amount) {

        if (amount >= this.balance && this.balance - amount >= -1000) {
            this.balance = this.balance - amount;
            System.out.println("\n" + amount + "withdraw");
            System.out.println("\nyour balance is = " + balance);

        } else if (amount < this.balance) {
            this.balance = this.balance - amount;
            System.out.println("\n" + amount + "withdraw");
            System.out.println("\nyour balance is = " + balance);
        } else {

            System.out.println("\nYou do not have enough balance ");
            System.out.println("\nyour balance is = " + balance);
        }
    }

}
