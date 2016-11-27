package com.vionov.q7;

interface Readable{
    public void readBook();
    public void setBookMark();
}

public class Book {
    public void readBook(){

    }
}

class EBook extends Book{
    public void readBook(){

    }
}

class App01{
    public static void main(String[] args) {
        Book t = new Book();
    }
}