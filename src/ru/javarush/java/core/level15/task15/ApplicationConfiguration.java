package ru.javarush.java.core.level15.task15;

public class ApplicationConfiguration {
   public final static String APPLICATION_DEFAULT_LANGUAGE;

    public static String getApplicationDefaultLanguage() {
        return APPLICATION_DEFAULT_LANGUAGE;
    }

    public ApplicationConfiguration() {
    }
    static {
        String str = System.getenv("APP_LANG");
        if (str != null){
            APPLICATION_DEFAULT_LANGUAGE = str;
        }else {
            APPLICATION_DEFAULT_LANGUAGE ="en";
        }

    }
}
