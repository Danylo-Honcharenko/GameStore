package org.coursesjava.model;

import lombok.Data;

import java.util.Date;

@Data
public class Game {
    private int id;
    private String name;
    private Date release_date;
    private int rating;
    private int cost;
    private int description;
}
