package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class AnagramTest {
    private Anagram anagram = new Anagram();

    @BeforeEach
    void setUp() {
    }

    @Test
    void reverse_reverseLine_whenPutSpacesInFrontLine() {
        assertEquals("  d1cba e2hgfe ", anagram.process("  a1bcd e2fghe"));
    }

    @Test
    void reverse_reverseLine_whenLineContainOnlyNumbers() {
        assertEquals("123 456 ",anagram.process("123 456 "));
    }
    @Test
    void reverse_reverseLine_whenInputNull(){
        assertNotEquals(null, anagram.process("123! 456&"));
    }
    @Test
    void reverse_reverseLine_whenInputEmptyLine(){
        assertEquals("",anagram.process(" "));
    }
    @Test
    void reverse_reverseLine_whenInputOnlyLetters(){
        assertEquals("dcba hgfe ",anagram.process("abcd efgh"));
    }
    @Test
    void reverse_reverseLine_whenInputOnlyAlphabetic(){
        assertEquals("!#@$ ^!*( ",anagram.process("!#@$ ^!*("));
    }
    @Test
    void reverse_reverseLine_whenInputLettersAndNumbers(){
        assertEquals("b1a2 d3c4 ",anagram.process("a1b2 c3d4"));
    }
    @Test
    void reverse_reverseLine_whenInputLettersAndAlphabetic(){
        assertEquals("d1cba hgf!e ", anagram.process("a1bcd efg!h"));
    }
    @Test
    void reverse_reverseLine_whenInputNumbersAndAlphabetic(){
        assertEquals("1@2# 3$4% ", anagram.process("1@2# 3$4%"));
    }
    @Test
    void reverse_reverseLine_whenInputLettersAndNumbersAndAlphabetic(){
        assertEquals("r6k%t*0a 6m7k&2t^ ",anagram.process("a6t%k*0r 6t7k&2m^"));
    }


}
