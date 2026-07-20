package com.kishan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishan.enums.LeaveStatus;
import com.kishan.model.LeaveRequest;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest, Integer> {

	List<LeaveRequest> findByEmpId(Integer empId);

	List<LeaveRequest> findByStatus(LeaveStatus status);
}
