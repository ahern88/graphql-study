package io.github.ahern88.controller;

import io.github.ahern88.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserInfoDao userInfoDao;

    @GetMapping("/user/list")
    public Object getUserList() {
        return userInfoDao.getAllList();
    }

}
