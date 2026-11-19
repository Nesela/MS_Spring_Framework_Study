package design01.creational.registry;

import java.util.HashMap;
import java.util.Map;

public class CharacterRegistry {
    // 객체를 저장하는 저장소
    private static final Map<String, Character> registry = new HashMap<>();

    // 객체 등록
    public static void register(String key, Character character){
        registry.put(key, character);
    }

    // 객체 검색 및 복제
    public static Character get(String key) {
        Character character = registry.get(key);

        if (character == null) {
            return null;
        }
        return character.copy();
    }
}
