package org.wecancoeit.reviews;

public class Review {

    private Long id;
    private int date;
    private String name;
    private String description;
    private String image;

    public String getImage() {
        return image;
    }

    public Long getId() {
        return id;
    }

    public int getDate() {
        return date;
    }

    public String getName() {

        return name;
    }

    public String getDescription() {
        return description;
    }

    public Review(long id, int date, String name, String description, String image) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.description = description;
        this.image = image;
    }

}
