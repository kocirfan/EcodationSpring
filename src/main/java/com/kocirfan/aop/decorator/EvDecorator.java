package com.kocirfan.aop.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;
import java.util.Locale;
@Decorator
abstract public class EvDecorator implements IEv {

    private @Inject @Delegate
    IEv iEv;

    @Override
    public String boyama(String data) {
        System.out.println("Decorator Buradaydı!!");
        String dataInformation=iEv.boyama(data);
        if(dataInformation.equals("yeşileboya")){
            dataInformation=dataInformation.toUpperCase();
        }

        return dataInformation;
    }
}
