/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.learning.beans.colorLogger.serviços.impl;

import com.springboot.learning.beans.colorLogger.serviços.BlueColorPrinter;
import com.springboot.learning.beans.colorLogger.serviços.ColorsPrinter;
import com.springboot.learning.beans.colorLogger.serviços.RedColorPrinter;
import com.springboot.learning.beans.colorLogger.serviços.YellowColorPrinter;

/**
 *
 * @author Leite Lima
 */
public class ColorsPrinterImpl implements ColorsPrinter{
    private RedColorPrinter redColorPrinter;
    private BlueColorPrinter blueColorPrinter;
    private YellowColorPrinter yellowColorPrinter;
    
    public ColorsPrinterImpl(RedColorPrinter redColorPrinter, BlueColorPrinter blueColorPrinter, YellowColorPrinter yellowColorPrinter){
        this.redColorPrinter = redColorPrinter;
        this.blueColorPrinter = blueColorPrinter;
        this.yellowColorPrinter = yellowColorPrinter;
    }
    
    @Override
    public String print(){
        return String.join(" ", redColorPrinter.print(), blueColorPrinter.print(), yellowColorPrinter.print());
    }
}
