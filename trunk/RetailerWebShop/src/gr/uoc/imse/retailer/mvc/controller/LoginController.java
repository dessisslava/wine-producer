package gr.uoc.imse.retailer.mvc.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController
{

	@RequestMapping(method = GET)
	public void showLoginForm()
	{
		System.out.println( "Entered to login page!" );
	}
}
