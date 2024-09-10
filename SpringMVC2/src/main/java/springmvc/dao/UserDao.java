package springmvc.dao;

import org.springframework.stereotype.Repository;

import springmvc.controller.User;

@Repository
public interface UserDao {
    void save(User user);
    // Other CRUD methods can be added here
}