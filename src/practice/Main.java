package practice;

public class Main {
	public static void main(String[] args) {
		蔵書 貸出中本 = new 蔵書(1, new 書籍("貸出中本", カテゴリ.IT), 状態.貸出中);
		蔵書 予約中本 = new 蔵書(2, new 書籍("予約中本", カテゴリ.IT), 状態.貸出中);
		蔵書 貸出可本 = new 蔵書(3, new 書籍("貸出可本", カテゴリ.IT), 状態.貸出中);
		蔵書 返却済本 = new 蔵書(4, new 書籍("返却済本", カテゴリ.IT), 状態.貸出中);
		蔵書 破損本 = new 蔵書(5, new 書籍("破損本", カテゴリ.IT), 状態.貸出中);
		蔵書 やり遂げる力 = new 蔵書(6, new 書籍("やり遂げる力", カテゴリ.IT), 状態.貸出中);
		
		返却ワゴン ITワゴン = new 返却ワゴン(カテゴリ.IT);
		返却ワゴン 文学ワゴン = new 返却ワゴン(カテゴリ.文学);

		返却 返却 = new 返却();
		System.out.println(貸出中本);
		System.out.println(返却.返却する(貸出中本, ITワゴン));
		System.out.println(貸出中本);
//		System.out.println(返却.返却する(予約中本));
//		System.out.println(返却.返却する(貸出可本));
//		System.out.println(返却.返却する(返却済本));
//		System.out.println(返却.返却する(破損本));
	}
}
