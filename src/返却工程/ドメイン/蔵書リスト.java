
package 返却工程.ドメイン;

import java.util.ArrayList;
import java.util.List;

public class 蔵書リスト {
	private static List<蔵書> 蔵書リスト = new ArrayList<>();
	static {
		蔵書リスト.add(new 蔵書("やり遂げる力", 蔵書カテゴリ.IT, 蔵書状態.貸出中));
		蔵書リスト.add(new 蔵書("超絶ソフトウェア入門", 蔵書カテゴリ.IT, 蔵書状態.貸出中));
		蔵書リスト.add(new 蔵書("具体抽象トレーニング", 蔵書カテゴリ.IT, 蔵書状態.貸出中));
		蔵書リスト.add(new 蔵書("返却済本", 蔵書カテゴリ.IT, 蔵書状態.貸出中));
		蔵書リスト.add(new 蔵書("破損本", 蔵書カテゴリ.IT, 蔵書状態.貸出中));
		蔵書リスト.add(new 蔵書("やり遂げる力", 蔵書カテゴリ.IT, 蔵書状態.貸出中));
	}
	
	public static List<蔵書> 蔵書リスト(){
		return 蔵書リスト;
	}
	
	//TODO　返却予定登録シナリオの返却登録メソッドを実行できるようにする途中
	public static 蔵書カテゴリ カテゴリ(String 蔵書名) {
		for(蔵書 蔵書: 蔵書リスト) {
			if(蔵書.同じ蔵書(蔵書名)) {
				
			}
		}
		return 蔵書リスト.get(蔵書リスト.indexOf(蔵書名)).カテゴリ();
	}
	
	public static 蔵書状態 状態(String 蔵書名) {
		return 蔵書リスト.get(蔵書リスト.indexOf(蔵書名)).状態();
	}
	
}
