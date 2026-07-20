package com.kishan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kishan.model.LeaveRequest;
import com.kishan.service.ILeaveService;

@RestController
@RequestMapping("/leave")
@CrossOrigin("*")
public class LeaveController {

	@Autowired
	private ILeaveService leaveService;

	@PostMapping("/apply")
	public void applyLeave(@RequestBody LeaveRequest leave) {

		leaveService.applyLeave(leave);
	}

	@GetMapping("/employee/{empId}")
	public List<LeaveRequest> viewMyLeaves(@PathVariable Integer empId) {

		return leaveService.viewMyLeaves(empId);
	}

	@GetMapping("/{leaveId}")
	public LeaveRequest getLeaveById(@PathVariable Integer leaveId) {

		return leaveService.getLeaveById(leaveId);
	}

	@GetMapping("/all")
	public List<LeaveRequest> getAllLeaves() {

		return leaveService.getAllLeaves();
	}

	@DeleteMapping("/{leaveId}")
	public void cancelLeave(@PathVariable Integer leaveId) {

		leaveService.cancelLeave(leaveId);
	}

}