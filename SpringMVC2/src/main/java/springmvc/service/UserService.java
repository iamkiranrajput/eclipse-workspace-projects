package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import springmvc.controller.User;
import springmvc.dao.UserDao;

@Service
@Transactional
@Component
public class UserService {

    @Autowired
    private UserDao userDao;

    // Method to save a user
    public void save(User user) {
        userDao.save(user);
    }

    // Other methods related to user operations can be added here
}
