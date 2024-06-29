package practice;

public class 返却 {
	
	public boolean 返却する(蔵書 蔵書, 返却ワゴン 返却ワゴン) {
		// カテゴリチェック
		
		
		// 状態チェック
		// 状態変更
		
		if(蔵書.is貸出中()) {
			蔵書.set状態(状態.返却済);
			return true;
		}
		
		return false;
	}
	
	private boolean isCorrect(蔵書 蔵書, 返却ワゴン 返却ワゴン) {
		return 蔵書.getカテゴリ() == 返却ワゴン.getカテゴリ();
	}
}
