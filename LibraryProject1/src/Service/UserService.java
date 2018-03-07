package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DTO.BookDTO;
import DTO.IssueBookDTO;
import DTO.UserDTO;
import dao.IUserDao;

@Service("userService")
public class UserService implements IUserService {

	
	@Autowired
	IUserDao userDao;
	
	public void addUser(UserDTO userDTO){
		userDao.saveBook(userDTO);
	}

	@Override
	public List<BookDTO> getBooks() {
		// TODO Auto-generated method stub
		return userDao.getBooks();
	}

	@Override
	public List<UserDTO> getUsers() {
		// TODO Auto-generated method stub
		return userDao.getUsers();
	}

	@Override
	public int issueBook(IssueBookDTO issueBook) {
		// TODO Auto-generated method stub
		return userDao.issueBook(issueBook);
	}
}



