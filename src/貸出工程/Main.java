package 貸出工程;

import java.time.LocalDate;

import 貸出工程.貸出.貸出リスト;

public class Main {
	public static void main(String[] args) {
		蔵書 やり遂げる力 = new 蔵書("やり遂げる力");
		蔵書 超絶ソフトウェア入門 = new 蔵書("超絶ソフトウェア入門");
		蔵書 具体抽象トレーニング = new 蔵書("具体抽象トレーニング");

		利用者 谷口 = new 利用者("谷口");

		貸出リスト.print();
		System.out.println(貸出リスト.貸し出す(谷口, LocalDate.now(), やり遂げる力));
		
		貸出リスト.print();
		System.out.println(貸出リスト.貸し出す(谷口, LocalDate.now(), 超絶ソフトウェア入門));
		
		貸出リスト.print();
		System.out.println(貸出リスト.貸し出す(谷口, LocalDate.now(), 具体抽象トレーニング));
		
		貸出リスト.print();
		
		
		
		
		
	}
}
