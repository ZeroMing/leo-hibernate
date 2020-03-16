package org.leolee.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.leolee.entity.User;

/**
 * @author: LeoLee <zeroming@163.com>
 * @date: 2020/3/16 12:03
 * @since:
 */
public class UserDao {

    // Spring与Hibernate整合： IOC容器注入
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    // 保存一个记录
    // Spring与Hibernate整合：事务管理交给Spring
    public void save(User dept) {
        sessionFactory.getCurrentSession().save(dept);
    }
}
