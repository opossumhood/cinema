package com.intellekta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;

@SpringBootApplication
public class CinemaApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(CinemaApplicationRun.class, args);
        LinkedList<Viewer> list = new LinkedList<>();
        list.add(new Viewer("Jack", 12));
        list.add(new Viewer("John", 21));
        list.add(new Viewer("Jim", 32));
        list.add(new Viewer("Jeff", 58));
        list.add(new Viewer("Jared", 11));
        System.out.println("Average age is " + ViewerStatistics.averageAge(list));

        Film matrix = new Film("Matrix", "Fantastic", 2.2);
        Film lordOfTheRings = new Film("Lord of the Rings", "Fantasy", 3.1);
        Film whiplash = new Film("Whiplash", "Drama", 2);
        Viewer max = new Viewer("Max", 25);
        max.getWatchedFilms().add(matrix);
        max.getWatchedFilms().add(lordOfTheRings);
        max.getWatchedFilms().add(whiplash);
        System.out.println(max.getNickname() + " have watched " + max.getWatchCount() + " films");

    }
}
