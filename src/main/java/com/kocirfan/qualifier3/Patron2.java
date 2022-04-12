package com.kocirfan.qualifier3;

@QualifierMultiple3(EFazlaSecenekler.BIRINCI)
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data){
        return "Qualifier Multiple 1" + data;
    }
}
