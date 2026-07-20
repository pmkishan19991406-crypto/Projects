package com.kishan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishan.enums.LeaveStatus;
import com.kishan.model.LeaveRequest;
import com.kishan.repository.LeaveRequestRepository;

@Service
public class ManagerServiceImpl implements IManagerService {

	@Autowired
	private LeaveRequestRepository lrepo;

	@Override
	public List<LeaveRequest> getPendingLeaves() {
		return lrepo.findByStatus(LeaveStatus.PENDING);
	}

	@Override
	public void approveLeave(Integer leaveId) {

		LeaveRequest leave = lrepo.findById(leaveId).orElse(null);

		if (leave != null) {
			leave.setStatus(LeaveStatus.APPROVED);
			lrepo.save(leave);
		}

	}

	@Override
	public void rejectLeave(Integer leaveId) {

		LeaveRequest leave = lrepo.findById(leaveId).orElse(null);

		if (leave != null) {
			leave.setStatus(LeaveStatus.REJECTED);
			lrepo.save(leave);
		}

	}

}