package org.bhargav.researchsystemstest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("index")
public class IndexController {

	@RequestMapping("home")
	public String getHomePage() {
		return "welcome";
	}
}
