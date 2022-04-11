package com.kocirfan.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@ApplicationScoped
@Getter
@Setter
public class jsfBean {

    private String Selam;

    public jsfBean(){
        this.Selam="Spring ile uğraşıyom uöarım bu sefer çalışır";

    }


}
