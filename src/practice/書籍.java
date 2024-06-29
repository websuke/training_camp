package practice;

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
}
