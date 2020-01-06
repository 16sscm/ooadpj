package entity;

public class Flow {
    private int amount;
    private String desc;
    private boolean type;//true为收入，false为支出
    public Flow(int amount,String desc,boolean type) {
        this.amount=amount;
        this.desc=desc;
        this.type=type;
    }
}
