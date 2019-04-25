package com.company.operation;

import com.company.service.BasicService;
import com.company.service.BasicServiceImpl;

public class BasicOperations {
    BasicService service = new BasicServiceImpl();

    public String execute(String text){
        return service.execute(text);
    }
}
