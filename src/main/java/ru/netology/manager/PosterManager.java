package ru.netology.manager;

import ru.netology.film.Film;

public class PosterManager {
    private Film[] items = new Film[0];
    private int resultLength = 10;
    public PosterManager() {
    }

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(Film item) {
        int length = items.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Film[] findAll() {
        return items;
    }

    public Film[] findLast() {
        if (items.length > resultLength) {
            resultLength = resultLength;

        } else {
            resultLength = items.length;
        }
        Film[] result = new Film[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}