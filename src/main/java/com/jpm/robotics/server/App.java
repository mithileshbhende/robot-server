package com.jpm.robotics.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@ComponentScan("com.jpm.robotics")
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);

    }
}
