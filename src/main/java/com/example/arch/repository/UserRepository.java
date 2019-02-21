package com.example.arch.repository;

import com.example.arch.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author hxh
 * @date 2019-02-21 12:45
 */
@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    @Override
    default <S extends User> S save(S s) {
        return null;
    }

    @Override
    default <S extends User> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    default Optional<User> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @Override
    default Iterable<User> findAll() {
        return null;
    }

    @Override
    default Iterable<User> findAllById(Iterable<Integer> iterable) {
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
    default void delete(User user) {

    }

    @Override
    default void deleteAll(Iterable<? extends User> iterable) {

    }

    @Override
    default void deleteAll() {

    }
}
