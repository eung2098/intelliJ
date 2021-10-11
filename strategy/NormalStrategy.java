package com.company.design1.IntelliJ.strategy;

public class NormalStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return text;
    }
}
