package com.reactiveandroid.sample.models;

import com.reactiveandroid.Model;
import com.reactiveandroid.annotation.Column;
import com.reactiveandroid.annotation.PrimaryKey;
import com.reactiveandroid.annotation.Table;
import com.reactiveandroid.sample.AppDatabase;

@Table(name = "Folders", database = AppDatabase.class)
public class Folder extends Model {

    @PrimaryKey
    private Long id;
    @Column(name = "name")
    private String name;

    public Folder() {
    }

    public Folder(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
