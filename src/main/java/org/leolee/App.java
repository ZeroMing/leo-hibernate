package org.leolee;

import org.junit.jupiter.api.Test;
import org.leolee.entity.User;
import org.leolee.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        UserService deptServie = (UserService) ac.getBean("userService");
        System.out.println(deptServie.getClass());
        User user = new User();
        user.setId(1);
        user.setName("111");
        deptServie.save(user);

    }
}
