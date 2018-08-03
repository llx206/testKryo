package org.apache.dubbo.summary.rpc;

import org.apache.dubbo.summary.bean.SummaryPage;
import org.apache.dubbo.summary.bean.SummaryUser;
import org.apache.dubbo.summary.service.SummaryUserService;
import org.apache.dubbo.summary.service.SummaryUserServiceServerImpl;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class AbstractClient {
    private final AtomicInteger counter = new AtomicInteger(0);
    private final SummaryUserService _serviceUserService = new SummaryUserServiceServerImpl();

    protected abstract SummaryUserService getUserService();

    public boolean existUser() throws Exception {
        String email = String.valueOf(counter.getAndIncrement());
        return getUserService().existUser(email);
    }

    public boolean createUser() throws Exception {
        int id = counter.getAndIncrement();
        SummaryUser user = _serviceUserService.getUser(id);
        return getUserService().createUser(user);
    }

    public SummaryUser getUser() throws Exception {
        int id = counter.getAndIncrement();
        return getUserService().getUser(id);
    }

    public SummaryPage<SummaryUser> listUser() throws Exception {
        int pageNo = counter.getAndIncrement();
        return getUserService().listUser(pageNo);
    }

}

