package com.kocirfan.cdi;

//kapsam
//yaşam süresi
//kullanıma göre performans dönüsü

import javax.enterprise.context.*;
import javax.inject.Named;

@Named
//@ApplicationScoped ==> bütün uygulama boyunca ve bütün kullanıcılar için çalışır
//@RequestScoped ==> 1 istek boyunca
//@SessionScoped ==> 1 kullanıcı için yaşar, logout ile ölür
//@Dependent ==> jokerdir duruma göre çalışır
//@ConversationScoped ==> belli istek boyunca yaşar
//@SessionScoped ==> Bean 1 instance olmasını sağlar
public class ScopedClass {
}
