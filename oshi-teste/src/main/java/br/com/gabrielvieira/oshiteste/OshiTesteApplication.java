package br.com.gabrielvieira.oshiteste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import oshi.SystemInfo;
import oshi.hardware.PowerSource;
import oshi.software.os.OSProcess;

//@SpringBootApplication
public class OshiTesteApplication {

    public static void main(String[] args) {
        SpringApplication.run(OshiTesteApplication.class, args);
    }
}