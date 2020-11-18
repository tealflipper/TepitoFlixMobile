package com.example.tepitoflix;

public class Movie extends Media {
    private String director;
    private int length;

    public Movie(String id, String title, String genre, int year, double price, String director, int length) {
        super(id, title, genre, year, price);
        this.director = director;
        this.length = length;
    }

    public Movie() {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }


    @Override
    public String toString(){
        return "\n\tID= " + this.getId() + "\n" +
                "\n \tTITULO: "    + this.getTitle()   + "\n" +
                " \tGENERO: "    + this.getGenre()  + "\n" +
                " \tDURACIÓN: "  + this.getLength()  + "\n" +
                " \tDIRECTOR: "  + this.getDirector() + "\n" +
                " \tAÑO: "       + this.getYear()    + "\n" +
                " \tPRECIO: "    + this.getPrice()   + "\n" ;
    }
}
