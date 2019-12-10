package sai.service.JmsConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import sai.service.JmsConsumer.model.Employee;

@EnableBinding(Sink.class)
@SpringBootApplication
public class JmsConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmsConsumerApplication.class, args);
    }

    @StreamListener(Sink.INPUT)
    public void handle(Employee employee) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("employee = " + employee.toString());
    }

}