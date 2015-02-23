package com.sasumikonranta.gostats;

/**
 * Created by Saz on 23.2.2015.
 */
import com.sasumikonranta.gostats.Item;
import java.util.ArrayList;
import java.util.Iterator;


public class List {

    private ArrayList<Item> lista;


    public List(){
        lista = new ArrayList<>();
    }
    public ArrayList getList(){
        return lista;
    }
    public void Add(Item i){
        lista.add(i);
    }


}
