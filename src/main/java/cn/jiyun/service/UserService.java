package cn.jiyun.service;

import cn.jiyun.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface UserService extends IService<User>{


    List<User> findAllUser();

    void add(User user);

    void del(int id);


    User findById(int id);

    void update(User user);
}
