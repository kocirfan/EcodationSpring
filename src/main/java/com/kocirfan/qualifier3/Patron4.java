package com.kocirfan.qualifier3;

@QualifierMultiple3(EFazlaSecenekler.UCUNCU)
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data){
        return "Qualifier Multiple 3" + data;
    }
}
