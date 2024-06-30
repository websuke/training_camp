package 貸出工程;

import 貸出工程.貸出.貸出リスト;
import 返却工程.蔵書カテゴリ;
import 返却工程.蔵書状態;
import 返却工程.返却.返却;
import 返却工程.返却.返却ワゴン;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		蔵書 やり遂げる力 = new 蔵書("やり遂げる力");
		蔵書 超絶ソフトウェア入門 = new 蔵書("超絶ソフトウェア入門");
		蔵書 具体抽象トレーニング = new 蔵書("具体抽象トレーニング");

		利用者 谷口 = new 利用者("谷口");

		貸出リスト.print();
		貸出リスト.貸し出す(谷口, LocalDate.now(), やり遂げる力);
		貸出リスト.print();
	}
}
