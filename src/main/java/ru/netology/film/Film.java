package ru.netology.film;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Film {
    private int id;
    private String filmName;
    private String genre;
}