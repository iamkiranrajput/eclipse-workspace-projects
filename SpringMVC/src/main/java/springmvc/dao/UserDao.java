package springmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import springmvc.controller.User;

@Repository
public class UserDao {

    private final HibernateTemplate hibernateTemplate;

    @Autowired
    public UserDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public int saveUser(User user) {
        return (Integer) hibernateTemplate.save(user);
    }
}
