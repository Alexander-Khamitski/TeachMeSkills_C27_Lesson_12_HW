package com.teachmeskills.lesson12.howework.task2.run;

import com.teachmeskills.lesson12.howework.task2.service.RegexService;

public class Runner {

    public static void main(String[] args) {
        String str = "Queue  +(22)5678924\n !9432-3256-44 collections 3467-5789-79\\ integer teachMeSkills@email.org " +
                "idea backend 3467-8945-78 java cource +(56)4576567t TOMMY.GREEN@myemail.com,  runner +(75)8538949" +
                "arrays developer.mail@writer.de ";
        RegexService.getAllMatchesFromString(str);
    }
}
