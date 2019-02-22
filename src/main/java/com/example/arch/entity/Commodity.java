package com.example.arch.entity;

import com.example.arch.observer.CommodityAlarmObserver;
import com.example.arch.observer.CommodityLossObserver;
import com.example.arch.observer.CommodityOverflowObserver;
import com.example.arch.observer.Observer;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * @author hxh
 * @date 2019-02-21 12:03
 */
@Data
@Entity
public class Commodity {
    @Id
    private int id;
    private double price;
    private int number;
    private int alarm;
    private Category category;
    private Commodity commodity;
    private CommodityOverflowObserver commodityOverflowObserver = new CommodityOverflowObserver();
    private CommodityLossObserver commodityLossObserver = new CommodityLossObserver();
    private CommodityAlarmObserver commodityAlarmObserver = new CommodityAlarmObserver();
    ArrayList<Observer> observerList;
    public Commodity() {
    }

    private void notifyAllObservers() {
        observerList.add(commodityAlarmObserver);
        observerList.add(commodityLossObserver);
        observerList.add(commodityOverflowObserver);
        for(Observer observer:observerList) {
            observer.update();
        }
    }

    public int getNumber() {
        return number;
    }

    public int getAlarm() {
        return alarm;
    }
}
