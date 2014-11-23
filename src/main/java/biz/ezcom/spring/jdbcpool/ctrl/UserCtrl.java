package biz.ezcom.spring.jdbcpool.ctrl;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import biz.ezcom.spring.jdbcpool.dao.UserDao;
import biz.ezcom.spring.jdbcpool.po.User;

@Controller
@RequestMapping(value = { "/user" })
public class UserCtrl {
    @Resource
    private UserDao userDao;

    @RequestMapping(value = { "/find" })
    @ResponseBody
    public User find(int id) {
        User user = userDao.find(id);
        return user;
    }
}
