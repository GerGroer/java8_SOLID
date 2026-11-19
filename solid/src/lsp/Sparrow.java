package lsp;

public class Sparrow extends Bird implements Flyable {
    @Override
    public void eat() {
        System.out.println("Chirp-chirp, pecking seeds, chirp-chirp");
    }

    @Override
    public void fly() {
        System.out.println("Chirp-chirp, I am flying, chirp-chirp");
    }
}
