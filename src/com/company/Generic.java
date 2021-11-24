package com.company;

import java.util.HashMap;
import java.util.Map;

public class Generic <T1,T2>{

//    Generic класс тузунуз <T1, T2>
//➢ Ал класст􏰀н ичинде бир метод бар, класст􏰀н ключ менен
//    маанисиндеги маал􏰀маттард􏰀 ч􏰀гар􏰀п берген
//➢ Класс каалаган об􏰁ектилер менен иштейт
//
private T1 key;
private T2 value;

    public Generic(T1 key, T2 value) {
        this.key = key;
        this.value = value;
    }
    public <T> void print(){
        System.out.println("key: "+key+" value: "+value);
    }
}
