package com.myspace.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class Spring4BootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring4BootWebApplication.class, args);
	}
}



@Controller
class GreetingController {

    @RequestMapping("/greet")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}