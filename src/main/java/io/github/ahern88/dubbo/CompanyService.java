package io.github.ahern88.dubbo;

import io.github.ahern88.domain.CompanyInfo;

import java.util.List;

public interface CompanyService {

    List<CompanyInfo> getCompanyList();

    CompanyInfo getCompanyById(Long id);

}
