package 返却工程;

import 返却工程.返却.返却;
import 返却工程.返却.返却ワゴン;

public class Main {
	public static void main(String[] args) {
		蔵書 貸出中本 = new 蔵書(1, 蔵書カテゴリ.IT, 蔵書状態.貸出中);
		蔵書 予約中本 = new 蔵書(2, 蔵書カテゴリ.IT, 蔵書状態.貸出中);
		蔵書 貸出可本 = new 蔵書(3, 蔵書カテゴリ.IT, 蔵書状態.貸出中);
		蔵書 返却済本 = new 蔵書(4, 蔵書カテゴリ.IT, 蔵書状態.貸出中);
		蔵書 破損本 = new 蔵書(5, 蔵書カテゴリ.IT, 蔵書状態.貸出中);
		蔵書 やり遂げる力 = new 蔵書(6, 蔵書カテゴリ.IT, 蔵書状態.貸出中);

		返却ワゴン ITワゴン = new 返却ワゴン(蔵書カテゴリ.IT);
		返却ワゴン 文学ワゴン = new 返却ワゴン(蔵書カテゴリ.文学);

		返却 返却 = new 返却();
		System.out.println(やり遂げる力);
		System.out.println(返却.返却する(やり遂げる力, ITワゴン));
		System.out.println(やり遂げる力);
		//		System.out.println(返却.返却する(予約中本));
		//		System.out.println(返却.返却する(貸出可本));
		//		System.out.println(返却.返却する(返却済本));
		//		System.out.println(返却.返却する(破損本));
	}
}
