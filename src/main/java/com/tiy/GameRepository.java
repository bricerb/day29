package com.tiy;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Brice on 9/15/16.
 */
public interface GameRepository extends CrudRepository<Game, Integer> {
    List<Game> findByGenre(String genre);
    List<Game> findByReleaseYear(int year);

    // Allows to find games by the foreign key of user_id
    List<Game> findByUser(User user);

    @Query("SELECT g FROM Game g WHERE g.name LIKE ?1%")
    List<Game> findByNameStartsWith(String name);

}

