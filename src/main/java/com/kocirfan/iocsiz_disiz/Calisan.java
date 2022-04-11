package com.kocirfan.iocsiz_disiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "iocsizCalisan")
@ApplicationScoped
public class Calisan {

     private Patron patron;

     public Calisan(){
         patron=new Patron();
     }

     public String getData(String data){
         return patron.surum(data);
     }
}
// calisan clası patron clasına sıkı bir bağlılık gösterdiği için
// bağlı olduğu class da yapılabilecek olan herhangi bir değişiklik
// calisan clasını doğrudan etkileyecektir.