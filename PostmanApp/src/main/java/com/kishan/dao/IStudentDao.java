package com.kishan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.kishan.model.Student;
@Repository
public interface IStudentDao extends JpaRepository<Student, Integer> {

}
