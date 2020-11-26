package com.ebowin.logaudit.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface InfoLogStream {
    String INPUT = "base-in";

    @Input(INPUT)
    SubscribableChannel inboundInfoLogs();

}
