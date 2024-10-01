package org.example;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CheckTest {

    HomeWork homeWork = new HomeWork();


    @ParameterizedTest
    @MethodSource("stringsSource")
    void checkSuccess(CheckTestObject testObject) {
        assertEquals(testObject.result, homeWork.check(testObject.inputString));
    }

    private List<CheckTestObject> stringsSource() {
        return List.of(
                new CheckTestObject("The quick brown fox jumps over the lazy dog.", true),
                new CheckTestObject("Pack my box with five dozen liquOr jugs.", true),
                new CheckTestObject("If you spin around three times, you'll start to feel melancholy.", false),
                new CheckTestObject("1234567", false),
                new CheckTestObject("          ", false),
                new CheckTestObject("abcdefghijklmnopqrstuvwxyz", true),
                new CheckTestObject("abcdefghijklmnopqrstu    VWA.vwxyz", true)
        );
    }

    private static class CheckTestObject{
        String inputString;
        boolean result;

        public CheckTestObject(String inputString, boolean result) {
            this.inputString = inputString;
            this.result = result;
        }
    }
}
