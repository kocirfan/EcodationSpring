package com.kocirfan.qualifier;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {

    //Default çalışcak olan kodlar
////   @Inject
////    private PatronInterface patronInterface;
////
////    public Calisan(){
////       // patronInterface=new Patron();
////    }

    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
