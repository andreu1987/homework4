package test;

public class Test extends TestBase {


    @org.junit.jupiter.api.Test
    public void test1() {
        mainePageDuckduckgo  .goTo() // переход на сайт
                             .setInputText() // ввод слово
                             .clickElement();      // клик на поиск
        taskOne              .checkPageIsCorrect(); // проверка элемента

    }

    @org.junit.jupiter.api.Test
    public void test2() {

        mainePageOtusHome   .goTo() // переход на сайт
                            .fullscreen() // размер экрана
                            .getSize() // размер экрана
                            .clickElement() // клик по элементу
                            .elementLoadTimeout(); // ожидание элемента
        taskOne             .checkPicture(); // проверка элемента


    }

    @org.junit.jupiter.api.Test
    public void test3() {

        mainePageOtus    .goTo() // переход на сайт
                         .maximize() // размер экрана
                         .getSize() // размер экрана
                         .clickElementEnter() // клик по элементу
                         .authorizationEmail()  // ввод слово
                         .authorizationPassword()  // ввод слово
                         .clickElementEnterEnter()  // клик по элементу
                         .getCookies(); // вывод в лог куков
    }

}

