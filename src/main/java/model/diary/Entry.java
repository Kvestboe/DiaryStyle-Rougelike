package model.diary;

import model.interfaces.Persistable;

import java.util.ArrayList;

abstract class Entry implements Persistable {
    String author;
    ArrayList<String> tags;
    int depth;
    boolean defeated;

}

