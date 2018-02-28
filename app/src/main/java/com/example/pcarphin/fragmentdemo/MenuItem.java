package com.example.pcarphin.fragmentdemo;

/**
 * Created by pcarphin on 2018-02-27.
 */

public class MenuItem {

    private String name;
    private String description;

    public MenuItem(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
