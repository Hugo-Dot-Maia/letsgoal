package br.com.letscode.letsgoal.Utils;

import java.util.Arrays;

public final class ObjectUtils {
    private static boolean doesObjectContainField(Object object, String fieldName) {
        return Arrays.stream(object.getClass().getFields())
                .anyMatch(f -> f.getName().equals(fieldName));
    }
}
