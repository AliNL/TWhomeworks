package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by 思念 on 2016/2/22.
 */
public class BookTest {

    @Test
    public void should_be_checked_out_only_once(){
        Book book = new Book("name", "author", "2016");
        assertTrue(book.checkOut());
        assertFalse(book.checkOut());
    }

    @Test
    public void should_be_returned_only_once(){
        Book book = new Book("name", "author", "2016");
        book.checkOut();
        assertTrue(book.returnBook());
        assertFalse(book.returnBook());
    }

    @Test
    public void should_be_checked_out_again_after_return(){
        Book book = new Book("name", "author", "2016");
        book.checkOut();
        assertTrue(book.returnBook());
        assertTrue(book.checkOut());
    }

}