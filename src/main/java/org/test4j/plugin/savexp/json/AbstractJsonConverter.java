package org.test4j.plugin.savexp.json;

import java.util.List;
import java.util.Set;

import org.eclipse.jdt.debug.core.IJavaValue;

public abstract class AbstractJsonConverter implements JsonConverter {

    public boolean accept(IJavaValue input, List<String> types) {
        Set<String> _types = this.getIdentifyType();
        for (String type : types) {
            if (type != null && _types.contains(type)) {
                return true;
            }
        }
        return false;
    }

    protected abstract Set<String> getIdentifyType();

    public static String encode(String path) {
        return String.format("\"%s\"", path);
    }
}
