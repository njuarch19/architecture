package com.example.arch.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author hxh
 * @date 2019-02-21 12:04
 */
@Data
@Entity
public class Category {
    @Id
    private int id;
    private int parentId;
    private String name;

    public Category() {
    }
}
