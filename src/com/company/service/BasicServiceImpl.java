package com.company.service;
public class BasicServiceImpl implements BasicService {
    @Override
    public String execute(String text) {
        return text.toUpperCase();
    }
}
