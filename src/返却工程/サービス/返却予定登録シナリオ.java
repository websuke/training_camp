package 返却工程.サービス;

import java.time.LocalDate;

import dto.利用者dto;
import dto.蔵書dto;
import 返却工程.利用者;
import 返却工程.ドメイン.蔵書;
import 返却工程.ドメイン.蔵書カテゴリ;
import 返却工程.ドメイン.蔵書リスト;
import 返却工程.ドメイン.蔵書状態;
import 返却工程.ドメイン.返却予定.返却予定;
import 返却工程.ドメイン.返却予定.返却予定リスト;;

public class 返却予定登録シナリオ {
	public static void 返却予定登録(蔵書dto 蔵書, 利用者dto 利用者, LocalDate 返却期限) {
		
		String 名前 = 蔵書.名前();
		蔵書カテゴリ カテゴリ = 蔵書リスト.カテゴリ(名前);
		蔵書状態 状態 = 蔵書リスト.状態(名前);
		利用者 利用者A = new 利用者(利用者.get利用者名());
		返却予定リスト.返却予定登録(new 返却予定(new 蔵書(名前, カテゴリ, 状態), 利用者A, 返却期限));
	}
}
