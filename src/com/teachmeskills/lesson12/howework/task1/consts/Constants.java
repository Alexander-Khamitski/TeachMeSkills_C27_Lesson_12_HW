package com.teachmeskills.lesson12.howework.task1.consts;

import java.util.regex.Pattern;

public interface Constants {

    Pattern ABBREVIATION_REGEX_PATTERN = Pattern.compile("\\b[A-Z]{2,6}\\b");
    String SUCCESS_PREFIX_MESSAGE = "Here are all abbreviations from your string: ";
    String NO_MATCHES_MESSAGE = "There are no abbreviations in your string.";

}
