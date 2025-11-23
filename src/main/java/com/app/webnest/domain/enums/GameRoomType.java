package com.app.webnest.domain.enums;

/**
 * 게임방 타입 Enum
 */
public enum GameRoomType {
    ORACLE("ORACLE"),
    JAVA("JAVA"),
    JS("JS");
    
    private final String value;
    
    GameRoomType(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    public static GameRoomType fromValue(String value) {
        if (value == null) {
            return null;
        }
        for (GameRoomType type : GameRoomType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }
}

