package ru.vbugaenko.stackoverflow.q957939;

public class Food {
    private String title;
    private Taste taste;

    public Food(Taste taste, String title) {
        this.title = title;
        this.taste = taste;
    }

    public String getTitle() { return title; }
    public Taste getTaste()  { return taste; }

    public void setTitle(String title) { this.title = title; }
    public void setTaste(Taste taste)  { this.taste = taste; }

}

