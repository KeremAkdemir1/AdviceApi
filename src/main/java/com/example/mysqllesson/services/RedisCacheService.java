package com.example.mysqllesson.services;


import org.springframework.stereotype.Service;

@Service
public class RedisCacheService {
   public String longRunningMethod() throws InterruptedException{
        Thread.sleep(5000);
        return "Method Working";
    }
}
