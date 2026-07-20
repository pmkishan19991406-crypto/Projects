package com.kishan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kishan.model.LeaveRequest;
import com.kishan.service.IManagerService;

@RestController
@RequestMapping("/manager")
@CrossOrigin("*")
public class ManagerController {

	@Autowired
	private IManagerService managerService;

	@GetMapping("/pending")
	public List<LeaveRequest> getPendingLeaves() {

		return managerService.getPendingLeaves();
	}

	@PutMapping("/approve/{leaveId}")
	public void approveLeave(@PathVariable Integer leaveId) {

		managerService.approveLeave(leaveId);
	}

	@PutMapping("/reject/{leaveId}")
	public void rejectLeave(@PathVariable Integer leaveId) {

		managerService.rejectLeave(leaveId);
	}

}