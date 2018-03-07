package Service;

import java.util.List;

import DTO.BookDTO;
import DTO.IssueBookDTO;
import DTO.UserDTO;

public interface IUserService {
	
	public void addUser(UserDTO userDTO);
	public List<BookDTO> getBooks();
	public List<UserDTO> getUsers();
	public int issueBook(IssueBookDTO issueBook);

}
