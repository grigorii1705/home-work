package com.mycompany.module;

public class ModuleMain {
    public static void main(String[] args) {
        com.mycompany.module.ModuleHelper helper = new ModuleHelper();

        // Доступ разрешён, так как тот же пакет
        helper.provideInternalAssistance();
    }
}
