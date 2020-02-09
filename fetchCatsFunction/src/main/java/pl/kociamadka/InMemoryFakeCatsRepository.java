package pl.kociamadka;

import java.util.Arrays;

public class InMemoryFakeCatsRepository implements CatsRepository {

    private Cats cats = new Cats(Arrays.asList(
            new Cat("Kicia", "https://google.com/img.jpg"),
            new Cat("Franio", "https://google.com/img.png"),
            new Cat("Balbina", "https://google.com/pnh"),
            new Cat("Amadeusz", "https://google.com/image.png")
    ));


    @Override
    public Cats getAllCats() {
        return cats;
    }
}
