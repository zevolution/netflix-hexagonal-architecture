package dev.zevolution.netflixhexaarch.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class CheckNullable {

    public static <T> boolean checkIfHasNullAttributeFields(T object) throws IllegalAccessException {
        for (Field f : object.getClass().getDeclaredFields()) {
            if (Modifier.isPrivate(f.getModifiers())) {
                f.setAccessible(true);
                if (f.get(object) == null) {
                    System.out.printf("%n[FAILED-TEST-LOG] The property '%s' is null.%n", f.getName());
                    return true;
                }
            }
        }

        return false;
    }

}
