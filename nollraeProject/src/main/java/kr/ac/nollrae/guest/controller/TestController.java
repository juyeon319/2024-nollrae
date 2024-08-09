package kr.ac.nollrae.guest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.nollrae.guest.service.TestService;
import kr.ac.nollrae.guest.vo.Test;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	TestService service;
	
	@GetMapping("/list")
	String list() {
		List<Test> list = service.list();
		
		for(Test item : list)
			System.out.println(item.getUsersId());
		return "list";
	}
	
}
