package com.example.arch.observer;

import com.example.arch.entity.Commodity;
import org.springframework.beans.factory.annotation.Autowired;

public class CommodityOverflowObserver extends Observer {
    public CommodityOverflowObserver() {}

    @Autowired
    private Commodity commodity;

    @Override
    public void update() {

    }
}
