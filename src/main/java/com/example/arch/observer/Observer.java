package com.example.arch.observer;

import com.example.arch.entity.Commodity;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Observer {
    @Autowired
    Commodity commodity;

    public abstract void update();
}
