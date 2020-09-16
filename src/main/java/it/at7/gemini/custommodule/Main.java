package it.at7.gemini.custommodule;

import it.at7.gemini.boot.GeminiPostgresql;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GeminiPostgresql.start(args, Set.of(MyCustomModule.class),  Set.of(MyCustomModuleAPI.class));
    }
}
