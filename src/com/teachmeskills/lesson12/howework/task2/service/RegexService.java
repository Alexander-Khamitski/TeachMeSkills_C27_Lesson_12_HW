package com.teachmeskills.lesson12.howework.task2.service;

import com.teachmeskills.lesson12.howework.task2.consts.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexService {

    private static boolean IS_MATCHES = false;

    public static void getAllMatchesFromString(String str) {
        if (Constants.TYPE_INFOS.length != Constants.PATTERNS.length) {
            throw new RuntimeException("'Type infos' and 'Patterns' arrays should have same lengths.");
        } else {
            for (int i = 0; i < Constants.TYPE_INFOS.length; i++) {
                Pattern pattern = Constants.PATTERNS[i];
                String typeInfo = Constants.TYPE_INFOS[i];
                getAllMatchesByType(pattern, str, typeInfo);
                IS_MATCHES = false;
            }
        }
    }

    private static void getAllMatchesByType(Pattern pattern, String str, String typeInfo) {
        Matcher m = pattern.matcher(str);
        StringBuilder sb = createStringBuilderMessage(m, typeInfo);
        printResult(sb);
    }

    private static StringBuilder createStringBuilderMessage(Matcher m, String typeInfo) {
        StringBuilder stringBuilder = new StringBuilder(typeInfo);
        while (m.find()) {
            stringBuilder
                    .append(m.group())
                    .append(", ");
            IS_MATCHES = true;
        }
        return stringBuilder;
    }

    private static void printResult(StringBuilder stringBuilder) {
        if (IS_MATCHES) {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length() - 1, ";");
            System.out.println(stringBuilder);
        } else {
            System.out.println(stringBuilder.append("no matches;"));
        }
    }
}
