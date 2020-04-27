package cn.jiyun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class Demo13Application {

    public static void main(String[] args) {
        System.out.println("被加载了");
        SpringApplication.run(Demo13Application.class, args);

    }

}
