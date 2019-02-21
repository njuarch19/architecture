package com.example.arch.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

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
    public Commodity() {
    }
}
