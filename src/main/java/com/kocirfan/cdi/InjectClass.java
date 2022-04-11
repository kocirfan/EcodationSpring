package com.kocirfan.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class InjectClass {

    @Inject
    List<String> tüketen;

    public List<String> getTüketen() {
        return tüketen;
    }
}
