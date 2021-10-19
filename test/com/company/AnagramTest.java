package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AnagramTest {
    Anagram anagram;

    @BeforeEach
    public void setUp() {
        anagram = new Anagram();
    }

    @Test
    void reverse_reverseLine_whenInputOnlyLetters() {
        assertEquals("dcba hgfe", anagram.process("abcd efgh"));
    }
}
