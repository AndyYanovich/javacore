package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.Computer;
import com.kitcenter.app.homework.lesson12.Dell;
import com.kitcenter.app.homework.lesson12.Lenovo;

public class ComputerRunner {
    public static void main(String[] args) {
        Lenovo lenovo = new Lenovo("Lenovo");
        Dell dell = new Dell("DELL");

        Computer[] computer = {lenovo, dell};
    }

    public static String changesForComputers(Computer comp) {
        return comp.changeCpu();
    }
}