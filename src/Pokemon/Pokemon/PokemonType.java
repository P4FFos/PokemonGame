package Pokemon.Pokemon;

public enum PokemonType {
    WATER("WATER"),
    FIRE("FIRE"),
    GRASS("GRASS"),
    BUG("BUG"),
    DRAGON("DRAGON"),
    ELECTRIC("ELECTRIC"),
    ICE("ICE"),
    NORMAL("NOSMAL");

    final String type;

    PokemonType(String type) {
        this.type = type;
    }

    public String toString() {
        return this.type;
    }
}