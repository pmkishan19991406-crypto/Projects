package com.kishan.service;

import java.util.List;

import com.kishan.model.LeaveRequest;

public interface ILeaveService {
	
	public void applyLeave(LeaveRequest leaveRequest);

	public List<LeaveRequest> viewMyLeaves(Integer empId);

	public LeaveRequest getLeaveById(Integer leaveId);

	public void cancelLeave(Integer leaveId);

	public List<LeaveRequest> getAllLeaves();

}
