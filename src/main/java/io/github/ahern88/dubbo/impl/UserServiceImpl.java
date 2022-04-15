package io.github.ahern88.dubbo.impl;

import io.github.ahern88.dao.UserInfoDao;
import io.github.ahern88.domain.UserInfo;
import io.github.ahern88.dubbo.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@DubboService
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    public List<UserInfo> getUserList() {
        return userInfoDao.getAllList();
    }

    @Override
    public UserInfo getUserById(Long id) {
        return userInfoDao.getById(id);
    }

}
