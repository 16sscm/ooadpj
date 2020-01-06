package service;

import entity.UserTask;
import entity.user.User;

import java.util.ArrayList;

public interface ReleaseTaskService {
    void releaseTask(User user, UserTask userTask);
    void releaseTask(ArrayList<User>users,UserTask userTask);
}
