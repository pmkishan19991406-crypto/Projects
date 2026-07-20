package com.kishan.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.model.LeaveRequest;
import com.kishan.repository.LeaveRequestRepository;

@Service
public class LeaveServiceImpl implements ILeaveService {

	@Autowired
	private LeaveRequestRepository lrepo;

	@Override
	public void applyLeave(LeaveRequest leaveRequest) {
		lrepo.save(leaveRequest);
	}

	@Override
	public List<LeaveRequest> viewMyLeaves(Integer empId) {
		return lrepo.findByEmpId(empId);
	}

	@Override
	public LeaveRequest getLeaveById(Integer leaveId) {
		return lrepo.findById(leaveId).orElse(null);
	}

	@Override
	public void cancelLeave(Integer leaveId) {
		lrepo.deleteById(leaveId);
	}

	@Override
	public List<LeaveRequest> getAllLeaves() {
		return lrepo.findAll();
	}

	

}