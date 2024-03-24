package org.sbertech.stepDefinitions;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import org.testng.Assert;

import java.math.BigDecimal;

public class MyStepdefs {
    private static BigDecimal cash = new BigDecimal(120_000);

    @Дано("^на счете пользователя имеется (\\d+) рублей$")
    public void наСчетеПользователяИмеетсяРублей(int arg0) {
        Assert.assertEquals(0, cash.compareTo(new BigDecimal(arg0)));
    }

    @Когда("^пользователь снимает со счета (\\d+) рублей$")
    public void пользовательСнимаетСоСчетаРублей(int arg0) {
        cash = cash.subtract(new BigDecimal(arg0));
    }

//    @Тогда("^на счете пользователя останется (\\d+) рублей$")
//    public void наСчетеПользователяОстанетсяРублей(int arg0) {
//    }
}
