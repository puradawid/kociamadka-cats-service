package pl.kociamadka;

import java.util.List;

public class Cats {

    private List<Cat> cats;

    public Cats(List<Cat> cats) {
        this.cats = cats;
    }

    public List<Cat> getCats() {
        return cats;
    }

    @Override
    public String toString() {
        return "{" +
                "\"cats\": [" + cats.stream().map(cat -> cat.toString()).reduce("", (x, y) -> x.isEmpty() ? y : x + "," + y) +
                "]}";
    }
}
