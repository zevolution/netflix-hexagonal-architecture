package dev.zevolution.netflixhexaarch.entities;

public class Software {

    private String name;
    private String description;
    private Integer score;
    private String author;

    public String getName() {
        return name;
    }

    public Software setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Software setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public Software setScore(Integer score) {
        this.score = score;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public Software setAuthor(String author) {
        this.author = author;
        return this;
    }

}
