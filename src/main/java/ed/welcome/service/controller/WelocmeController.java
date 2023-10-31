package ed.welcome.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelocmeController {
	@Autowired
	Environment environment;
	
	@GetMapping("/welcome")
	public String welcome() {
		String port = environment.getProperty("local.server.port");
		return "Good Evening friends!!! : " +   " : " + port;
	}
}
