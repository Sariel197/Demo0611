package io.lc.demo.controller;

import io.lc.demo.dao.UserMapper;
import io.lc.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController@CrossOrigin@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/register")
    public Integer register(@RequestBody User user) throws Exception {
        String username = user.getUsername();
        User user1 = userMapper.selectByUserName(username);

        if (user1 != null){
            throw new Exception("username has existed");
        }

        String password = user1.getPassword();
        String salt = UUID.randomUUID().toString();
        String toEncPwd = password + salt;

        String encPwd = DigestUtils.md5DigestAsHex(toEncPwd.getBytes());


        return null;
    }

    @RequestMapping("/login")
    public User login(@RequestParam(required = false) String username,
                      @RequestParam(required = false) String password) throws Exception {
        User user = userMapper.selectByUser(username,password);
        if (user == null){
            throw new Exception("username doesn't exist");
        }

       // user.getSalt();
        return user;
    }
}
