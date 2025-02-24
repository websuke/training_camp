package 返却工程.ドメイン;

import java.util.Objects;

public class 蔵書 {
	private String 名前;
	private 蔵書カテゴリ カテゴリ;
	private 蔵書状態 状態;

	public 蔵書(String 名前, 蔵書カテゴリ カテゴリ, 蔵書状態 状態) {
		this.名前 = 名前;
		this.カテゴリ = カテゴリ;
		this.状態 = 状態;
	}

	public boolean is貸出中() {
		return this.状態 == 蔵書状態.貸出中;
	}

	public void set状態(蔵書状態 状態) {
		this.状態 = 状態;
	}
	
	public boolean 同じ蔵書(String 名前) {
		return this.名前 == 名前;  
	}

	public boolean 同じカテゴリ(蔵書カテゴリ カテゴリ) {
		return this.カテゴリ == カテゴリ;
	}
	
	public 蔵書カテゴリ カテゴリ() {
		return this.カテゴリ;
	}
	
	public 蔵書状態 状態() {
		return this.状態;
	}

	@Override
	public String toString() {
		return "蔵書 [名前=" + 名前 + ", カテゴリ=" + カテゴリ + ", 状態=" + 状態 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(名前, カテゴリ, 状態);
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
		return 名前 == other.名前;
	}

}
