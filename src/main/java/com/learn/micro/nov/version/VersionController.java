package com.learn.micro.nov.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

	// Normal Versioning
	@GetMapping("/V1/Person")
	public Person1 personv1() {
		return new Person1("Varun Garg");
	}
	
	@GetMapping("/V2/Person")
	public Person2 personv2() {
		return new Person2(new Name ("Varun", "Garg"));
	}
	// Parameter Versioning
	@GetMapping(value ="/name/Person", params="version=1")
	public Person1 paramv1() {
		return new Person1("Varun Garg");
	}
	
	@GetMapping(value ="/name/Person", params="version=2")
	public Person2 paramv2() {
		return new Person2(new Name ("Varun", "Garg"));
	}
	// Header Versioning
	@GetMapping(value ="/header/Person", headers ="version=1")
	public Person1 headerv1() {
		return new Person1("Varun Garg");
	}
	
	@GetMapping(value ="/header/Person", headers="version=2")
	public Person2 headerv2() {
		return new Person2(new Name ("Varun", "Garg"));
	}
	// Producer Versioning
	@GetMapping(value ="/produce/Person", produces ="application/V1+json")
	public Person1 producev1() {
		return new Person1("Varun Garg");
	}
	
	@GetMapping(value ="/produce/Person", produces="application/V2+json")
	public Person2 producev2() {
		return new Person2(new Name ("Varun", "Garg"));
	}
	
}
