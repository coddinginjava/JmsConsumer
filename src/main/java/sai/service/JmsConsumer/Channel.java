package sai.service.JmsConsumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Channel {

    @Input("email-output")
    SubscribableChannel consumeMessgae();
}
