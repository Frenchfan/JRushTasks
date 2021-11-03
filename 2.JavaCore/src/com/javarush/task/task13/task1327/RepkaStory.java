package com.javarush.task.task13.task1327;

import java.util.List;

public class RepkaStory {
    static void tell(List<Person> items) {
        Person first;
        Person second;
        for (int i = items.size(); i > 1; i--) {
            second = items.get(i- 1);
            first = items.get(i-2);
            second.pull(first);
        }
    }
}
