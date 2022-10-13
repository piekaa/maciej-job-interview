package com.example.interview.something.useful;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class WhatAmIDoingTest {


    @ParameterizedTest
    @CsvSource({
            "https://www.baeldung.com/parameterized-tests-junit-5,www.baeldung.com",
            "http://piekoszek.pl/,piekoszek.pl",
            "piekoszek.pl/install.html,piekoszek.pl",
            "https://www.google.com/search?q=how+to+get+job+in+programming&oq=how+to+get+job+in+programming,www.google.com"
    })
    void test(String input, String expectedOutput) {
        var whatAmIDoing = new WhatAmIDoing();
        assertThat(whatAmIDoing.implementMe(input)).isEqualTo(expectedOutput);
    }

}