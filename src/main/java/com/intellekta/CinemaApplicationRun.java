package com.intellekta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;

@SpringBootApplication
public class CinemaApplicationRun {
    public static void main(String[] args) {
        SpringApplication.run(CinemaApplicationRun.class, args);
        LinkedList<Viewer> list = new LinkedList<>();
        list.add(new Viewer("Jack", 12, 10));
        list.add(new Viewer("John", 21, 10));
        list.add(new Viewer("Jim", 32, 10));
        list.add(new Viewer("Jeff", 58, 10));
        list.add(new Viewer("Jared", 11, 10));
        System.out.println("Average age is " + ViewerStatistics.averageAge(list));
    }
}
