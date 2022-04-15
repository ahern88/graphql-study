package io.github.ahern88.dao.impl;

import io.github.ahern88.dao.UserInfoDao;
import io.github.ahern88.domain.UserInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserInfoDaoImpl implements UserInfoDao {

    private List<UserInfo> datas = new ArrayList<>();

    {
        datas.add(new UserInfo(1L, "zhangsan", 22, 1L));
        datas.add(new UserInfo(2L, "lisi", 23, 2L));
        datas.add(new UserInfo(3L, "wangwu", 24, 1L));
        datas.add(new UserInfo(4L, "langzhang", 25, 1L));
        datas.add(new UserInfo(5L, "zhaoliu", 26, 2L));
        datas.add(new UserInfo(6L, "xiaoqi", 27, 2L));
        datas.add(new UserInfo(7L, "bage", 32, 3L));
        datas.add(new UserInfo(8L, "sige", 35, 3L));
        datas.add(new UserInfo(9L, "wudi", 36, 4L));
        datas.add(new UserInfo(10L, "liuye", 46, 5L));
        datas.add(new UserInfo(11L, "sanshu", 48, 6L));
        datas.add(new UserInfo(12L, "erjie", 37, 6L));
    }

    @Override
    public List<UserInfo> getAllList() {
        return this.datas;
    }

    @Override
    public UserInfo getById(Long id) {
        return this.datas.stream().filter(data -> data.getUserId().equals(id)).findFirst().orElse(null);
    }

}
