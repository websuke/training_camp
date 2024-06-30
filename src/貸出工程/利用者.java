package 貸出工程;

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
}
