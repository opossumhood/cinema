package com.intellekta;

public class Viewer {
    private String nickname;
    private int age;
    private int watchCount;

    public Viewer(String nickname, int age, int watchCount) {
        if (nickname == null || nickname.isEmpty()) this.nickname = "default";
        else this.nickname = nickname;
        this.age = Math.max(0, age);
        this.watchCount = Math.max(0, watchCount);
    }

    public void setWatchCount(int watchCount) {
        this.watchCount = watchCount;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getWatchCount() {
        return watchCount;
    }
}
