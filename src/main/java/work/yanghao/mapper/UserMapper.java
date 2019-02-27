package work.yanghao.mapper;


import org.omg.CORBA.UserException;
import work.yanghao.domain.User;

import java.util.List;


public interface UserMapper {
	
	int addUser(User user) throws UserException;
	
	int removeUser(Integer id) throws UserException;
	
	int updateUser(User user) throws UserException;
	
	List<User> findUsers() throws UserException;
}