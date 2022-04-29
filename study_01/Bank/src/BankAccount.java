
public class BankAccount {
	private int balance;
	private Person owner;
	
    public BankAccount(int pBalance) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
    }
    public BankAccount(Person pOwner) {
        owner = pOwner;
        balance = 0;
        
    }
    public BankAccount(int pBalance, Person pOwner) {
        if (pBalance < 0) {
            balance = 0;
        } else {
            balance = pBalance;
        }
        owner = pOwner;
    }

	public void setBalance(int newBalance) {
		balance = newBalance;
	}

	public int getBalance() {
		return balance;
	}

	public void setOwner(Person newOwner) {
		owner = newOwner;
	}

	public Person getOwner() {
		return owner;
	}

	// 파라미터 : 입금할 액수 (정수)
	// 리턴 : 성공여부 (불린)

	boolean deposit(int amount) {
		if (amount < 0 || amount > owner.getCashAmount()) {
			System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.getCashAmount());
			return false;
		} else {
			balance += amount;
			owner.setCashAmount(owner.getCashAmount() - amount);
			System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.getCashAmount());
			return true;
		}
	}

	public boolean deposit(double amount, double exchangeRate) {
		return deposit((int) (amount * exchangeRate));
	}

	// 파라미터 : 출금할 액수 (정수)
	// 리턴 : 성공여부 (불린)
	boolean withdraw(int amount) {
		if (amount < 0 || amount > balance) {
			System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.getCashAmount());
			return false;
		} else {
			balance -= amount;
			owner.setCashAmount(owner.getCashAmount() + amount);
			System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.getCashAmount());
			return true;
		}
	}

	// 첫번째 파라미터 : 받는 사람 (Person)
	// 두번째 파라미터 : 이체할 금액 (정수)
	// 리턴 : 성공여부 (불린)
	boolean transfer(Person to, int amount) {
		return transfer(to.getAccount(), amount);
	}
    // 첫 번째 파라미터: 받는 사람의 계정 (BankAccount)
    // 두 번째 파라미터: 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)
    public boolean transfer(BankAccount to, int amount) {
        boolean success;

        if (amount < 0 || amount > balance) {
            success = false;
        } else {
            to.balance += amount;
            balance -= amount;
            success = true;
        }

        // 결과값 출력
        System.out.println(success + " - from: " + owner.getName()
                + ", to: " + to.getOwner().getName()
                + ", amount: " + amount
                + ", balance: " + balance);

        return success;
    }
}// end
