package com.teachmeskills.lesson12.howework.task2.consts;

public interface Constants {

    String DOC_NUMBERS = "Document numbers: ";
    String EMAILS = "Emails: ";
    String PHONE_NUMBERS = "Phone numbers: ";
    String DOC_NUMBER_REGEX_PATTERN = "\\b[1-9]{4}\\-[1-9]{4}\\-[1-9]{2}\\b";
    String EMAIL_PATTERN = "([a-zA-Z0-9_\\.-]+)@([a-zA-Z0-9_\\.-]+)\\.([a-z]{1,3})";
    String PHONE_NUMBER_PATTERN = "\\+?\\(([1-9]{2})\\)([1-9]{7})";
    String[] TYPE_INFOS = {DOC_NUMBERS, EMAILS, PHONE_NUMBERS};
    String[] REGEXES = {DOC_NUMBER_REGEX_PATTERN, EMAIL_PATTERN, PHONE_NUMBER_PATTERN};

}
