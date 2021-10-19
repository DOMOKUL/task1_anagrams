package com.company;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class AnagramAppTest {

    @Test
    void IWannaCry_whenTestMain(){//rename!!!
        Anagram mockAnagram = mock(Anagram.class);
        AnagramApp.setAnagram(mockAnagram);

    }

}