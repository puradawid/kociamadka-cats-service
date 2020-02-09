package pl.kociamadka;

public class Cat {

    private String name;
    private String imageUrl;

    public Cat(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "{" +
                "\"name\": \"" + name + '\"' +
                ", \"imageUrl\":\"" + imageUrl + '\"' +
                '}';
    }
}
