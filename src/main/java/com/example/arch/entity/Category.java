package com.example.arch.entity;

import lombok.Data;

/**
 * @author hxh
 * @date 2019-02-21 12:04
 */
@Data

public class Category {
    private int id;
    private int parentId;
    private String name;

    public Category() {
    }
}
