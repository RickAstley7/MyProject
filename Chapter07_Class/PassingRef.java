package Chapter7;
/*
 * 파일이름: PassingRef.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 31일
 * 목    적: Study Java Language
 */
class BankAccount3 {
	int balance = 0;    // 예금 잔액
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}
}
class PassingRef {

	public static void main(String[] args) {
		BankAccount3 ref = new BankAccount3();
		ref.deposit(3000);
		ref.withdraw(300);
		check(ref);   // '참조 값'의 전달
	}
	public static void check(BankAccount3 acc) {
		acc.checkMyBalance();
	}

}
