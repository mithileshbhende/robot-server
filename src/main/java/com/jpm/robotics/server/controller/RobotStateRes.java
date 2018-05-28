package com.jpm.robotics.server.controller;

public class RobotStateRes {

//	stateMap.put("BaseFlag", "Y");
//	stateMap.put("ProceedToLockerFlag", "N");
//	stateMap.put("LockerOpenedFlag", "N");
//	stateMap.put("ReachedLockerFlag", "N");
//	stateMap.put("ProceedToDeskFlag", "Y");
//	stateMap.put("ReachedDeskFlag", "Y");
//	stateMap.put("DeliveredFlag", "Y");
//
//	
	private String atBase;
	private String proceedToLocker;
	private String lockerOpened;
	private String reachedLocker;
	private String proceedToDesk;
	private String reachedDesk;
	private String packageDelivered;
	private String user;
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getAtBase() {
		return atBase;
	}
	public void setAtBase(String atBase) {
		this.atBase = atBase;
	}
	public String getProceedToLocker() {
		return proceedToLocker;
	}
	public void setProceedToLocker(String proceedToLocker) {
		this.proceedToLocker = proceedToLocker;
	}
	public String getLockerOpened() {
		return lockerOpened;
	}
	public void setLockerOpened(String lockerOpened) {
		this.lockerOpened = lockerOpened;
	}
	public String getReachedLocker() {
		return reachedLocker;
	}
	public void setReachedLocker(String reachedLocker) {
		this.reachedLocker = reachedLocker;
	}
	public String getProceedToDesk() {
		return proceedToDesk;
	}
	public void setProceedToDesk(String proceedToDesk) {
		this.proceedToDesk = proceedToDesk;
	}
	public String getReachedDesk() {
		return reachedDesk;
	}
	public void setReachedDesk(String reachedDesk) {
		this.reachedDesk = reachedDesk;
	}
	public String getPackageDelivered() {
		return packageDelivered;
	}
	public void setPackageDelivered(String packageDelivered) {
		this.packageDelivered = packageDelivered;
	}
	@Override
	public String toString() {
		return "RobotStateRes [atBase=" + atBase + ", proceedToLocker=" + proceedToLocker + ", lockerOpened="
				+ lockerOpened + ", reachedLocker=" + reachedLocker + ", proceedToDesk=" + proceedToDesk
				+ ", reachedDesk=" + reachedDesk + ", packageDelivered=" + packageDelivered + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atBase == null) ? 0 : atBase.hashCode());
		result = prime * result + ((lockerOpened == null) ? 0 : lockerOpened.hashCode());
		result = prime * result + ((packageDelivered == null) ? 0 : packageDelivered.hashCode());
		result = prime * result + ((proceedToDesk == null) ? 0 : proceedToDesk.hashCode());
		result = prime * result + ((proceedToLocker == null) ? 0 : proceedToLocker.hashCode());
		result = prime * result + ((reachedDesk == null) ? 0 : reachedDesk.hashCode());
		result = prime * result + ((reachedLocker == null) ? 0 : reachedLocker.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RobotStateRes other = (RobotStateRes) obj;
		if (atBase == null) {
			if (other.atBase != null)
				return false;
		} else if (!atBase.equals(other.atBase))
			return false;
		if (lockerOpened == null) {
			if (other.lockerOpened != null)
				return false;
		} else if (!lockerOpened.equals(other.lockerOpened))
			return false;
		if (packageDelivered == null) {
			if (other.packageDelivered != null)
				return false;
		} else if (!packageDelivered.equals(other.packageDelivered))
			return false;
		if (proceedToDesk == null) {
			if (other.proceedToDesk != null)
				return false;
		} else if (!proceedToDesk.equals(other.proceedToDesk))
			return false;
		if (proceedToLocker == null) {
			if (other.proceedToLocker != null)
				return false;
		} else if (!proceedToLocker.equals(other.proceedToLocker))
			return false;
		if (reachedDesk == null) {
			if (other.reachedDesk != null)
				return false;
		} else if (!reachedDesk.equals(other.reachedDesk))
			return false;
		if (reachedLocker == null) {
			if (other.reachedLocker != null)
				return false;
		} else if (!reachedLocker.equals(other.reachedLocker))
			return false;
		return true;
	}
	
	
}
