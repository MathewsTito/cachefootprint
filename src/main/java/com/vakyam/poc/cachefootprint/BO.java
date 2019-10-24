package com.vakyam.poc.cachefootprint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class BO {

    private static String mychars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXWZ '";

    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Autowired
    private Counter counter;

    @Cacheable("keys")
    public String getAccountKey(String accountNbr){
        logger.info("Inside BO.getAccountKey");

        counter.incrementCount();

        String key = Utils.generateRandomNumber(12);
        String seqNbr = Utils.generateRandomNumber(3);

        return key+"|"+seqNbr;

    }

    public int getCount(){
        return counter.getCount();
    }

}


