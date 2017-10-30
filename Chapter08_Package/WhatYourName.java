package Chapter8;
/*
 * 파일이름: WhatYourName.java
 * 작 성 자: RickAstley
 * 작 성 일: 2017년 10월 30일
 * 목    적: Study Java Language
 */
class AAA {
	public void showName() {
		System.out.println("My name is AAA");
	}
}

class ZZZ {
	public void showName() {
		System.out.println("My name is ZZZ");
	}
}

class WhatYourName {
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.showName();
		
		ZZZ zzz = new ZZZ();
		zzz.showName();
	}
}