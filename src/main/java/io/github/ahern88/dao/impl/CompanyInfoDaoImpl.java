package io.github.ahern88.dao.impl;

import io.github.ahern88.dao.CompanyInfoDao;
import io.github.ahern88.domain.CompanyInfo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompanyInfoDaoImpl implements CompanyInfoDao {

    private List<CompanyInfo> datas = new ArrayList<>();

    {
        datas.add(new CompanyInfo(1L, "zto", "中通快递"));
        datas.add(new CompanyInfo(2L, "sto", "申通快递"));
        datas.add(new CompanyInfo(3L, "yunda", "韵达快递"));
        datas.add(new CompanyInfo(4L, "alibaba", "阿里巴巴"));
        datas.add(new CompanyInfo(5L, "pdd", "拼多多"));
        datas.add(new CompanyInfo(6L, "baidu", "百度"));
    }

    @Override
    public List<CompanyInfo> getAllList() {
        return this.datas;
    }

    @Override
    public CompanyInfo getById(Long id) {
        return this.datas.stream().filter(data -> data.getCompanyId().equals(id)).findFirst().orElse(null);
    }

}
