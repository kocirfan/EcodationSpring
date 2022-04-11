package com.kocirfan.ioc_di;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "ioc_diCalisan")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;

    public Calisan(){
       // patronInterface=new Patron();
    }

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
