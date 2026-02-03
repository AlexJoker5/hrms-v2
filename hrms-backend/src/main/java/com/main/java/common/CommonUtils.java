package com.main.java.common;

import java.util.ArrayList;
import java.util.List;

public class CommonUtils {
	
	public List<String> getRoles() {
		
		List<String> roleList = new ArrayList<>();
		roleList.add(CommonConstants.ROLE_EMPLOYEE);
		roleList.add(CommonConstants.ROLE_TEAM_LEADER);
		roleList.add(CommonConstants.ROLE_MANAGER);
		roleList.add(CommonConstants.ROLE_HR);
		roleList.add(CommonConstants.ROLE_ADMIN);
		return roleList;
		
	}

}
