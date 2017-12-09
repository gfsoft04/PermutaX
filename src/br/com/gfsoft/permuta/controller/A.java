package br.com.gfsoft.permuta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/sistema")
public class A {
	
	@RequestMapping(value = "boasvindas", method = RequestMethod.GET)
	 public String boasVindas() {
		
		return "boasVindas";
	
	}

}
