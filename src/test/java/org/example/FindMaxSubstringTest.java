package org.example;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FindMaxSubstringTest {
    HomeWork homeWork = new HomeWork();

    @ParameterizedTest
    @MethodSource("stringsSource")
    void findMaxSubstringSuccess(FindMaxSubstringTestObject testObject) {
        assertEquals(testObject.result, homeWork.findMaxSubstring(testObject.inputString));
    }

    private List<FindMaxSubstringTestObject> stringsSource() {
        return List.of(
                new FindMaxSubstringTestObject("abcddcba", "abcd"),
                new FindMaxSubstringTestObject("abcddcbaX", "dcbaX"),
                new FindMaxSubstringTestObject("aaaaaaaaaaa", "a"),
                new FindMaxSubstringTestObject("b", "b"),
                new FindMaxSubstringTestObject("abcbcbcbcbc", "abc"),
                new FindMaxSubstringTestObject("qwertyuioplkjhg", "qwertyuioplkjhg"),
                new FindMaxSubstringTestObject("asdafrtdiropp", "afrtdi"),
                new FindMaxSubstringTestObject("diroppppp", "dirop"),
                new FindMaxSubstringTestObject("pwwkew", "wke")
        );
    }

    private static class FindMaxSubstringTestObject{
        String inputString;
        String result;

        public FindMaxSubstringTestObject(String inputString, String result) {
            this.inputString = inputString;
            this.result = result;
        }
    }
}