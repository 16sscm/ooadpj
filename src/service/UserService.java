package service;

import entity.user.User;

public interface UserService {
    User login(String account,String password);
}
