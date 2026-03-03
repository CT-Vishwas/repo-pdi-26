package com.cloudthat.addressbookv2.models;

public enum Gender {
    MALE('M'),
    FEMALE('F');

    private final char code;

    Gender(char code){
        this.code = code;
    }

    public static Gender fromCode(char code){
        if(code == 'M' || code == 'm'){
            return  MALE;
        }

        if(code == 'F'|| code == 'f'){
            return FEMALE;
        }
        throw new UnsupportedOperationException(
                "The Code "+ code + " is not supported"
        );
    }

    public char getCode(){
        return code;
    }
}
