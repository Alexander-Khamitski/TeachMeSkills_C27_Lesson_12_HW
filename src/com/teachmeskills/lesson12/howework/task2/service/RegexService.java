package com.teachmeskills.lesson12.howework.task2.service;

import com.teachmeskills.lesson12.howework.task2.consts.Constants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexService {

    public static void getAllMatchesFromString(String str) {
        if (Constants.TYPE_INFOS.length != Constants.REGEXES.length) {
            throw new RuntimeException("'Type infos' and 'Patterns' arrays should have same lengths.");
        } else {
            for (int i = 0; i < Constants.TYPE_INFOS.length; i++) {
                String regex = Constants.REGEXES[i];
                String typeInfo = Constants.TYPE_INFOS[i];
                getAllMatchesByType(regex, str, typeInfo);
            }
        }
    }

    private static void getAllMatchesByType(String regex, String str, String typeInfo) {
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        StringBuilder sb = createStringBuilderMessage(m, typeInfo);
        printResult(sb ,typeInfo);
    }

    private static StringBuilder createStringBuilderMessage(Matcher m, String typeInfo) {
        StringBuilder stringBuilder = new StringBuilder(typeInfo);
        while (m.find()) {
            stringBuilder
                    .append(m.group())
                    .append(", ");
        }
        return stringBuilder;
    }

    private static void printResult(StringBuilder stringBuilder, String typeInfo) {
        if (stringBuilder.toString().endsWith(typeInfo)) {
            System.out.println(stringBuilder.append("no matches;"));
        } else {
            stringBuilder.replace(stringBuilder.length() - 2, stringBuilder.length() - 1, ";");
            System.out.println(stringBuilder);
        }
    }
}
