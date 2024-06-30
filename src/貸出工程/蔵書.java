package 貸出工程;

public class 蔵書 {
    private String 名前;

    public 蔵書(String 名前) {
        this.名前 = 名前;
    }
    
    

    public String 名前() {
		return 名前;
	}



	@Override
    public String toString() {
        return "蔵書{" +
                "名前='" + 名前 + '\'' +
                '}';
    }
}
