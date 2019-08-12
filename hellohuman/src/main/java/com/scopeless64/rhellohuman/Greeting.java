package com.scopeless64.rhellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class Greeting {
		
	@RequestMapping("")
    public String index(@RequestParam(value="name", required=false) String name) {
        if(name == null) {
        	return "<h3>Hello Human!</h3><br/><br/> Welcom to SpringBoot!";
        }else {return "<h3>Hello " + name + "!</h3>" + "<br/><br/> Welcom to SpringBoot!";
        }
	}
}

