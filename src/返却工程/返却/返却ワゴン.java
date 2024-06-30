package 返却工程.返却;

import 返却工程.蔵書カテゴリ;
import 返却工程.蔵書;

public class 返却ワゴン {
	private 蔵書カテゴリ カテゴリ;

	public 返却ワゴン(蔵書カテゴリ カテゴリ) {
		super();
		this.カテゴリ = カテゴリ;
	}

	boolean 同じカテゴリ(蔵書 蔵書) {
		return 蔵書.同じカテゴリ(this.カテゴリ);
	}

}
