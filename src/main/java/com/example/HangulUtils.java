package com.example;

import java.util.Map;

public class HangulUtils {
    // 初声
    private static final char[] CHOSUNG = {
            'ㄱ', 'ㄲ', 'ㄴ', 'ㄷ', 'ㄸ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅃ', 'ㅅ',
            'ㅆ', 'ㅇ', 'ㅈ', 'ㅉ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
    };

    // 中声
    private static final char[] JUNGSUNG = {
            'ㅏ', 'ㅐ', 'ㅑ', 'ㅒ', 'ㅓ', 'ㅔ', 'ㅕ', 'ㅖ', 'ㅗ', 'ㅘ',
            'ㅙ', 'ㅚ', 'ㅛ', 'ㅜ', 'ㅝ', 'ㅞ', 'ㅟ', 'ㅠ', 'ㅡ', 'ㅢ', 'ㅣ'
    };

    // 終声
    private static final char[] JONGSUNG = {
            ' ', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ',
            'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ',
            'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'
    };

    private static final Map<Character, String> JAMO_TO_KEY = Map.ofEntries(
            // 子音
            Map.entry('ㄱ', "r"), Map.entry('ㄲ', "R"), Map.entry('ㄴ', "s"),
            Map.entry('ㄷ', "e"), Map.entry('ㄸ', "E"), Map.entry('ㄹ', "f"),
            Map.entry('ㅁ', "a"), Map.entry('ㅂ', "q"), Map.entry('ㅃ', "Q"),
            Map.entry('ㅅ', "t"), Map.entry('ㅆ', "T"), Map.entry('ㅇ', "d"),
            Map.entry('ㅈ', "w"), Map.entry('ㅉ', "W"), Map.entry('ㅊ', "c"),
            Map.entry('ㅋ', "z"), Map.entry('ㅌ', "x"), Map.entry('ㅍ', "v"),
            Map.entry('ㅎ', "g"),

            // 複合パッチム
            Map.entry('ㄳ', "rt"), Map.entry('ㄵ', "sw"), Map.entry('ㄶ', "sg"),
            Map.entry('ㄺ', "fr"), Map.entry('ㄻ', "fa"), Map.entry('ㄼ', "fq"),
            Map.entry('ㄽ', "ft"), Map.entry('ㄾ', "fx"), Map.entry('ㄿ', "fv"),
            Map.entry('ㅀ', "fg"), Map.entry('ㅄ', "qt"),

            // 母音
            Map.entry('ㅏ', "k"), Map.entry('ㅐ', "o"), Map.entry('ㅑ', "i"),
            Map.entry('ㅒ', "O"), Map.entry('ㅓ', "j"), Map.entry('ㅔ', "p"),
            Map.entry('ㅕ', "u"), Map.entry('ㅖ', "P"), Map.entry('ㅗ', "h"),
            Map.entry('ㅘ', "hk"), Map.entry('ㅙ', "ho"), Map.entry('ㅚ', "hl"),
            Map.entry('ㅛ', "y"), Map.entry('ㅜ', "n"), Map.entry('ㅝ', "nj"),
            Map.entry('ㅞ', "np"), Map.entry('ㅟ', "nl"), Map.entry('ㅠ', "b"),
            Map.entry('ㅡ', "m"), Map.entry('ㅢ', "ml"), Map.entry('ㅣ', "l")
    );
}
