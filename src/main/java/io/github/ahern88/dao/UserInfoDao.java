package io.github.ahern88.dao;

import io.github.ahern88.domain.UserInfo;

import java.util.List;

public interface UserInfoDao {

    List<UserInfo> getAllList();

    UserInfo getById(Long id);

}
