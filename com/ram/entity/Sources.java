package com.ram.entity;

enum SourceType {
    BANK_ACCOUNT("bank_account", 1),
    WALLET_ACCOUNT("wallet_account", 2),
    THIRD_PARTY("third_party", 3);

    private final String sourceTypeName;
    private final int code;

    SourceType(String sourceTypeName, int code) {
        this.sourceTypeName = sourceTypeName;
        this.code = code;
    }

    public String getSourceTypeName() {
        return sourceTypeName;
    }

    public int getCode() {
        return code;
    }

    
    public static SourceType fromCode(int code) {
        for (SourceType type : SourceType.values()) {
            if (type.getCode() == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid source type code: " + code);
    }

    // Method to get SourceType by name
    public static SourceType fromName(String name) {
        for (SourceType type : SourceType.values()) {
            if (type.getSourceTypeName().equalsIgnoreCase(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid source type name: " + name);
    }
}

public class Sources {
    private int sourceId;
    private SourceType sourceType; // Changed from String to SourceType enum

    public Sources(int sourceId, SourceType sourceType) {
        this.sourceId = sourceId;
        this.sourceType = sourceType;
    }

    public Sources() {
        super();
    }

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    // Get SourceType Code (if needed)
    public int getSourceTypeCode() {
        return sourceType.getCode();
    }

    // Get SourceType Description (if needed)
    public String getSourceTypeDesc() {
        return sourceType.getSourceTypeName();
    }

    @Override
    public String toString() {
        return "Sources{" +
                "sourceId=" + sourceId +
                ", sourceType=" + sourceType +
                '}';
    }
}
