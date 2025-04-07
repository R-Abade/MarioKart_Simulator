public class CharacterFactory {

    public Characters createCharacter(Personagem personagem){
        return switch (personagem) {
            case MARIO -> new Characters("Mario", 4, 3, 3, 2, 0);
            case LUIGI -> new Characters("Luigi", 4, 2, 3, 3, 0);
            case PEACH -> new Characters("Peach", 2, 4, 3, 3, 0);
            case BOWSER -> new Characters("Bowser", 5, 1, 4, 2, 0);
            case YOSHI -> new Characters("Yoshi", 3, 3, 2, 4, 0);
            case TOAD -> new Characters("Toad", 1, 5, 2, 4, 0);
            case DONKEY_KONG -> new Characters("Donkey Kong", 4, 2, 4, 2, 0);
            default -> throw new IllegalArgumentException("Tipo de personagem desconhecido");
        };
    }
    public enum Personagem {
        MARIO, LUIGI, PEACH, BOWSER, YOSHI, TOAD,
        DONKEY_KONG
    }
}
