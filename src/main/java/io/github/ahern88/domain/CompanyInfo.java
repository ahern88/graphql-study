package io.github.ahern88.domain;

import java.io.Serializable;

public class CompanyInfo implements Serializable {

    public CompanyInfo() {
    }

    public CompanyInfo(Long companyId, String companyCode, String companyName) {
        this.companyId = companyId;
        this.companyCode = companyCode;
        this.companyName = companyName;
    }

    private Long companyId;

    private String companyCode;

    private String companyName;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
