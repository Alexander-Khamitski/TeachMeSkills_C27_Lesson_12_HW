package com.teachmeskills.lesson12.howework.task1.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson12.howework.task1.consts.Constants.*;

public class RegexService {

    public static void getAllAbbreviationsFromString(String str) {
        Pattern p = Pattern.compile(ABBREVIATION_REGEX_PATTERN);
        Matcher m = p.matcher(str);
        StringBuilder sb = getAllMatches(m);
        printResult(sb);
    }

    private static StringBuilder getAllMatches(Matcher m) {
        StringBuilder stringBuilder = new StringBuilder(SUCCESS_PREFIX_MESSAGE);
        while (m.find()) {
            stringBuilder
                    .append(m.group())
                    .append(", ");
        }
        return stringBuilder;
    }

    private static void printResult(StringBuilder stringBuilder) {
        if (stringBuilder.toString().endsWith(SUCCESS_PREFIX_MESSAGE)) {
            System.out.println(NO_MATCHES_MESSAGE);
        } else {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length() - 1, ".");
            System.out.println(stringBuilder);
        }
    }
}
