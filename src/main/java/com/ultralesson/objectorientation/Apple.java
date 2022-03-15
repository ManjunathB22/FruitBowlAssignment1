package com.ultralesson.objectorientation;

import java.util.StringTokenizer;

public class Apple implements Fruits{
    private String color;
    private String size;
    private String type;

    public Apple(String color, String size, String type){
        this.color=color;
        this.size=size;
        this.type=type;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public String type() {
        return type;
    }
}
