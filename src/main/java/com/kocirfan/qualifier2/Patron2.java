package com.kocirfan.qualifier2;

@QualifierMultiple2
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "Patron2 Qualifier Multiple" + data;
    }
}
