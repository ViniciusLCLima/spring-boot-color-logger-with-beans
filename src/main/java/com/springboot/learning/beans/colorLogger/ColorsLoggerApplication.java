package com.springboot.learning.beans.colorLogger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import com.springboot.learning.beans.colorLogger.serviços.ColorsPrinter;


@SpringBootApplication
public class ColorsLoggerApplication implements CommandLineRunner {
        private ColorsPrinter colorsPrinter;
    
        public ColorsLoggerApplication(ColorsPrinter colorsPrinter){
            this.colorsPrinter = colorsPrinter;
        }

	public static void main(String[] args) {
		SpringApplication.run(ColorsLoggerApplication.class, args);
        }
        
        @Override
        public void run(final String... args){
            System.out.print(colorsPrinter.print());
        }

}
