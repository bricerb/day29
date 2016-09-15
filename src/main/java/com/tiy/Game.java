package com.tiy;

import javax.persistence.*;

/**
 * Created by Brice on 9/15/16.
 */
@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String platform;

    @Column(nullable = false)
    String genre;

    @Column(nullable = false)
    int releaseYear;

    // From the games' perspective, it is a Many(possible games) to One(user) relationship. Every game HAS to have a user. Not every user HAS to have a game, but can have many.
    @ManyToOne
    User user;

    public Game() {
    }

    public Game(String name, String platform, String genre, int releaseYear, User user) {
        this.name = name;
        this.platform = platform;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.user = user;
    }
}
