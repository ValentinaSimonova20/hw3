package org.example;

import java.util.*;


public class HomeWork {

    /**
     * <h1>Задание 1.</h1>
     * Метод возвращает подстроку максимальной длины в которой не повторяются символы
     * Если найдено несколько подстрок одинаковой длины - вернуть первую.
     *
     * Пример 1 вход= abcddcba, выход = abcd
     * Так как найдены две подстроки с неповторяющимися значениями:
     * 1) abcd
     * 2) dcba
     * Они динаковой длины, по этому возвращаем 1 строку
     *
     * Пример 2 вход= abcddcbaX, выход = dcbaX
     * Так как эта подстрока самая большая
     *
     * @param str входная не пустая строка
     * @return максимальная подстрока из уникальных значений
     * Сигнатуру метода не меняем
     */
    public String findMaxSubstring(String str) {
        Map<Character, Integer> indexesOfLetters = new HashMap<>();
        int startIndex = 0;
        int endIndex = 0;
        String result = "";
        while (endIndex != str.length()) {
            char currentChar = str.charAt(endIndex);
            int savedIndex = indexesOfLetters.getOrDefault(currentChar, -1);
            if(savedIndex == -1 || savedIndex <= startIndex) {
                endIndex++;
            } else {
                startIndex = savedIndex;
                endIndex = savedIndex;
            }
            String currentString = str.substring(startIndex, endIndex);
            if(result.length() < currentString.length()) {
                result = currentString;
            }
            indexesOfLetters.put(currentChar, endIndex);
        }
        return result;
    }


    /**
     * Задача со зведочкой (опционально)
     * <br/>
     * Можно решать так же для английского алфавита, проверять что присутствуют буквы от A до Z хотя бы по одному разу.
     * <br/>
     * A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
     *
     * Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
     * @see <a href="https://www.codewars.com/kata/545cedaa9943f7fe7b000048">https://www.codewars.com/kata/545cedaa9943f7fe7b000048</a>
     */
    public boolean check(String sentence){
        return sentence.chars().map(Character::toLowerCase).filter(Character::isLetter).distinct().count() == 26;
    }

}
