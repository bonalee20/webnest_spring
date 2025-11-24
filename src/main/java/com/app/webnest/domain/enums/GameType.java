package com.app.webnest.domain.enums;

public enum GameType {
    SNAKE_PUZZLE("snakepuzzle"),
    LAST_WORD("lastword"),
    CONCAVE("concave"),
    CARD_FLIP("cardflip");
    
    private final String value;
    
    GameType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public static GameType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (GameType type : GameType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }
}

