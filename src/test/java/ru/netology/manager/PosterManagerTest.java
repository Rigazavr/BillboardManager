package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.film.Film;

public class PosterManagerTest {

    Film first = new Film(1, "Film1", "action");
    Film second = new Film(2, "Film2", "cartoon");
    Film third = new Film(3, "Film3", "comedy");
    Film fourth = new Film(4, "Film4", "action");
    Film fifth = new Film(5, "Film5", "horror");
    Film sixth = new Film(6, "Film6", "comedy");
    Film seventh = new Film(7, "Film7", "cartoon");
    Film eighth = new Film(8, "Film8", "history");
    Film ninth = new Film(9, "Film9", "action");
    Film tenth = new Film(10, "Film10", "cartoon");

    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        Film[] actual = manager.findLast();
        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual,expected);
    }
    @Test
    public void findAll1() {
        PosterManager manager = new PosterManager(5);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        Film[] actual = manager.findLast();
        Film[] expected = {tenth, ninth, eighth, seventh, sixth};

        Assertions.assertArrayEquals(actual,expected);
    }
    @Test
    public void findAll2() {
        PosterManager manager = new PosterManager(15);
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();
        manager.findLast();


        Film[] actual = manager.findLast();
        Film[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(actual,expected);
    }

    @Test
    public void findLast() {
        PosterManager manager = new PosterManager();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        manager.findAll();

        Film[] actual = manager.findAll();
        Film[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        Assertions.assertArrayEquals(actual,expected);
    }
}