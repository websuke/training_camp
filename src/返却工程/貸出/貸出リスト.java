package 返却工程.貸出;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class 貸出リスト {
	private static Map<Integer, 貸出> 貸出リスト = new HashMap<>();

	static {
		貸出リスト.put(1, new 貸出(1, 1000, LocalDate.now().plusDays(10)));
	}

	public static boolean 返却期限切れ(int 蔵書ID) {
		return 貸出リスト.get(蔵書ID).返却期限切れ();
	}

	public static void 返却する(int 蔵書ID) {
		貸出リスト.remove(蔵書ID);
	}
}
