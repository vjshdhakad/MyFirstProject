package dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import DTO.BookDTO;
import DTO.IssueBookDTO;
import DTO.UserDTO;

@Component("userDao")
public class UserDao implements IUserDao{

	@Autowired
	DataSource dataSource;
	
	public void saveBook(UserDTO userDTO){
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into student(id, book_name, author_name, book_addition, book_quantity) values(?,?,?,?,?)";
		int i = jdbcTemplate.update(sql, new Object[] {userDTO.getId(), userDTO.getBookName(), userDTO.getAuthorName(), userDTO.getBookAddition(), userDTO.getBookQuantity()});
		System.out.println("data inserted successfully: "+i);
		
	}
	public int issueBook(IssueBookDTO issueBook){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "insert into issuebook(user_id,book_id,created,is_return, return_date) values (?,?,current_timestamp,'N',current_timestamp)";
		int i = jdbcTemplate.update(sql, new Object[] {issueBook.getUserId(), issueBook.getBookId()});
		return i;
	}
	public List<BookDTO> getBooks(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select id, book_name from student";
		List<BookDTO> bookList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<BookDTO>(BookDTO.class));
		return bookList;
	}
	public List<UserDTO> getUsers(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select id, first_name from user";
		List<UserDTO> userList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
		return userList;
	}
	public List<IssueBookDTO> getBookIssued(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		String sql = "select user.id userId, user.first_name userName,book.id bookId, book.book_name  bookName from user,book,issuebook where issuebook.user_id=1 AND issuebook.user_id=user.id AND issuebook.book_id=book.id";
		List<IssueBookDTO> issueBookList = jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<IssueBookDTO>(IssueBookDTO.class));
		return issueBookList;
	}
}



