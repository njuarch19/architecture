package com.example.arch.repository;

import com.example.arch.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author hxh
 * @date 2019-02-21 12:13
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
    @Override
    default <S extends Category> S save(S s) {
        return null;
    }

    @Override
    default <S extends Category> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    default Optional<Category> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default Iterable<Category> findAll() {
        return null;
    }

    @Override
    default Iterable<Category> findAllById(Iterable<Integer> iterable) {
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
    default void delete(Category category) {

    }

    @Override
    default void deleteAll(Iterable<? extends Category> iterable) {

    }

    @Override
    default void deleteAll() {

    }
}
