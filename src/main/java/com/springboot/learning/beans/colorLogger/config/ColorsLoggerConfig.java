/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.learning.beans.colorLogger.config;

import com.springboot.learning.beans.colorLogger.serviços.BlueColorPrinter;
import com.springboot.learning.beans.colorLogger.serviços.ColorsPrinter;
import com.springboot.learning.beans.colorLogger.serviços.RedColorPrinter;
import com.springboot.learning.beans.colorLogger.serviços.YellowColorPrinter;
import com.springboot.learning.beans.colorLogger.serviços.impl.ColorsPrinterImpl;
import com.springboot.learning.beans.colorLogger.serviços.impl.SpanishBlueColorPrinter;
import com.springboot.learning.beans.colorLogger.serviços.impl.SpanishRedColorPrinter;
import com.springboot.learning.beans.colorLogger.serviços.impl.SpanishYellowColorPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Leite Lima
 */
@Configuration
public class ColorsLoggerConfig {
    
    
    
    @Bean
    public RedColorPrinter redColorPrinter(){
        return new SpanishRedColorPrinter();
    }
    
    @Bean
    public BlueColorPrinter blueColorPrinter(){
        return new SpanishBlueColorPrinter();
    }
    
    @Bean
    public YellowColorPrinter yellowColorPrinter(){
        return new SpanishYellowColorPrinter();
    }
    
    @Bean
    public ColorsPrinter colorsPrinter(RedColorPrinter redColorPrinter, BlueColorPrinter blueColorPrinter, YellowColorPrinter yellowColorPrinter){
        return new ColorsPrinterImpl(redColorPrinter, blueColorPrinter, yellowColorPrinter);
    }
    
}
