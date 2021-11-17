package com.learn.micro.nov.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	@GetMapping("/V1/Person")
	public Person1 personv1() {
		return new Person1("Varun Garg");
	}
	
	@GetMapping("/V2/Person")
	public Person2 personv2() {
		return new Person2(new Name ("Varun", "Garg"));
	}
}
