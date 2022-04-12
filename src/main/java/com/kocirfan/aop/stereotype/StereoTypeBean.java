package com.kocirfan.aop.stereotype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@BenimStereoType
@Data @NoArgsConstructor @AllArgsConstructor
public class StereoTypeBean {
    private Long id;
    private String name="StereoTypeYazıyorum";
    private String trade;
}
// burada eklediğim annatasion ile
// ileride oluşabilecek annatasion fazlalığını
// tek bir yerden kontrol ediyorum
// ancak buna lombok dahil değil