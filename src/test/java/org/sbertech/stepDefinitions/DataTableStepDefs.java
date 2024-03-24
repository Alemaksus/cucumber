package org.sbertech.stepDefinitions;

import io.cucumber.java.ru.Допустим;

import java.util.List;
import java.util.Map;

public class DataTableStepDefs {

    @Допустим("передадим в метод список строк")

    public void arrayList (List<String> list) {
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Допустим("передадим в метод ассоциативный массив")

    public void map(Map<String, String>map) {
        map.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });
    }
}
