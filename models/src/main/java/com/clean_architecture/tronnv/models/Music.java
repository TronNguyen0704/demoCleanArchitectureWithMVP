package com.clean_architecture.tronnv.models;

public abstract class Music {
    public String TAG = "MODELS";
    protected String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Music music = (Music) o;

        return name != null ? name.equals(music.name) : music.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
