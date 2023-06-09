package org.cuit.epoch;

import cn.dev33.satoken.SaManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.cuit.epoch.mapper")
public class HexoBlogSatokenApplication {

    public static void main(String[] args) {
        SpringApplication.run(HexoBlogSatokenApplication.class, args);
        System.out.println("\n启动成功：Sa-Token配置如下：" + SaManager.getConfig());
    }

}
