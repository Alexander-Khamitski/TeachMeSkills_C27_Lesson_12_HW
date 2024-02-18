package com.teachmeskills.lesson12.howework.task2.consts;

import java.util.regex.Pattern;

public interface Constants {

    String DOC_NUMBERS = "Document numbers: ";
    String EMAILS = "Emails: ";
    String PHONE_NUMBERS = "Phone numbers: ";
    Pattern DOC_NUMBER_REGEX_PATTERN = Pattern.compile("\\b[1-9]{4}\\-[1-9]{4}\\-[1-9]{2}\\b");
    Pattern EMAIL_PATTERN = Pattern.compile("([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z]{1,3})", Pattern.CASE_INSENSITIVE);
    Pattern PHONE_NUMBER_PATTERN = Pattern.compile("\\+?\\(([1-9]{2})\\)([1-9]{7})");
    String[] TYPE_INFOS = {DOC_NUMBERS, EMAILS, PHONE_NUMBERS};
    Pattern[] PATTERNS = {DOC_NUMBER_REGEX_PATTERN, EMAIL_PATTERN, PHONE_NUMBER_PATTERN};

}
