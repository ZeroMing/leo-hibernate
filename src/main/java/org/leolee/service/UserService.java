package org.leolee.service;

import org.leolee.dao.UserDao;
import org.leolee.entity.User;

/**
 * @author: LeoLee <zeroming@163.com>
 * @date: 2020/3/16 12:04
 * @since:
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user){
        userDao.save(user);
    }
}
