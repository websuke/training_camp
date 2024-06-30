package 返却工程.サービス;

import java.time.LocalDate;

import 返却工程.利用者;
import 返却工程.ドメイン.蔵書;
import 返却工程.ドメイン.返却予定.返却予定;
import 返却工程.ドメイン.返却予定.返却予定リスト;

public class 返却予定登録シナリオ {
	public static void 返却予定登録(蔵書 蔵書, 利用者 利用者, LocalDate 返却期限) {
		返却予定リスト.返却予定登録(new 返却予定(蔵書, 利用者, 返却期限));
	}
}
