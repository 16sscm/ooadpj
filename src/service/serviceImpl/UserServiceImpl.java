package service.serviceImpl;

import entity.user.User;
import service.UserService;

public class UserServiceImpl implements UserService {

    @Override//因为没有数据库，登录验证服务暂无合理实现,
    public User login(String account, String password) {
        return new User(account,password);
    }
}
