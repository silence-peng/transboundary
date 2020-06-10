package com.daji.configuration;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class StringToDate implements Converter<String, Timestamp> {
    @Override
    public Timestamp convert(String s) {

        Timestamp sql = Timestamp.valueOf(s);

        return sql;
    }


    public JavaType getInputType(TypeFactory typeFactory) {
        return null;
    }


    public JavaType getOutputType(TypeFactory typeFactory) {
        return null;
    }


}