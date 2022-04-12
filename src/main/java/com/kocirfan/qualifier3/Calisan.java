package com.kocirfan.qualifier3;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {

    //Default çalışcak olan kodlar
//  @Inject
//   private PatronInterface patronInterface;
////
////    public Calisan(){
////       // patronInterface=new Patron();
////    }

    //enum kullanarak istediğim clası qualifier anatasyonuna geçerek çalıştırıyorum
    @Inject
    @QualifierMultiple3(EFazlaSecenekler.BIRINCI)
    private PatronInterface patronInterface;

    public String getData(String data){
        return patronInterface.surum(data);
    }
}
