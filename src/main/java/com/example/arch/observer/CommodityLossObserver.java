package com.example.arch.observer;

import com.example.arch.entity.Commodity;
import org.springframework.beans.factory.annotation.Autowired;

public class CommodityLossObserver extends Observer {
    public CommodityLossObserver() {}

    @Autowired
    Commodity commodity;

    @Override
    public void update() {

    }
}
