package io.github.ahern88.graphql;

import io.github.ahern88.dubbo.UserService;
import io.github.ahern88.domain.UserInfo;
import io.github.ahern88.dubbo.CompanyService;
import graphql.schema.DataFetcher;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class GraphQLDataFetchers {

    @DubboReference
    private UserService userService;

    @DubboReference
    private CompanyService companyService;

    public DataFetcher getUserListDataFetcher() {
        return dataFetchingEnvironment -> {
            return userService.getUserList();
        };
    }

    public DataFetcher getCompanyDataFetcher() {
        return dataFetchingEnvironment -> {
            UserInfo userInfo = dataFetchingEnvironment.getSource();
            Long companyId = userInfo.getCompanyId();
            if (companyId != null) {
                return companyService.getCompanyById((companyId));
            }
            return null;
        };
    }

}
