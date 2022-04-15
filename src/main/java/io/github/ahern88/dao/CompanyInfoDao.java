package io.github.ahern88.dao;

import io.github.ahern88.domain.CompanyInfo;
import java.util.List;

public interface CompanyInfoDao {

    List<CompanyInfo> getAllList();

    CompanyInfo getById(Long id);

}
