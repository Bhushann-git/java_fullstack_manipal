package com.kkk.aop;

import java.lang.ProcessBuilder.Redirect;
import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kkk.aop.XL.XLReader;

import io.github.byc.smart.boot.core.AppConfig;

public final class App {
    public static void main(String[] args) {
      
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // XLReader reader =  ctx.getBean(XLReader.class);

        XLReader reader =  (XLReader) ctx.getBean("XLReader");
        reader.readXLData();
    }
}