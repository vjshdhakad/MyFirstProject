package Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import DTO.BookDTO;
import DTO.IssueBookDTO;
import DTO.UserDTO;
import Service.IUserService;



@Controller
public class BookController {
	
	@Autowired	
 IUserService userservice;

//hello
	@RequestMapping(value = "/Book", method = RequestMethod.GET)
	public ModelAndView book() {
		return new ModelAndView("book");
	}
	@RequestMapping(value="saveBook" , method=RequestMethod.POST)
	public ModelAndView saveBook(@RequestParam("id") String id,@RequestParam("bookName") String bookName,@RequestParam("authorName") String authorName,@RequestParam("bookAddition") int bookAddition,@RequestParam("bookQuantity") int bookQuantity ){

	
		
		 UserDTO userDTO = new UserDTO();
		 userDTO.setId((id));
		 userDTO.setBookName(bookName);
		 userDTO.setAuthorName(authorName);
		 userDTO.setBookAddition(bookAddition);
		 userDTO.setBookQuantity(bookQuantity);
		 userservice.addUser(userDTO);
		 return new ModelAndView("book");
		
	}
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView issueBook(){
		ModelAndView model = new ModelAndView("issueBook");
		
		List<BookDTO> bookList = userservice.getBooks();
		List<UserDTO> userList = userservice.getUsers();
		
		model.addObject("bookList",bookList);
		model.addObject("userList",userList);
		
		return model;
	}
	@RequestMapping(value="/issueBook", method=RequestMethod.POST)
	public ModelAndView issueBookSave(@RequestParam("userId") String userId,@RequestParam("bookId") String bookId){
		ModelAndView model = new ModelAndView("issueBook");
		
		IssueBookDTO issueBook = new IssueBookDTO();
		issueBook.setUserId(userId);
		issueBook.setBookId(bookId);
		
		int i = userservice.issueBook(issueBook);
		System.out.println("record inserted : "+i);
		
		List<BookDTO> bookList = userservice.getBooks();
		List<UserDTO> userList = userservice.getUsers();
		
		model.addObject("bookList",bookList);
		model.addObject("userList",userList);
		
		return model;
	}
	@RequestMapping(value="/returnBook", method=RequestMethod.GET)
	public ModelAndView returnBook(){
		ModelAndView model = new ModelAndView("returnbook");
		
		List<UserDTO> userList = userservice.getUsers();
		
		model.addObject("userList",userList);
		
		return model;
	}
}
