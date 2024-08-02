/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.learning.beans.colorLogger.serviços.impl;

import com.springboot.learning.beans.colorLogger.serviços.RedColorPrinter;
import org.springframework.stereotype.Component;

/**
 *
 * @author Leite Lima
 */

@Component
public class SpanishRedColorPrinter implements RedColorPrinter {
    
    @Override
    public String print(){
        return "Rojo";
    }
}
