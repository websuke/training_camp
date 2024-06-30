package practice.返却;

import practice.蔵書カテゴリ;
import practice.蔵書;

public class 返却ワゴン {
	private 蔵書カテゴリ カテゴリ;

	public 返却ワゴン(practice.蔵書カテゴリ カテゴリ) {
		super();
		this.カテゴリ = カテゴリ;
	}

	boolean 同じカテゴリ(蔵書 蔵書) {
		return 蔵書.同じカテゴリ(this.カテゴリ);
	}

}
