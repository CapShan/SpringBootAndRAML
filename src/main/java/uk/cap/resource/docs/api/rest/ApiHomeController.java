package uk.cap.resource.docs.api.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiHomeController {
	
	@RequestMapping("/")
	public String ApiHome(){
		return "redirect:/docs/api/index.html";
	}

}
