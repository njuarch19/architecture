package com.example.arch.repository;

import com.example.arch.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hxh
 * @date 2019-02-21 12:45
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

}
