package org.apache.dubbo.benchmark;

import org.apache.dubbo.summary.bean.SummaryPage;
import org.apache.dubbo.summary.bean.SummaryUser;
import org.apache.dubbo.summary.service.SummaryUserService;

public class SummaryAction {
	
	private  static SummaryUserService summaryUserService;
			
	public void setSummaryUserService(SummaryUserService summaryUserService) {
		SummaryAction.summaryUserService = summaryUserService;
	}
	
	public static SummaryUserService getSummaryUserService() {
		return summaryUserService;
	}

    public void start() throws Exception {
        SummaryPage<SummaryUser> page = summaryUserService.listUser(13);
        System.out.println("<<<--------->>> " + page);
    }
}
