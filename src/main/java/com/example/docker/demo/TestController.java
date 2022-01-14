package com.example.docker.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:TestController
 * Package:
 *
 * @Date:2021/11/16 10:38
 * @Author:WenJiahu
 */
@RestController
public class TestController {

    @Autowired
    private Table1Mapper table1Mapper;

    @GetMapping("test01")
    public String test01() {

        return table1Mapper.selectById(1).getId();
    }

    @GetMapping("test02")
    public String test02() {

        return "hello,k8s";
    }

    @GetMapping("test03")
    public String test03() throws InterruptedException {
        Thread.sleep(3000);

        String s = "hello,k8s";
        System.out.println(s);
        return s;
    }

}
