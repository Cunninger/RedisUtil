package com.redisdemo;


import com.redisdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Unit test for simple App.
 */
@SpringBootTest// 注解表示这是一个SpringBoot的测试类，有什么作用呢？它会自动加载SpringBoot的容器，也就是说，我们可以直接使用容器中的对象，比如@Autowired注入对象。
public class RedisdemoApplicationTests {
    @Autowired
    @Qualifier("redisTemplate")
    private RedisTemplate redisTemplate;

    public void test(){
        User user = new User("狂神说","3");
        redisTemplate.opsForValue().set("user",user);

    }
}