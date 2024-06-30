package 返却工程;

import java.util.Objects;

public class 蔵書 {
	private int 蔵書ID;
	private 蔵書カテゴリ カテゴリ;
	private 蔵書状態 状態;

	public 蔵書(int 蔵書ID, 蔵書カテゴリ カテゴリ, 蔵書状態 状態) {
		this.蔵書ID = 蔵書ID;
		this.カテゴリ = カテゴリ;
		this.状態 = 状態;
	}

	public int 蔵書ID() {
		return 蔵書ID;
	}

	public boolean is貸出中() {
		return this.状態 == 蔵書状態.貸出中;
	}

	public void set状態(蔵書状態 状態) {
		this.状態 = 状態;
	}

	public boolean 同じカテゴリ(蔵書カテゴリ カテゴリ) {
		return this.カテゴリ == カテゴリ;
	}

	@Override
	public String toString() {
		return "蔵書 [蔵書ID=" + 蔵書ID + ", カテゴリ=" + カテゴリ + ", 状態=" + 状態 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(カテゴリ, 状態, 蔵書ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		蔵書 other = (蔵書) obj;
		return 蔵書ID == other.蔵書ID;
	}

}
