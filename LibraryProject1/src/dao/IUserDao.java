package dao;

import java.util.List;

import DTO.BookDTO;
import DTO.IssueBookDTO;
import DTO.UserDTO;

public interface IUserDao {

	public void saveBook(UserDTO userDTO);
	public List<BookDTO> getBooks();
	public List<UserDTO> getUsers();
	public int issueBook(IssueBookDTO issueBook);
}