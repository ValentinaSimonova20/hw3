package org.example;

import org.junit.jupiter.api.Test;

class HomeWorkTest {
    HomeWork homeWork = new HomeWork();

    @Test
    void add() {
        homeWork.findMaxSubstring("abcddcba");
        homeWork.findMaxSubstring("abcddcbaX");
    }
}