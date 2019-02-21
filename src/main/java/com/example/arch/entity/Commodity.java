package com.example.arch.entity;

import lombok.Data;

/**
 * @author hxh
 * @date 2019-02-21 12:03
 */
@Data
public class Commodity {
    private int id;
    private double price;
    private int number;
    private int alarm;
    private Category category;
    public Commodity() {
    }
}
