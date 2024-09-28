package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
        int maxLength = 0;
        int currentLength = 0;
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int savedIndex = indexesOfLetters.getOrDefault(currentChar, -1);
            if(savedIndex != -1 && (savedIndex > i - currentLength)) {
                currentLength = 1;
            } else {
                currentLength++;
            }
            if(currentLength > maxLength) {
                maxLength = currentLength;
            }
            indexesOfLetters.put(currentChar, i);
        }
        System.out.println(maxLength);
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
        return false;
    }

}
