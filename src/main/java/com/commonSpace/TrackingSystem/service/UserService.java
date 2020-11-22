package com.commonSpace.TrackingSystem.service;
import com.commonSpace.TrackingSystem.domain.Student;
import com.commonSpace.TrackingSystem.domain.User;
import com.commonSpace.TrackingSystem.repository.StudentRepository;
import com.commonSpace.TrackingSystem.repository.UserRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service

public class UserService {
	 @Autowired
	    private UserRepository repo;
	
}
