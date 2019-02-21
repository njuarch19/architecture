package com.example.arch.repository;

import com.example.arch.entity.Commodity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author hxh
 * @date 2019-02-21 12:13
 */
@Repository
public interface CommodityRepository extends CrudRepository<Commodity,Integer> {
    @Override
    default <S extends Commodity> S save(S s) {
        return null;
    }

    @Override
    default <S extends Commodity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    default Optional<Commodity> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default Iterable<Commodity> findAll() {
        return null;
    }

    @Override
    default Iterable<Commodity> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void deleteById(Integer integer) {

    }

    @Override
    default void delete(Commodity commodity) {

    }

    @Override
    default void deleteAll(Iterable<? extends Commodity> iterable) {

    }

    @Override
    default void deleteAll() {

    }
}
