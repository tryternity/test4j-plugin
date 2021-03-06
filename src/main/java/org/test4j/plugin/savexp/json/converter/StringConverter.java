package org.test4j.plugin.savexp.json.converter;

import java.net.URL;
import java.util.Currency;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

import org.eclipse.jdt.debug.core.IJavaValue;
import org.test4j.plugin.savexp.assistor.JdtClazzUtil;
import org.test4j.plugin.savexp.json.AbstractJsonConverter;

public class StringConverter extends AbstractJsonConverter {

    public String convert(IJavaValue input) throws Exception {
        String value = JdtClazzUtil.getValueString(input);
        return super.encode(value);
    }

    static Set<String> types = new HashSet<String>();
    static {
        types.add(String.class.getName());
        types.add(char.class.getName());
        types.add(Character.class.getName());
        types.add(StringBuffer.class.getName());
        types.add(StringBuilder.class.getName());
        types.add(URL.class.getName());
        types.add(UUID.class.getName());
        types.add(Locale.class.getName());
        types.add(Currency.class.getName());
        types.add(Class.class.getName());
    }

    @Override
    protected Set<String> getIdentifyType() {
        return types;
    }
}
