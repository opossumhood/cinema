package com.intellekta;

import java.util.LinkedList;

public class Viewer {
    private String nickname;
    private int age;
    private final LinkedList<Film> watchedFilms;

    public Viewer(String nickname, int age) {
        if (nickname == null || nickname.isEmpty()) this.nickname = "default";
        else this.nickname = nickname;
        this.age = Math.max(0, age);
        this.watchedFilms = new LinkedList<>();
    }

    public LinkedList<Film> getWatchedFilms() {
        return watchedFilms;
    }

    public void setNickname(String nickname) {
        if (nickname == null || nickname.isEmpty()) this.nickname = "default";
        else this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getWatchCount() {
        return watchedFilms.size();
    }
}
