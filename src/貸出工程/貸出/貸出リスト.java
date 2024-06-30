package 貸出工程.貸出;

import 貸出工程.利用者;
import 貸出工程.蔵書;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class 貸出リスト {
    private static List<貸出> 貸出リスト = new ArrayList<>();

    public static void 貸し出す(利用者 利用者, LocalDate 貸出日, 蔵書 蔵書) {
        貸出リスト.add(new 貸出(利用者, 貸出日, 蔵書));
    }

    public static void print() {
        if (貸出リスト.isEmpty()){
            System.out.println("貸出中の蔵書はありません。");
        } else {
            for (貸出 貸出 : 貸出リスト) {
                System.out.println(貸出);
            }
        }
    }
}
