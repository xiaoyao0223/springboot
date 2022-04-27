package com.qust.springboot;

import com.qust.springboot.pojo.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private Dog dog;

    @Test
    public void test1(){
        System.out.println(dog.toString());
    }

    @Test
    void contextLoads() {
    }

}
