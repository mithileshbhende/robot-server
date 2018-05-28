/**
 * 
 */
package com.jpm.robotics.server.controller;

import java.util.logging.Logger;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpm.robotics.server.services.RobotStateService;

/**
 * @author mithi
 *
 */
@RestController
public class RobotController {
	
	Logger log = Logger.getLogger("RobotController.class");
	
	@Autowired
	private RobotStateService oRobotStateService;
	
	@GetMapping("/commands")
	public ResponseEntity<?> robotState(@RequestParam(value="user", required=false) String user, @RequestParam(value="updateState" , required=false) String action) {
		log.info("Request Received for Controlling Robot State for user: " + user + " | action " + action);
		if(StringUtils.isEmpty(action)) {
			RobotStateRes response = oRobotStateService.getStates();
			return new ResponseEntity<>(response, HttpStatus.OK);
		} else {
			RobotStateRes response = oRobotStateService.updateState(action, user);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}
	
	
	@GetMapping("/reset")
	public ResponseEntity<?> resetState() {
		RobotStateRes response = oRobotStateService.resetStatus();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}













