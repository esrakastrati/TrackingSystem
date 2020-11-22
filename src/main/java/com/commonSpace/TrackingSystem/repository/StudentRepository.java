package com.commonSpace.TrackingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.commonSpace.TrackingSystem.domain.Student;
import com.commonSpace.TrackingSystem.domain.User;
 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}