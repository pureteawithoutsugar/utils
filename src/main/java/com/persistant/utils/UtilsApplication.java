/**
 * Created by IntelliJ IDEA.
 * User: persistant
 * Date: 2020-07-09
 */
package com.persistant.utils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.persistant.utils"})
@SpringBootApplication
public class UtilsApplication {
    public static void main(String[] args) {
        SpringApplication.run(UtilsApplication.class, args);
    }
}
