package io.lc.demo.controller;

import com.github.cage.Cage;
import io.lc.demo.dao.UserMapper;
import io.lc.demo.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.xml.bind.DatatypeConverter;
import java.security.SecureRandom;


@RestController@CrossOrigin@EnableAutoConfiguration
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private SecureRandom secureRandom;

    @RequestMapping("/register")
    public Integer register(@RequestBody User user) throws Exception {
        String username = user.getUsername();
        User user1 = userMapper.selectByUserName(username);

        if (user1 != null){
            throw new Exception("username has existed");
        }

        String password = user.getPassword();
     //   String salt = UUID.randomUUID().toString();
     //   String toEncPwd = password + salt;

        String encPwd = DigestUtils.md5DigestAsHex(password.getBytes());

        User user2 = new User();
        user2.setUsername(username);
        user2.setPassword(encPwd);
        user2.setHoildaynum(99);

        int insert = userMapper.insert(user2);

        return insert;
    }

    @RequestMapping("/login")
    public void login(@RequestParam(required = false) String username,
                      @RequestParam(required = false) String password) throws Exception {

        String OrEncPwd = DigestUtils.md5DigestAsHex(password.getBytes());

        User user = userMapper.selectByUser(username,OrEncPwd);
        if (user == null){
            throw new Exception("Login warning! Error account!");
        }

        String encPwd = user.getPassword();


        if(!encPwd.equals(OrEncPwd)){
            throw new Exception("Error passWord!");
        }
        String sessionId = httpSession.getId();
        httpSession.setAttribute(sessionId,user);


    }

    @GetMapping(value = "/getCaptcha",produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getCaptcha(){
        byte[] bytes = secureRandom.generateSeed(2);
        String captcha = DatatypeConverter.printHexBinary(bytes);
        String sessionId = httpSession.getId();
        httpSession.setAttribute(sessionId+"captcha",captcha);
        Cage cage = new Cage();
        byte[] draw = cage.draw(captcha);

        return draw;
    }

}
