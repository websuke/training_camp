package practice.貸出;

import java.time.LocalDate;

public class 貸出 {
	private int 蔵書ID;
	private int 利用者ID;
	private LocalDate 返却期限;

	public 貸出(int 蔵書id, int 利用者id, LocalDate 返却期限) {
		super();
		this.蔵書ID = 蔵書id;
		this.利用者ID = 利用者id;
		this.返却期限 = 返却期限;
	}

	boolean 返却期限切れ() {
		return LocalDate.now().isAfter(返却期限);
	}
}
