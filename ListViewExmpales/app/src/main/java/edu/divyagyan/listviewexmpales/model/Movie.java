package edu.divyagyan.listviewexmpales.model;

public class Movie {

    private String title;
    private String genre;
    private String duration;
    private String mDate;

    private String imageUrl;

    public Movie(String title, String genre,
                 String duration, String mDate,
                 String imageUrl) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.mDate = mDate;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
