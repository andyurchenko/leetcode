package edu.leetcode.problems.problem_409;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_409Test {

    @Test
    void longestPalindrome_0() {
        String s = "a";
        Problem_409 p = new Problem_409();
        assertEquals(1, p.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_1() {
        String s = "A";
        Problem_409 p = new Problem_409();
        assertEquals(1, p.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_2() {
        String s = "aa";
        Problem_409 p = new Problem_409();
        assertEquals(2, p.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_3() {
        String s = "aaa";
        Problem_409 p = new Problem_409();
        assertEquals(3, p.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_4() {
        String s = "aba";
        Problem_409 p = new Problem_409();
        assertEquals(3, p.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_5() {
        String s = "abba";
        Problem_409 p = new Problem_409();
        assertEquals(4, p.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_6() {
        String s = "abccccdd";
        Problem_409 p = new Problem_409();
        assertEquals(7, p.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_7() {
        String s = "aaabbcce";
        Problem_409 p = new Problem_409();
        assertEquals(7, p.longestPalindrome(s));
    }

    @Test
    void longestPalindrome_8() {
        String s = "AAAAAA";
        Problem_409 p = new Problem_409();
        assertEquals(6, p.longestPalindrome(s));
    }

    @Test
    @Disabled
    void longestPalindrome_9() {
        String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
        Problem_409 p = new Problem_409();
        assertEquals(983, p.longestPalindrome(s));
    }

    @Test
    @Disabled
    void longestPalindrome_10() {
        String s = "aaaAAAAAbbddrrrrttwqqqq";
        Problem_409 p = new Problem_409();
        assertEquals(19, p.longestPalindrome(s));
    }
}