package im.silen.vueboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class VueBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueBootApplication.class, args);
    }

}
