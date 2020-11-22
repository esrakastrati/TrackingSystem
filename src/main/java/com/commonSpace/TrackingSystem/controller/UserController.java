package com.commonSpace.TrackingSystem.controller;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.commonSpace.TrackingSystem.domain.User;
import com.commonSpace.TrackingSystem.service.UserService;
 
@Controller
public class UserController {
	@Autowired
	
	private UserService userservice;
	

	
}
