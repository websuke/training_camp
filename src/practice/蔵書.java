package practice;

public class 蔵書 {
	private int 蔵書ID;
	private 書籍 書籍;
	private 状態 状態;

	public 蔵書(int 蔵書ID, 書籍 書籍, 状態 状態) {
		this.蔵書ID = 蔵書ID;
		this.書籍 = 書籍;
		this.状態 = 状態;
	}


	public boolean is貸出中() {
		return this.状態 == 状態.貸出中;
	}
	
	public void set状態(状態 状態) {
		this.状態 = 状態;
	}
	
	public カテゴリ getカテゴリ() {
		return this.書籍.getカテゴリ();
	}
	
	
	
	
}
