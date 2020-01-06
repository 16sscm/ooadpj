package service;

import entity.user.Admin;

public interface AdminService {
    Admin login(String ac,String paw);
}
