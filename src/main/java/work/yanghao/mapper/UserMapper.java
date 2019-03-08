package work.yanghao.mapper;


import org.omg.CORBA.UserException;
import org.springframework.transaction.annotation.Transactional;
import work.yanghao.domain.User;

import java.util.List;

public interface UserMapper {
	
	int addUser(User user) throws UserException;

	int removeUser(String id) throws UserException;
	
	int updateUser(User user) throws UserException;

	User findUser(String id) throws UserException;

	List<User> findUsers() throws UserException;

	int romoveAllUsers() throws UserException;
}
