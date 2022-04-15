package io.github.ahern88.domain;

import java.io.Serializable;

public class UserInfo implements Serializable {

    public UserInfo() {
    }

    public UserInfo(Long userId, String userName, Integer userAge, Long companyId) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.companyId = companyId;
    }

    private Long userId;

    private String userName;

    private Integer userAge;

    private Long companyId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}
