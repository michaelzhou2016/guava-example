package ai.guiji.guava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry(proxyTargetClass = true)
@SpringBootApplication
public class GuavaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuavaExampleApplication.class, args);
    }

}
