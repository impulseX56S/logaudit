package com.ebowin.logaudit.config;

import com.ebowin.logaudit.stream.InfoLogStream;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(InfoLogStream.class)
public class StreamConfig {
}
