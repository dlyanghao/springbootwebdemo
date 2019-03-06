package work.yanghao.service;

import org.mybatis.spring.annotation.MapperScan;
import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import work.yanghao.domain.User;
import work.yanghao.mapper.UserMapper;

/**
 * mybatis 3.4以上版本省略了映射文件(xml),直接在接口处标注一个注解@Mapper写上对应的数据库语句
 */
@Service
@MapperScan("work.yanghao.mapper")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void addUser(User user){
        try {
            userMapper.addUser(user);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    public User getUser(Integer id){
        User user = null;
        try {
            user = userMapper.findUser(id);
        } catch (UserException e) {
            e.printStackTrace();
        }
        return user;
    }

    public void getAllUsers(){
        try {
            userMapper.findUsers();
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(User user){
        try {
            userMapper.updateUser(user);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(Integer id){
        try {
            userMapper.removeUser(id);
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

    public void deleteAllUsers(){
        try {
            userMapper.romoveAllUsers();
        } catch (UserException e) {
            e.printStackTrace();
        }
    }

}
