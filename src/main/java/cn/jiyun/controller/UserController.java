package cn.jiyun.controller;

import cn.jiyun.pojo.User;
import cn.jiyun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("ulist")
    public String findAllUser(Model model){
        List<User> uList=userService.findAllUser();
        System.out.println("11111");
        model.addAttribute("uList",uList);
        return "list";
    }

    @RequestMapping("toadd")
    public String toAdd(){
        return "add";
    }

    @RequestMapping("add")
    public String Add(User user){
        userService.add(user);

        System.out.println("121212");
        return "redirect:/user/ulist";
    }
    @RequestMapping("del")
    public String del(int id){
        userService.del(id);
        return "redirect:/user/ulist";
    }

    @RequestMapping("findById")
    public String findById(int id,Model model){
       User user=userService.findById(id);
       model.addAttribute("user",user);
        return "update";
    }

    @RequestMapping("update1")
    public String update(User user){
        userService.update(user);
        System.out.println("121212");
        return "redirect:/user/ulist";
    }
}
