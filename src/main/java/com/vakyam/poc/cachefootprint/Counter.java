package com.vakyam.poc.cachefootprint;

import org.springframework.stereotype.Component;

@Component
public class Counter {
    private int count;

    public int getCount(){
        return count;
    }

    public synchronized void incrementCount(){
        count++;
    }
}
