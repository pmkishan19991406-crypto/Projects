package com.kishan.service;

import java.util.List;

import com.kishan.model.LeaveRequest;

public interface IManagerService {
	
	public List<LeaveRequest> getPendingLeaves();

	public void approveLeave(Integer leaveId);

	public void rejectLeave(Integer leaveId);

}
