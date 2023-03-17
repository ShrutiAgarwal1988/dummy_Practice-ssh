
package com.greatlearning.springMvcdemo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller

public class GoodMorningController {
	
	@RequestMapping("/")
public String printGoodMorning()
{
	return "abc";
}
}
