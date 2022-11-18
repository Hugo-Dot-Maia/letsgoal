package br.com.letscode.letsgoal.Utils;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.Collection;

@UtilityClass
public final class CollectionUtils {
    public static <E> Collection<E> makeCollectionFromIterable(Iterable<E> iter) {
        Collection<E> list = new ArrayList<E>();
        for (E item : iter) {
            list.add(item);
        }
        return list;
    }
}
