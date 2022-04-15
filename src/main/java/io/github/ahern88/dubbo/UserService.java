package io.github.ahern88.dubbo;

import io.github.ahern88.domain.UserInfo;
import java.util.List;

public interface UserService {

    List<UserInfo> getUserList();

    UserInfo getUserById(Long id);

}
