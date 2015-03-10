/**
 * 
 */
package com.umedicine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author João
 *
 */
@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	
}
