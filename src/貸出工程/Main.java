package 貸出工程;

import java.time.LocalDate;

import dto.利用者dto;
import dto.蔵書dto;
import 貸出工程.貸出.貸出リスト;
import 返却工程.サービス.返却予定登録シナリオ;

public class Main {
	public static void main(String[] args) {
		蔵書 やり遂げる力 = new 蔵書("やり遂げる力");
		蔵書 超絶ソフトウェア入門 = new 蔵書("超絶ソフトウェア入門");
		蔵書 具体抽象トレーニング = new 蔵書("具体抽象トレーニング");
		蔵書 延滞本 = new 蔵書("延滞本");

		利用者 谷口 = new 利用者("谷口");

		貸出リスト.print();
		if (貸出リスト.貸し出す(谷口, LocalDate.now().minusDays(10), やり遂げる力)) {
			
			返却予定登録シナリオ.返却予定登録(new 蔵書dto(やり遂げる力.名前()), new 利用者dto(谷口.利用者名()), LocalDate.now());
		}

		貸出リスト.print();
		System.out.println(貸出リスト.貸し出す(谷口, LocalDate.now(), 超絶ソフトウェア入門));

		貸出リスト.print();
		System.out.println(貸出リスト.貸し出す(谷口, LocalDate.now(), 具体抽象トレーニング));

		貸出リスト.print();

		貸出リスト.print();
		System.out.println(貸出リスト.貸し出す(谷口, LocalDate.now(), 延滞本));

		貸出リスト.print();

	}
}
