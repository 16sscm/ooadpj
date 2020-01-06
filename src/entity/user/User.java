package entity.user;

import entity.Flow;
import entity.RewardPoint;
import entity.UserTask;

import java.util.ArrayList;

public class User {
    private String account;
    private String password;
    private String username;

    private RewardPoint rewardPoint;//用户积分
    private ArrayList<Flow>flows;//账户流水
    private ArrayList<UserTask> taskPool;//用户的任务池
//引用类型构造的时候防止为null
    public User(String account,String password) {
        this.account=account;
        this.password=password;
        this.rewardPoint=new RewardPoint();
        this.flows=new ArrayList<>();
        this.taskPool=new ArrayList<>();
    }
    public void addTask(UserTask task){
        taskPool.add(task);
    }
    public void addFlow(Flow flow){
        flows.add(flow);
    }
    public void addReward(int reward){
        rewardPoint.addReward(reward);
    }
    public void subReward(int reward){
        rewardPoint.subReward(reward);
    }

    public ArrayList<UserTask> getTaskPool() {
        return taskPool;
    }

    public int getRewardPointBalance() {
        return rewardPoint.queryBalance();
    }
}
