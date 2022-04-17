package info.mermakov.dev.itmo.fg.hw2;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        final String resultMessage = "String: '%s', result: %s";

        final List<String> list = List.of("", "ab", "c", "ca", "cb", "cbb", "cbbbb", "cbbbbbbbbbbbb", "aba", "a", "cc", "abab", "b", "bca", "acb", "cbbbbbba", "cab", "ac");
        for (final String lineToCheck : list) {
            System.out.println(String.format(resultMessage, lineToCheck, Checker.check(lineToCheck)));
        }
    }
}
