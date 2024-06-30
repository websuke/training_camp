package 返却工程.ドメイン.返却予定;

import java.util.ArrayList;
import java.util.List;

import 返却工程.ドメイン.蔵書;

public class 返却予定リスト {
	private static List<返却予定> 返却予定リスト = new ArrayList<>();

	public static void 返却予定登録(返却予定 返却予定) {
		返却予定リスト.add(返却予定);
	}

	public static boolean 返却期限切れ(蔵書 蔵書) {
		int index = 返却予定リスト.indexOf(蔵書);
		return 返却予定リスト.get(index).返却期限切れ();
	}

	public static void 返却する(蔵書 蔵書) {
		返却予定リスト.remove(蔵書);
	}
}
