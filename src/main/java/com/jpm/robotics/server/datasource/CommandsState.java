package com.jpm.robotics.server.datasource;

import java.util.HashMap;
import java.util.Map;

public class CommandsState {
	
	private static Map<String, String> stateMap = null;
	
	private CommandsState() {
		
	}
	
	
	public static Map<String, String> getState() {
		if(stateMap == null) {
			stateMap = new HashMap<String, String>();
			stateMap.put("BaseFlag", "Y");
			stateMap.put("ProceedToLockerFlag", "N");
			stateMap.put("LockerOpenedFlag", "N");
			stateMap.put("ReachedLockerFlag", "N");
			stateMap.put("ProceedToDeskFlag", "N");
			stateMap.put("ReachedDeskFlag", "N");
			stateMap.put("DeliveredFlag", "N");
			stateMap.put("User", "0");
		} 
		return stateMap;
	}

}
