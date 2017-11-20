package com.kitcenter.app.homework.lesson15;

public enum FamousPerson {
    VOLODYMYR("Князь Володимир", 55, false),
    BOGDAN_KHMELNYTSKYI("Богдан Хмельницький", 62, false),
    TARAS_SHEVCHENKO("Тарас Шевченко", 47, false),
    MYKOLA_LYSENKO("Микола Лисенко", 70, false),
    IVAN_FRANKO("Іван Франко", 60, false),
    MYHAYLO_GRUSHEVSKY("Михайло Грушевский", 68, false),
    LESYA_UKRAYINKA("Леся Українка", 42, false),
    KAZYMYR_MALEVYCH("Казимир Малевич", 56, false),
    SYMON_PETLURA("Симон Петлюра", 47, false),
    BORYS_LYATOSHYNSKY("Борис Лятошинський", 73, false),
    SERGIY_KOROLYOV("Сергій Корольов", 59, false),
    STEPAN_BANDERA("Степан Бандера", 50, false),
    MYKOLA_AMOSOV("Микола Амосов", 89, false),
    LEVKO_LUKYANENKO("Левко Лук'яненко", 89, true),
    LEONID_KRAVCHUK("Леонід Кравчук", 83, true),
    VALERIY_LOBANOVSKY("Валерій Лобановський", 63, false),
    BOGDAN_STUPKA("Богдан Ступка", 71, false),
    MUSTAFA_JEMILYOV("Мустафа Джемільов", 74, true),
    VITALIY_KLYCHKO("Віталій Кличко", 46, true),
    VOLODYMYR_KLYCHKO("Володимир Кличко", 41, true),
    SVYATOSLAV_VAKARCHUK("Святослав Вакарчук", 42, true),
    ANDRIY_SHEVCHENKO("Андрій Шевченко", 41, true),
    SERGIY_BUBKA("Сергій Бубка", 54, true),
    RUSLANA_PYSANKA("Руслана Писанка", 52, true);

    private String name;
    private int age;
    private boolean alive;

    FamousPerson(String name, int age, boolean alive) {
        this.name = name;
        this.age = age;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }
}