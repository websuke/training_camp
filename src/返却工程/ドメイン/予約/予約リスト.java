package 返却工程.ドメイン.予約;

import java.util.ArrayList;
import java.util.List;

import 返却工程.ドメイン.蔵書;
import 返却工程.ドメイン.蔵書カテゴリ;
import 返却工程.ドメイン.蔵書状態;

public class 予約リスト {
	private static List<蔵書> 予約リスト = new ArrayList<>();

	static {
		予約リスト.add(new 蔵書(6, 蔵書カテゴリ.IT, 蔵書状態.取置中));
	}

	public static boolean isReserved(蔵書 蔵書) {
		return 予約リスト.contains(蔵書);
	}
}
