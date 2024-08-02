/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.learning.beans.colorLogger.serviços.impl;
import com.springboot.learning.beans.colorLogger.serviços.BlueColorPrinter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author Leite Lima
 */

@Service
public class EnglishBlueColorPrinter implements BlueColorPrinter{
    
    @Override
    public String print(){
        return "Blue";
    }
}
