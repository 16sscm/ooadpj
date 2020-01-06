package service.serviceImpl;

import entity.UserTask;
import entity.user.User;
import service.ReleaseTaskService;

import java.util.ArrayList;

public class ReleaseTaskServiceImpl implements ReleaseTaskService {

    @Override
    public void releaseTask(User user, UserTask userTask) {
        user.addTask(userTask);
    }
    @Override
    public void releaseTask(ArrayList<User> users, UserTask userTask) {

    }
}
