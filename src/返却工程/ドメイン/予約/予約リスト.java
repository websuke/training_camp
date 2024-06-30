package 返却工程.ドメイン.予約;

import java.util.ArrayList;
import java.util.List;

import 返却工程.ドメイン.蔵書;

public class 予約リスト {
	private static List<蔵書> 予約リスト = new ArrayList<>();

	public static boolean isReserved(蔵書 蔵書) {
		return 予約リスト.contains(蔵書);
	}
}
