package com.kocirfan.qualifier2;


import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data){
        return "Patron1 default " + data;
    }
}
