package com.kocirfan.qualifier3;


import javax.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data){
        return " default " + data;
    }
}
