package Chapter7;
/*
 * 파일이름: BankAccountUniID.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 8월 31일
 * 목    적: Study Java Language
 */
class BankAccount5{
	String accNumber;    // 계좌 번호
	String ssNumber;     // 주민 번호
	int balance;         // 예금 잔액
	
	public BankAccount5(String acc, String ss, int bal) { // 생성자
		accNumber = acc;
		ssNumber = ss;
		balance = bal;  
	}
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("계좌번호: " + accNumber);
		System.out.println("주민번호: " + ssNumber);
		System.out.println("잔액 : " + balance + '\n');
		return balance;
	}
}
class BankAccountConstructor {

	public static void main(String[] args) {
		BankAccount5 yoon = new BankAccount5("12-34-89", "990990-9090990", 10000);
		BankAccount5 park = new BankAccount5("33-55-09", "770088-5959007", 10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
