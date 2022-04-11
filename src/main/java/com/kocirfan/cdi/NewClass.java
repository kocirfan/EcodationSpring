package com.kocirfan.cdi;


import com.kocirfan.StudentDto;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class NewClass {

    //üretilen
    @Produces
    public String uretilenData( @New StudentDto studentDto){
        studentDto = StudentDto.builder().studentId(0L).studentName("irfan").build();


        return studentDto.getStudentName();
    }

    // tüketilen
    @Getter
    @Inject
    private String tuketilenData;

}
