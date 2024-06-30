package 返却工程.ドメイン.返却予定;

import java.time.LocalDate;
import java.util.Objects;

import 返却工程.利用者;
import 返却工程.ドメイン.蔵書;

public class 返却予定 {
	private 蔵書 蔵書;
	private 利用者 利用者;
	private LocalDate 返却期限;

	public 返却予定(蔵書 蔵書, 利用者 利用者, LocalDate 返却期限) {
		super();
		this.蔵書 = 蔵書;
		this.利用者 = 利用者;
		this.返却期限 = 返却期限;
	}

	public boolean 返却期限切れ() {
		return LocalDate.now().isAfter(返却期限);
	}

	public 蔵書 蔵書() {
		return this.蔵書;
	}

	@Override
	public int hashCode() {
		return Objects.hash(利用者, 蔵書, 返却期限);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		返却予定 other = (返却予定) obj;
		return Objects.equals(利用者, other.利用者) && Objects.equals(蔵書, other.蔵書) && Objects.equals(返却期限, other.返却期限);
	}

}
