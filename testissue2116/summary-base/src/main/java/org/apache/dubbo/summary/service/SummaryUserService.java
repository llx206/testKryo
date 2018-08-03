package org.apache.dubbo.summary.service;


import org.apache.dubbo.summary.bean.SummaryPage;
import org.apache.dubbo.summary.bean.SummaryUser;

public interface SummaryUserService {
    public boolean existUser(String email);

    public boolean createUser(SummaryUser user);

    public SummaryUser getUser(long id);

    public SummaryPage<SummaryUser> listUser(int pageNo);

}

