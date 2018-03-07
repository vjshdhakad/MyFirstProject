package Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class Welcome {
	
	
	
	@RequestMapping(value="/registration" , method = RequestMethod.GET)
	public ModelAndView registration() {
		ModelAndView model = new ModelAndView("registration");
		return model;
	}

	/*@RequestMapping(value="/getUsers" , method = RequestMethod.GET)
	public ModelAndView getUsers(){
		 
		ModelAndView model = new ModelAndView("UserList");
		   List<UserDTO> userList = userService.getAllUsers();
		   model.addObject("UserList" , userList);
		   return model;
	}*/


}
