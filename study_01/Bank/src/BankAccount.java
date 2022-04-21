
public class BankAccount {
	int balance;
	Person owner;

	// 파라미터 : 입금할 액수 (정수)
	// 리턴 : 성공여부 (불린)

	boolean deposit(int amount) {
		if (amount < 0 || amount > owner.cashAmount) {
			System.out.printf("입금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.cashAmount);
			return false;
		} else {
			balance += amount;
			owner.cashAmount -= amount;
			System.out.printf("%d원 입금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.cashAmount);
			return true;
		}
	}

	// 파라미터 : 출금할 액수 (정수)
	// 리턴 : 성공여부 (불린)
	boolean withdraw(int amount) {
		if (amount < 0 || amount > balance) {
			System.out.printf("출금 실패입니다. 잔고: %d원, 현금: %d원\n", balance, owner.cashAmount);
			return false;
		} else {
			balance -= amount;
			owner.cashAmount += amount;
			System.out.printf("%d원 출금하였습니다. 잔고: %d원, 현금: %d원\n", amount, balance, owner.cashAmount);
			return true;
		}
	}

	// 첫번째 파라미터 : 받는 사람 (Person)
	// 두번째 파라미터 : 이체할 금액 (정수)
	// 리턴 : 성공여부 (불린)
	boolean transfer(Person to, int amount) {

	}

}// end
