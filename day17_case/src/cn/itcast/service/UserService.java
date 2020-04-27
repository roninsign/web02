package cn.itcast.service;

import cn.itcast.domain.PageBean;
import cn.itcast.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<User> findall();

    User login(User user);

    void addUser(User user);

    void deleteUser(String id);

    User findUserById(String id);

    void updateUser(User user);

    void delSelectedUser(String[] ids);

    PageBean<User> findUserByPage(String currentPage, String rows, Map<String, String[]> condition);
}
