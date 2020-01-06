package test;

import entity.UserTask;
import entity.UserTaskStatus;
import entity.user.Admin;
import entity.user.User;
import org.junit.Before;
import org.junit.Test;
import service.ReleaseTaskService;
import service.serviceImpl.AdminServiceImpl;
import service.serviceImpl.ReleaseTaskServiceImpl;
import service.serviceImpl.UserServiceImpl;


public class TaskRewardTest {
    User user;
    Admin admin;
    @Before
    public void setUp(){
        UserServiceImpl userService=new UserServiceImpl();
        user=userService.login("gyz","123");
        AdminServiceImpl adminService=new AdminServiceImpl();
        admin=adminService.login("gyzadm","123");
    }
    //管理员发布任务到用户
    @Test
    public void testReleaseTask(){
        UserTask task=new UserTask();
        task.setLimit(1);
        task.setRewards(5);
        task.setTaskName("test");
        task.setTaskStatus(UserTaskStatus.ACTIVE);

        ReleaseTaskService releaseTaskService=new ReleaseTaskServiceImpl();
        releaseTaskService.releaseTask(user,task);
        System.out.println("first:");
        System.out.println(user.getTaskPool().size());
        releaseTaskService.releaseTask(user,task);
        System.out.println("second:");
        System.out.println(user.getTaskPool().size());
    }
}
