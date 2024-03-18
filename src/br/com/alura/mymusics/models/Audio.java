package br.com.alura.mymusics.models;

public class Audio {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private double classification;

    public void like(){
        this.totalLikes++;
    }

    public void reproduces(){
        this.totalReproductions++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getClassification() {
        return classification;
    }
}
