package pe.app.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class Welcome 
{
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String indexGET() {
		return "index";
	}
}
