package practice.予約;

import java.util.ArrayList;
import java.util.List;

import practice.蔵書;
import practice.蔵書カテゴリ;
import practice.蔵書状態;

public class 予約リスト {
	private static List<蔵書> 予約リスト = new ArrayList<>();

	static {
		予約リスト.add(new 蔵書(6, 蔵書カテゴリ.IT, 蔵書状態.取置中));
	}

	public static boolean isReserved(蔵書 蔵書) {
		return 予約リスト.contains(蔵書);
	}
}
