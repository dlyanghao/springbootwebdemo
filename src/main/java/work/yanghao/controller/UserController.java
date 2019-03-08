package work.yanghao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import work.yanghao.domain.User;
import work.yanghao.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(Model model){
//        System.out.println("request success !");
//        model.addAttribute("username","yanghao");
//        model.addAttribute("password","123456");
        return "login";
    }

    @GetMapping("/users")
    public String getUser(String userId,Model model){
        System.out.println("查询用户方法");
        if(null == userId) {
            List<User> allUsers = userService.getAllUsers();
            model.addAttribute("users",allUsers);
        }
        else {
            User user = userService.getUser(userId);
            model.addAttribute("user",user);
        }
        return "userinfo";
    }

    @PostMapping("/users")
    public String addUser(User user){
        System.out.println("添加用户方法");
        userService.addUser(user);
        return "index";
    }

    @DeleteMapping("/users")
    public String deleteUser(@RequestBody String id){
        System.out.println("删除用户方法");
        userService.deleteUser(id);
        return "index";
    }

    @PutMapping("/users")
    public String updateUser(User user){
        System.out.println("更新用户方法");
        userService.updateUser(user);
        return "index";
    }
}
