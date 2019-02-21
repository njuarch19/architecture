package com.example.arch.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author hxh
 * @date 2019-02-21 12:19
 */
@Data
@Entity
public class User {
    @Id
    public int id;
    public String username;
    public String password;

    public User() {
    }
}
