package com.company.design1.IntelliJ.strategy;

public class AppendStrategy implements EncodingStrategy{
    @Override
    public String encode(String text) {
        return "ABCD"+text;
    }
}
