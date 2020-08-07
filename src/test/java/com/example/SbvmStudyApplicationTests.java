package com.example;


import com.example.model.Users;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import javax.sql.DataSource;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;

/*@RunWith(SpringJUnit4ClassRunner.class)*/
@SpringBootTest
public class SbvmStudyApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    RedisTemplate redisTemplate;

    @org.junit.Test
    public void contextLoads() {
        redisTemplate.opsForValue().set("mykey", "alden");
        System.out.println(redisTemplate.opsForValue().get("mykey"));
    }

    @org.junit.Test
    public void aapp() {
        System.out.println(dataSource.getClass().getName());
    }

    @org.junit.Test
    public void ccdd() {
        String uri = "/tymh_interface_sms/random_code/verify?id={0}&type={1}&randomcode={2}";
        String[] uris = uri.split("\\?");
        for (int i = 0; i < uris.length; i++) {
            System.out.println(uris[i]);
        }

    }

    public int one() {
        int i = 1 + 1;
        return i;
    }

    public int two() {
        int i = 2 + 1;
        return i;
    }

    public int thrie() {
        int i = 3 + 1;
        return i;
    }

    @org.junit.Test
    public void ccdd1() {

        Method method;
        //Object invoke = method.invoke(one(), 1);
        Users user = new Users();
        Users use1r = new Users();
        if (user.equals(use1r)) {

        }
        String q = "wo";
        String x = new String("wo");
        String a = x;
        a=a.concat("w");

        String fa="alden";
        StringBuffer st=new StringBuffer(fa);
     /*   //st.reverse();
        System.out.println(st.reverse());
        Stack ss=new Stack();
       // ss.push(fa);
        System.out.println(ss.push(fa));
        for (int i=0;i<ss.size();i++){
            System.out.println(ss.pop());
        }

                HashMap hh=new
        System.out.println(a);
        System.out.println(x);
        if (q.equals(a)) {

        }

*/
    }

}
