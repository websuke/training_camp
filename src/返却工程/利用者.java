package 返却工程;

import java.util.Objects;

public class 利用者 {
	private String 利用者名;

	public 利用者(String 利用者名) {
		this.利用者名 = 利用者名;
	}

	@Override
	public String toString() {
		return "利用者{" +
				"利用者名='" + 利用者名 + '\'' +
				'}';
	}

	@Override
	public int hashCode() {
		return Objects.hash(利用者名);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		利用者 other = (利用者) obj;
		return Objects.equals(利用者名, other.利用者名);
	}

}
