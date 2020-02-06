package io.github.srinaths;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    @Test
    public void testHello() {
        new Hello().sayHello("Srinath");
        System.out.println(minimumSwaps(new int[] {2, 3, 4, 1, 5}));
    }

    public long repeatedString(String s, long n) {
        long count = 0;
        // Count number of A's in substring
        long an = s.chars().filter(c -> 'a' == c).count();
        // Calculate approx. number of substrings requires to make up n characters
        long sn = n / s.length();
        count += sn * an;
        // Compute remaining characters required for n
        long rn = n % s.length();
        for (int i = 0; i < rn; i++) {
            if ('a' == s.charAt(i)) {
                ++count;
            }
        }
        return count;
    }

    int minimumSwaps(int[] arr) {
        int minSwaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > i+1) {
                int j = i + 1;
                while (arr[j] != i+1)
                    j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                minSwaps++;
            }
        }
        return minSwaps;
    }

    @Test
    public void testRepeatedString() {
        assertEquals(1000000000000L, repeatedString("a", 1000000000000L));
    }

    @Test
    public void testSolution() {
        System.out.println(solution("Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!"));
    }

    public static String solution(String x) {
        Map<Character, Character> dict = new HashMap<>();
        dict.put('a', 'z');
        dict.put('b', 'y');
        dict.put('c', 'x');
        dict.put('d', 'w');
        dict.put('e', 'v');
        dict.put('f', 'u');
        dict.put('g', 't');
        dict.put('h', 's');
        dict.put('i', 'r');
        dict.put('j', 'q');
        dict.put('k', 'p');
        dict.put('l', 'o');
        dict.put('m', 'n');
        dict.put('n', 'm');
        dict.put('o', 'l');
        dict.put('p', 'k');
        dict.put('q', 'j');
        dict.put('r', 'i');
        dict.put('s', 'h');
        dict.put('t', 'g');
        dict.put('u', 'f');
        dict.put('v', 'e');
        dict.put('w', 'd');
        dict.put('x', 'c');
        dict.put('y', 'b');
        dict.put('z', 'a');

        String[] words = x.split(" ");
        return Arrays.stream(words).map(word -> {
            StringBuilder sb = new StringBuilder();
            for (char c: word.toCharArray()) {
                if(Character.isLowerCase(c)) {
                    sb.append(dict.get(c));
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }).collect(Collectors.joining(" "));
    }

    private static String decode(String word) {
        StringBuffer sb = new StringBuffer();
        for (char c: word.toCharArray()) {
            if(Character.isLowerCase(c)) {
                char d = (char) (('z'+1) - c);
                sb.append(d);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}