/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.controller;

import java.util.List;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mycompany.mavenproject1.model.Book;
import com.mycompany.mavenproject1.service.BookService;
/**
 *
 * @author carlos
 */
@Path("bookService")
@Produces(MediaType.APPLICATION_JSON)
public class BookController {
    
    BookService bookService = new BookService();
 
    @Path("/books")
    @GET
    public List<Book> getBooks() {
        List<Book> listOfBooks = bookService.getAllBooks();
        return listOfBooks;
    }
 
    @Path("/book/{id}")
    @GET
    public Book getBookById(@PathParam(value = "id") int id) {
        return bookService.getBook(id);
    }
 
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/books")
    @POST
    public Book addBook(Book Book) {
        return bookService.addBook(Book);
    }
 
    @Path("/books")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Book updateBook(Book Book) {
        return bookService.updateBook(Book);
 
    }
 
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/book/{id}")
    @DELETE
    public void deleteBook(@PathParam(value = "id")int id) {
        bookService.deleteBook(id);
 
    }
}
