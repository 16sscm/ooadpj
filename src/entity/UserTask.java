package entity;

import java.util.UUID;

import static entity.UserTaskStatus.ACTIVE;

public class UserTask {

    private int limit;//-1为无限，其他为限制次数
    private String taskName;
    private String taskDescription;
    private UserTaskStatus taskStatus;
    private int rewards;//执行任务获得的积分数

    public void setTaskStatus(UserTaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

//    public static void main(String[] args) {
//        UserTask task=new UserTask();
//        task.setTaskStatus(ACTIVE);
//    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setRewards(int rewards) {
        this.rewards = rewards;
    }
}
