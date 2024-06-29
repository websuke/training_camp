package practice.予約;

import java.util.ArrayList;
import java.util.List;

import practice.カテゴリ;
import practice.書籍;
import practice.蔵書;

public class 予約リスト {
	private static List<書籍> 予約リスト = new ArrayList<>();

	static {
		予約リスト.add(new 書籍("やり遂げる力", カテゴリ.IT));
	}

	public static boolean isReserved(蔵書 蔵書) {
		書籍 書籍 = 蔵書.get書籍();
		return 予約リスト.contains(書籍);
	}
}
