package com.kishan.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.kishan.enums.Department;
import com.kishan.enums.LeaveStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leave_request")
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leave_id")
    private Integer leaveId;

    @Column(name = "emp_id")
    private Integer empId;

    @Enumerated(EnumType.STRING)
    @Column(name = "department")
    private Department department;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "reason", length = 500)
    private String reason;

    @Column(name = "applied_date", insertable = false, updatable = false)
    private LocalDateTime appliedDate;

    @Column(name = "last_updated", insertable = false, updatable = false)
    private LocalDateTime lastUpdated;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private LeaveStatus status;

    @Column(name = "manager_comments", length = 500)
    private String managerComments;

    @Column(name = "approved_by")
    private Integer approvedBy;

    @Column(name = "approved_date")
    private LocalDateTime approvedDate;

    public LeaveRequest() {
    	System.out.println("Zero Argument Constructor of LeaveRequest loaded..");
    }

	public Integer getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Integer leaveId) {
		this.leaveId = leaveId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDateTime getAppliedDate() {
		return appliedDate;
	}

	public void setAppliedDate(LocalDateTime appliedDate) {
		this.appliedDate = appliedDate;
	}

	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public LeaveStatus getStatus() {
		return status;
	}

	public void setStatus(LeaveStatus status) {
		this.status = status;
	}

	public String getManagerComments() {
		return managerComments;
	}

	public void setManagerComments(String managerComments) {
		this.managerComments = managerComments;
	}

	public Integer getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Integer approvedBy) {
		this.approvedBy = approvedBy;
	}

	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDateTime approvedDate) {
		this.approvedDate = approvedDate;
	}

	@Override
	public String toString() {
		return "LeaveRequest [leaveId=" + leaveId + ", empId=" + empId + ", department=" + department + ", startDate="
				+ startDate + ", endDate=" + endDate + ", reason=" + reason + ", appliedDate=" + appliedDate
				+ ", lastUpdated=" + lastUpdated + ", status=" + status + ", managerComments=" + managerComments
				+ ", approvedBy=" + approvedBy + ", approvedDate=" + approvedDate + "]";
	}

    
}