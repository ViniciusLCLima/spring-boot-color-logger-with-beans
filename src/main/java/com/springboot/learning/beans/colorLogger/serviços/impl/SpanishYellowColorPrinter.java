/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.learning.beans.colorLogger.serviços.impl;

import com.springboot.learning.beans.colorLogger.serviços.YellowColorPrinter;

/**
 *
 * @author Leite Lima
 */
public class SpanishYellowColorPrinter implements YellowColorPrinter {
    
    @Override
    public String print(){
        return "Amarillo";
    }
}
