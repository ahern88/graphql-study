package io.github.ahern88.dubbo.impl;

import io.github.ahern88.dao.CompanyInfoDao;
import io.github.ahern88.domain.CompanyInfo;
import io.github.ahern88.dubbo.CompanyService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@DubboService
@Component
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyInfoDao companyInfoDao;

    @Override
    public List<CompanyInfo> getCompanyList() {
        return companyInfoDao.getAllList();
    }

    @Override
    public CompanyInfo getCompanyById(Long id) {
        return companyInfoDao.getById(id);
    }
}
