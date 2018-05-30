package com.jpm.robotics.server.services;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.jpm.robotics.server.controller.RobotStateRes;
import com.jpm.robotics.server.datasource.CommandsState;

@Component
public class RobotStateService {

//	stateMap.put("BaseFlag", "Y");
//	stateMap.put("ProceedToLockerFlag", "N");
//	stateMap.put("LockerOpenedFlag", "N");
//	stateMap.put("ReachedLockerFlag", "N");
//	stateMap.put("ProceedToDeskFlag", "Y");
//	stateMap.put("ReachedDeskFlag", "Y");
//	stateMap.put("DeliveredFlag", "Y");

	Logger log = Logger.getLogger("RobotStateService.class");

	public RobotStateRes getStates() {
		RobotStateRes oRobotStateRes = new RobotStateRes();
		
		Map<String, String> robotMap = CommandsState.getState();
		oRobotStateRes.setAtBase(robotMap.get("BaseFlag"));
		oRobotStateRes.setProceedToLocker(robotMap.get("ProceedToLockerFlag"));
		oRobotStateRes.setLockerOpened(robotMap.get("LockerOpenedFlag"));
		oRobotStateRes.setReachedLocker(robotMap.get("ReachedLockerFlag"));
		oRobotStateRes.setProceedToDesk(robotMap.get("ProceedToDeskFlag"));
		oRobotStateRes.setReachedDesk(robotMap.get("ReachedDeskFlag"));
		oRobotStateRes.setPackageDelivered(robotMap.get("DeliveredFlag"));
		oRobotStateRes.setUser(robotMap.get("User"));		
		
		return oRobotStateRes;
	}
	
	public RobotStateRes updateState(String action, String user) {
		log.info("Request Received for change State for user: " + user + " | action " + action);
		Map<String, String> robotMap = CommandsState.getState();
		if(!StringUtils.isEmpty(user)) {
			if(user.endsWith("1")) {
				robotMap.put("User", "1");
				log.info(" User 1 Registered");
			} else if(user.endsWith("2")) {
				log.info(" User 2 Registered");
				robotMap.put("User", "2");
			} else if(user.endsWith("3")) {
				log.info(" User 3 Registered");
				robotMap.put("User", "3");
			}else if(user.endsWith("4")) {
				log.info(" User 4 Registered");
				robotMap.put("User", "4");
			} else if(user.endsWith("5")) {
				log.info(" User 5 Registered");
				robotMap.put("User", "5");
			} else if(user.endsWith("6")) {
				log.info(" User 6 Registered");
				robotMap.put("User", "6");
			} else if(user.endsWith("7")) {
				log.info(" User 7 Registered");
				robotMap.put("User", "7");
			} else if(user.endsWith("8")) {
				log.info(" User 8 Registered");
				robotMap.put("User", "8");
			} else if(user.endsWith("9")) {
				log.info(" User 9 Registered");
				robotMap.put("User", "9");
			}
		}
		
		// Action One: 
		if(action.equalsIgnoreCase("start")) {
			log.info(" Start: Leave Base, Proceed to Locker ");
			robotMap.put("BaseFlag", "N");
			robotMap.put("ProceedToLockerFlag", "Y");
		} else if(action.equalsIgnoreCase("reachedLocker")) {
			log.info(" reachedLocker: reachedLocker");
			robotMap.put("ReachedLockerFlag", "Y");
			robotMap.put("ProceedToLockerFlag", "N");
		} else if(action.equalsIgnoreCase("lockerOpened")) {
			log.info(" lockerOpened: Locker Opened, Received Package, Now Proceed to Desk for User " + user);
			robotMap.put("LockerOpenedFlag", "Y");
			robotMap.put("ProceedToDeskFlag", "Y");
		} else if(action.equalsIgnoreCase("reachedDesk")) {
			log.info(" reachedLocker: reachedDesk");
			robotMap.put("ReachedDeskFlag", "Y");
			robotMap.put("ProceedToDeskFlag", "N");
		} else if(action.equalsIgnoreCase("packageDelivered")) {
			log.info(" delivered: Desk Contents Delivered");
			robotMap.put("DeliveredFlag", "Y");
		} else if(action.equalsIgnoreCase("reachedBase")) {
			log.info(" reachedBase: Resetting the Robot State");
			resetState(robotMap);
		} 
		
		return getStates();
	}
	
	public RobotStateRes resetStatus() {
		log.info("Request Received for reset State for user ");
		Map<String, String> robotMap = CommandsState.getState();
		resetState(robotMap);

		return getStates();
	}
	
	private void resetState(Map<String, String> stateMap) {
		stateMap.put("BaseFlag", "Y");
		stateMap.put("ProceedToLockerFlag", "N");
		stateMap.put("LockerOpenedFlag", "N");
		stateMap.put("ReachedLockerFlag", "N");
		stateMap.put("ProceedToDeskFlag", "N");
		stateMap.put("ReachedDeskFlag", "N");
		stateMap.put("DeliveredFlag", "N");
		stateMap.put("User", "0");

	}
}






