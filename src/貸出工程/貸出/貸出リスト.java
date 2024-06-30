package 貸出工程.貸出;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import 貸出工程.利用者;
import 貸出工程.蔵書;

public class 貸出リスト {
	private static List<貸出> 貸出リスト = new ArrayList<>();
	private static final int 貸出冊数上限 = 3;
	private static final int 貸出最大日数 = 10;

	public static boolean 貸し出す(利用者 利用者, LocalDate 貸出日, 蔵書 蔵書) {
		//延滞チェック
		if(延滞している(利用者)) {
			return false;
		}
		// 上限チェック
		if (貸出できる(利用者)) {
			貸出リスト.add(new 貸出(利用者, 貸出日, 蔵書));
			return true;
		} else {
			return false;
		}
	}

	public static boolean 貸出できる(利用者 利用者) {
		int count = 0;
		for (貸出 貸出 : 貸出リスト) {
			if (貸出.利用者一致している(利用者))
				count++;
		}
		return 貸出冊数上限 > count;
	}

	public int 貸出可能冊数(利用者 利用者) {
		int count = 0;
		for (貸出 貸出 : 貸出リスト) {
			if (貸出.利用者一致している(利用者))
				count++;
		}
		return 貸出冊数上限 > count ? 貸出冊数上限 - count : -1;
	}

	public static boolean 延滞している(利用者 利用者) {
		for(貸出 貸出 : 貸出リスト) {
			if(貸出.利用者一致している(利用者)) {
				if(貸出.延滞している(貸出最大日数)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void print() {
		if (貸出リスト.isEmpty()) {
			System.out.println("貸出中の蔵書はありません。");
		} else {
			for (貸出 貸出 : 貸出リスト) {
				System.out.println(貸出);
			}
		}
	}
}
