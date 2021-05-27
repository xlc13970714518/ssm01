package org.example.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TEST02 {


        @Test
        public void test() {

            List<String> list = Arrays.asList("aaaa", "bbbb", "cccc");

            //静态方法语法	ClassName::methodName
            list.forEach(TEST02::print);
        }

        public static void print(String content){
            System.out.println(content);
        }
    }


