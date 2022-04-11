package com.kocirfan.cdi;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// lombok kısmı
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


// cdi ==> bean
@Named(value = "namedtuto")
@ApplicationScoped
public class NamedClass {

    private Long namedId;
    private String namedData= "Merhabalar NamedClass Cdi Bean";
}
