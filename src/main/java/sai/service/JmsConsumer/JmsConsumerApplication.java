package sai.service.JmsConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(Channel.class)
@SpringBootApplication
public class JmsConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsConsumerApplication.class, args);
    }

}
