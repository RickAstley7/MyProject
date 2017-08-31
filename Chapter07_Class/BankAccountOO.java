package Chapter7;
/*
 * 파일이름: BankAccountOO.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 31일
 * 목    적: Study Java Language
 */
class BankAccount {
	int balance = 0;   // 예금 잔액
	
	public int deposit(int amount) {   // 입금을 담당하는 메소드
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {   // 출금을 담당하는 메소드
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {    // 예금을 조회를 담당하는 메소드
		System.out.println("잔액 : " + balance);
		return balance;
	}
}
class BankAccountOO {

	public static void main(String[] args) {
		// 두 개의 인스턴스 생성
		BankAccount yoon = new BankAccount();
		BankAccount park = new BankAccount();
		
		// 각 인스턴스를 대상으로 예금을 진행
		yoon.deposit(5000);
		park.deposit(3000);
		
		// 각 인스턴스를 대상으로 출금을 진행
		yoon.withdraw(2000);
		park.withdraw(2000);
		
		// 각 인스턴스를 대상으로 잔액을 조회
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
