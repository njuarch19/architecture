package com.example.arch.repository;

import com.example.arch.entity.Commodity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author hxh
 * @date 2019-02-21 12:13
 */
@Repository
public interface CommodityRepository extends CrudRepository<Commodity,Integer> {
}
