package com.springMVC.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        if(s == null){
            throw new RuntimeException("请传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try{
            return df.parse(s);
        }catch (Exception e){
            throw new RuntimeException("格式转化出了问题");
        }
    }
}
