package 返却工程.ドメイン.返却;

import 返却工程.ドメイン.蔵書;
import 返却工程.ドメイン.蔵書状態;
import 返却工程.ドメイン.予約.予約リスト;
import 返却工程.ドメイン.返却予定.返却予定リスト;

public class 返却 {

	public 判定結果 返却する(蔵書 蔵書, 返却ワゴン 返却ワゴン) {

		if (蔵書.is貸出中()) {
			返却予定リスト.返却する(蔵書);
			蔵書.set状態(蔵書状態.返却済);
		}

		if (予約リスト.isReserved(蔵書)) {
			return 判定結果.予約;
		}

		return isCorrect(蔵書, 返却ワゴン) ? 判定結果.正解 : 判定結果.不正解;
	}

	private boolean isCorrect(蔵書 蔵書, 返却ワゴン 返却ワゴン) {
		return 返却ワゴン.同じカテゴリ(蔵書);
	}
}
