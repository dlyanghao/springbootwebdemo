package work.yanghao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import work.yanghao.domain.User;
import work.yanghao.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(Model model){
        System.out.println("request success !");
        model.addAttribute("username","yanghao");
        model.addAttribute("password","123456");
        return "login";
    }

    @GetMapping("/users")
    public String getUser(int id,Model model){
        System.out.println("查询用户方法");
        User user = userService.getUser(id);
        model.addAttribute("user",user);
        return "index";
    }

    /*@PostMapping("/users")
    public String addUser(){
        System.out.println("添加用户方法");
        return "index";
    }

    @DeleteMapping("/users")
    public String deleteUser(){
        System.out.println("删除用户方法");
        return "index";
    }

    @PutMapping("/users")
    public String updateUser(){
        System.out.println("更新用户方法");
        return "index";
    }*/
}
