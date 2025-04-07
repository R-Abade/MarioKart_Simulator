import java.util.*;

public class CharacterSingleton {
    private static CharacterSingleton instance;
    private final HashMap<String, Characters> characters;
    private final CharacterFactory cf;

    private CharacterSingleton(){
        this.characters = new HashMap<>();
        this.cf = new CharacterFactory();
        initializerCharacter();
    }

    public static synchronized CharacterSingleton getInstance() {
        if(instance == null){
            instance = new CharacterSingleton();
        }
        return instance;
    }

    private void initializerCharacter(){
        for(CharacterFactory.Personagem personagem : CharacterFactory.Personagem.values()){
            Characters character = cf.createCharacter(personagem);
            characters.put(character.getName().toLowerCase(), character);
        }
    }

    public Characters getCharacter(String name) {
        return characters.get(name.toLowerCase());
    }

    public HashMap<String, Characters> getAllCharacters(){
        return new HashMap<>(characters);
    }
}
