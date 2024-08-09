package kr.ac.nollrae.guest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuestMainController {

	@GetMapping("/")
	String guestMainPage() {
		return "guest/guestIndex";
	}
}
