package org.sbertech.stepDefinitions;

import io.cucumber.java.ru.Допустим;

import java.time.LocalDate;

public class CustomTypeStepdefs {
    @Допустим("передадим в метод шага дату {localdate}")
    public void передадимВМетодШагаДату(LocalDate localdate) {
        System.out.println(localdate);
    }

    @Допустим("передадим в метод шага дату {double}{double}")
    public void передадимВМетодШагаДату(int arg0, int arg1, int arg2) {
        
    }
}
