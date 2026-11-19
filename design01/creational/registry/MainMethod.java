package design01.creational.registry;

public class MainMethod {
    public static void main(String[] args) {
        // 등록
        CharacterRegistry.register("warrior", new Character("전사", 100, 50 , 30 ,1));
        CharacterRegistry.register("archer", new Character("궁수", 90, 60 , 30 ,1));
        CharacterRegistry.register("magician", new Character("마법사", 90, 70 , 20 ,1));

        //검색

        Character warrior = CharacterRegistry.get("warrior");
        Character archer = CharacterRegistry.get("archer");
        Character magician = CharacterRegistry.get("magician");

        //사용
        IO.println(warrior);
        IO.println(archer);
        IO.println(magician);

        // registry pattern : (생성패턴 X) 객체 등록 및 관리
    }
}
