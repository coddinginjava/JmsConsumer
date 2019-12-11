package sai.service.JmsConsumer;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import sai.service.JmsConsumer.model.Employee;

@Service
public class MessageConsumer {

    @StreamListener(target = "email-output", condition = "headers['type']=='email_sending'")
    public void handle(@Payload  Employee employee) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("employee = " + employee.toString());
//        System.out.println("employee = [" + employee.getEmpid() + "]");
//        System.out.println("employee = [" + employee.getName() + "]");
//        System.out.println("employee = [" + employee.getAddress() + "]");
    }
}
