package com.faw.poc.iotclientmock;

import com.faw.poc.iotclientmock.DirectlyConnectedMock.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;
import java.io.File;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class IotclientmockApplication implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "MockMischiDeviceMock")
    private MockMischiDeviceMock mockMischiDeviceMock;

    @Value("${iot.client.remote.filedir}")
    private String fileDir;

    @Value("${iot.client.dev1.initfile.name}")
    private String dev1initfileName;

    @Value("${iot.client.dev2.initfile.name}")
    private String dev2initfileName;

    @Value("${iot.client.dev1.initfile.pwd}")
    private String dev1initfilePwd;

    @Value("${iot.client.dev2.initfile.pwd}")
    private String dev2initfilePwd;

    @Value("${iot.client.dev1.urn}")
    private String urn_dev1;

    @Value("${iot.client.dev2.urn}")
    private String urn_dev2;

    public static void main(String[] args) {
        System.setProperty("com.oracle.iot.client.disable_long_polling","false");

        SpringApplication.run(IotclientmockApplication.class, args);
    }

    @Override
    public void run(String... args) {
        if (args.length != 2){
           logger.error("Error input");
            return;
        }
        switch (Integer.parseInt(args[0])) {
            case 1:
                mockMischiDeviceMock.startWork(fileDir + File.separator + dev1initfileName, dev1initfilePwd, urn_dev1, args[1].toLowerCase());
                break;
            case 2:
                mockMischiDeviceMock.startWork(fileDir + File.separator + dev2initfileName, dev2initfilePwd, urn_dev2, args[1].toLowerCase());
                break;
        }
    }
}
