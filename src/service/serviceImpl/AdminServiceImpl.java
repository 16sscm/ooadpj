package service.serviceImpl;

import entity.user.Admin;
import service.AdminService;

public class AdminServiceImpl implements AdminService {
    @Override
    public Admin login(String ac, String paw) {
        return new Admin(ac,paw);
    }
}
