package org.arpit.java2blog.springboot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	//Get Request
	@RequestMapping("/helloworld")
	public ModelAndView hello()
	{
		String hellomessage="Hello world!!";
		return new ModelAndView("hello","message",hellomessage);
	}
	
	

}
