package org.apache.dubbo.summary.serialize;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import org.apache.dubbo.summary.bean.SummaryPage;
import org.apache.dubbo.summary.bean.SummaryUser;
import org.apache.dubbo.summary.service.SummaryUserService;

import java.util.Arrays;
import java.util.Collection;

public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class> getSerializableClasses() {
        return Arrays.asList(SummaryUser.class, SummaryPage.class, SummaryUserService.class);
    }
}
