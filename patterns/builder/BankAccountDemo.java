/**
 * https://dzone.com/articles/design-patterns-the-builder-pattern
 * 
 * The Builder pattern allows us to write readable, understandable code to set
 * up complex objects. It is often implemented with a fluent interface.
 * 
 * Pros
 *  1) Code is more maintainable if number of fields required to create object 
 *     is more than 4 or 5.
 *  2) Object Creation code less error-prone as user will know what they are 
 *     passing because of explicit method call.
 *  3) Builder pattern increase robustness, as only fully constructed object 
 *     will be available to client.
 *  4) You can force immutability to the object once its created.
 * Cons
 *  1) Builder pattern is verbose and requires code duplication as Builder needs
 *     to copy all fields from Original or Item class.
 */

class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    public static class Builder {
        private long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        // accountNumber is important, so we pass it to the constructor
        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            
            // By returning the builder each time, we can create a fluent interface
            return this;  
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            // Here we create the actual bank account object, which is always in 
            // a fully initialised state when it's returned.
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;

            return account;
        }
    }

    private BankAccount() {
        //Constructor is now private.
    }

	public long getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "{" +
            " accountNumber='" + getAccountNumber() + "'" +
            ", owner='" + getOwner() + "'" +
            ", branch='" + getBranch() + "'" +
            ", balance='" + getBalance() + "'" +
            ", interestRate='" + getInterestRate() + "'" +
            "}";
    }
}

// Demo
public class BankAccountDemo {
    public static void main(String args[]) {
        BankAccount account1 = new BankAccount.Builder(1234L)
            .withOwner("Pepe")
            .openingBalance(100)
            .atRate(2.5)
            .build();

        System.out.println(account1.toString());
    }
}
