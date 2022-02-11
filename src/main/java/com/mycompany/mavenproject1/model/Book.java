/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

/**
 *
 * @author carlos
 */
public class Book {
    
   private int id;
   private  String title;
   private long pages;
   
    public Book()
    {
 
    }
    public Book(int id, String title, long pages) {
        super();
        this.id = id;
        this.title = title;
        this.pages = pages;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public long getPages() {
        return pages;
    }
    public void setPages(long pages) {
        this.pages = pages;
    }
}
