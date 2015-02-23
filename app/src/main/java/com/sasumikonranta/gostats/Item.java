package com.sasumikonranta.gostats;

/**
 * Created by Saz on 23.2.2015.
 */


public class Item {
    private int id;
    private String name;
    private String value;

    public Item(int id,String name, String value){
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

}
