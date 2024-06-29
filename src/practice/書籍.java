package practice;

import java.util.Objects;

public class 書籍 {
	private String 名前;
	private カテゴリ カテゴリ;

	public 書籍(String 名前, カテゴリ カテゴリ) {
		super();
		this.名前 = 名前;
		this.カテゴリ = カテゴリ;
	}

	public カテゴリ getカテゴリ() {
		return this.カテゴリ;
	}

	@Override
	public String toString() {
		return "書籍{" +
				"名前='" + 名前 + '\'' +
				", カテゴリ=" + カテゴリ +
				'}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(カテゴリ, 名前);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		書籍 other = (書籍) obj;
		return カテゴリ == other.カテゴリ && Objects.equals(名前, other.名前);
	}

}
