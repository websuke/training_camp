package practice.返却;

import practice.蔵書;
import practice.蔵書状態;
import practice.予約.予約リスト;

public class 返却 {

	public 判定結果 返却する(蔵書 蔵書, 返却ワゴン 返却ワゴン) {

		if (蔵書.is貸出中()) {
			蔵書.set状態(蔵書状態.返却済);
		}

		if (予約リスト.isReserved(蔵書)) {
			return 判定結果.予約;
		}

		return isCorrect(蔵書, 返却ワゴン) ? 判定結果.正解 : 判定結果.不正解;
	}

	private boolean isCorrect(蔵書 蔵書, 返却ワゴン 返却ワゴン) {
		return 蔵書.getカテゴリ() == 返却ワゴン.getカテゴリ();
	}
}
