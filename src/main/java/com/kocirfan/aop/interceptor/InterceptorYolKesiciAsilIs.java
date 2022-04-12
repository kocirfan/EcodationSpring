package com.kocirfan.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.sound.midi.SysexMessage;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {

    @AroundInvoke public Object loglama(InvocationContext context){
        System.out.println("ilk hali" + context.getMethod().getName());

        // yol kesici olacak değişkenimiz
        boolean isLogin=false;

        // eğer yol kesilmezse devam edecek
        Object isContinue=null;

        if(isLogin){
            // önce sisteme giriş yapsın
            System.out.println("!! Giriş Yapınız");
            return null;
        }else {
            try {
                isContinue=context.proceed(); // devam etmesini sağlayan yapı
                System.out.println("Sonraki hali " +isContinue);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return isContinue;
    }
}
