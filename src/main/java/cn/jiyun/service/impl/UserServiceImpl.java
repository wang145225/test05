package cn.jiyun.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jiyun.pojo.User;
import cn.jiyun.mapper.UserMapper;
import cn.jiyun.service.UserService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        QueryWrapper<User> list=new QueryWrapper<>();
        return userMapper.selectList(list);
    }

    @Override
    public void add(User user) {
        userMapper.insert(user);
    }

    @Override
    public void del(int id) {
        userMapper.deleteById(id);
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Override
    public void update(User user) {
        userMapper.updateById(user);
    }


}
