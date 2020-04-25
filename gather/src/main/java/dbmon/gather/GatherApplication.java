package dbmon.gather;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication(scanBasePackages = "dbmon")
public class GatherApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatherApplication.class);
    }

}
