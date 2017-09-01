package com;

import com.acooly.core.common.BootApp;
import com.acooly.core.common.boot.Apps;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@BootApp(sysName = "springjsp",httpPort = 8803)
public class Main {
    public static void main(String[] args) {
        Apps.setProfileIfNotExists("sdev");
        SpringApplication.run(Main.class, args);
    }
}
