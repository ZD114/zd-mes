package com.zd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ZDApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(ZDApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  MES启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "  M       M    EEEEEE   SSSSS   \n" +
                "  MM     MM    E      S         \n" +
                "  M M   M M    EEEEE    SSSSS    \n" +
                "  M  M M  M    E          S     \n" +
                "  M   M   M    EEEEEE   SSSSS   \n");

    }
}
