package entity;
//积分，只能加减
public class RewardPoint {
    private int balance;

    public RewardPoint() {
        this.balance = 0;
    }

    public void addReward(int reward){
        this.balance+=reward;
    }
    public void subReward(int reward){
        this.balance-=reward;
    }
    public int queryBalance(){
        return this.balance;
    }
}
