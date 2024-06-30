package 貸出工程.貸出;

import java.time.LocalDate;

import 貸出工程.利用者;
import 貸出工程.蔵書;

public class 貸出 {
    private 利用者 利用者;
    private LocalDate 貸出日;
    private 蔵書 蔵書;

    public 貸出(利用者 利用者, LocalDate 貸出日, 蔵書 蔵書) {
        this.利用者 = 利用者;
        this.貸出日 = 貸出日;
        this.蔵書 = 蔵書;
    }
    
    public boolean 利用者一致している(利用者 利用者) {
    	return this.利用者.equals(利用者);
    }
    		

    @Override
    public String toString() {
        return "貸出{" +
                "利用者=" + 利用者 +
                ", 貸出日=" + 貸出日 +
                ", 蔵書=" + 蔵書 +
                '}';
    }
    
}
