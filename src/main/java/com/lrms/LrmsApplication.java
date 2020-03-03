
package com.lrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LrmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(LrmsApplication.class, args);
    }

}
