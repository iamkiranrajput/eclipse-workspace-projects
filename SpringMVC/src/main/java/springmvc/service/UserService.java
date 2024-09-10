package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import springmvc.controller.User;
import springmvc.dao.UserDao;

@Service
//@Component
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public int createUser(User user) {
        return this.userDao.saveUser(user);
    }
}
