package org.test4j.plugin.helper;

import org.test4j.plugin.Test4JActivator;

public class PluginSetting {
    public final static String PLUGIN_ID                           = "org.test4j.plugin";

    /**
     * 数据库连接url
     */
    public static final String DATABASE_URL                        = "database_url";
    /**
     * 数据库连接用户名称
     */
    public static final String DATABASE_USR                        = "database_usr";
    /**
     * 数据库连接用户密码
     */
    public static final String DATABASE_PWD                        = "database_pwd";

    public static final String SOURCE_PATH                         = "source_path";
    public static final String RESOURCES_PATH                      = "resources_path";
    public static final String TEST_SOURCE_PATH                    = "test_source_path";
    public static final String TEST_RESOURCES_PATH                 = "test_resources_path";

    public static final String DEFAULT_CHARSET                     = "UTF8";

    public static final String WORD_WRAP                           = "WordWrap";
    public static final String SHOW_BROWSER_IN_EDITOR_WHEN_OPENING = "ShowBrowserInEditorWhenOpening";

    public static final String SUFFIX_FOREGROUND                   = "_foreground";
    public static final String SUFFIX_BACKGROUND                   = "_background";
    public static final String SUFFIX_STYLE                        = "_style";

    public static final String RENDER_FULLY_QUALIFIED_TYPE_NAMES   = "renderFullyQualifiedTypeNames";
    public static final String WIKI_HREF                           = "http://--wiki/";

    static final String        WIKI_WORD_PATTERN                   = "([A-Z][a-z]+){2,}[0-9]*";
    static final String        TWIKI_WORD_PATTERN                  = "[A-Z]+[a-z]+[A-Z]+\\w*";
    static final String        ESCAPED_TWIKI_WORD_PATTERN          = "!(\\[\\[)?[A-Z]+[a-z]+[A-Z]+\\w*(\\]\\])?";

    public static final String DOMAIN_SQLMAP_TEMPLATE              = "Domain.SqlmapTemplate";
    public static final String DOMAIN_ENTITY_TEMPLATE              = "Domain.EntityTemplate";

    public static final String DOMAIN_SQLMAP_ENCONDING             = "Domain.SqlmapEncoding";
    public static final String DOMAIN_ENTITY_ENCONDING             = "Domain.EntityEncoding";

    public static final String DOMAIN_SQLMAP_PATH                  = "Domain.SqlmapPath";
    public static final String DOMAIN_ENTITY_PATH                  = "Domain.EntityPath";

    /**
     * 获取ct plugin的extension id<br>
     * org.test4j.plugin.ui.[extension id]
     * 
     * @param extension
     * @return
     */
    public static String id(String extension) {
        return PLUGIN_ID + "." + extension;
    }

    public static final String METHOD_NAME = id("methodName");
    public static final String CLASS_NAME  = id("className");

    public static String getSourcePath() {
        return Test4JActivator.getDefault().getPreferenceStore().getString(SOURCE_PATH);
    }

    public static String getReSourcePath() {
        return Test4JActivator.getDefault().getPreferenceStore().getString(RESOURCES_PATH);
    }

    public static String getTestSourcePath() {
        return Test4JActivator.getDefault().getPreferenceStore().getString(TEST_SOURCE_PATH);
    }

    public static String getTestReSourcePath() {
        return Test4JActivator.getDefault().getPreferenceStore().getString(TEST_RESOURCES_PATH);
    }

    /**
     * 返回存放测试序列的数据库url
     * 
     * @return
     */
    public static String getDbUrl() {
        // "jdbc:mysql://localhost/test4j-tutorial?characterEncoding=UTF8";
        return Test4JActivator.getDefault().getPreferenceStore().getString(DATABASE_URL);
    }

    /**
     * 返回存放测试序列的数据库用户名称
     * 
     * @return
     */
    public static String getDbUsr() {
        // return "root";
        return Test4JActivator.getDefault().getPreferenceStore().getString(DATABASE_USR);
    }

    /**
     * 返回存放测试序列的数据库用户密码
     * 
     * @return
     */
    public static String getDbPwd() {
        // return "password";
        return Test4JActivator.getDefault().getPreferenceStore().getString(DATABASE_PWD);
    }

    //
    /**
     * 返回存储的Sqlmap模板
     * 
     * @return
     */
    public static String getDomainSqlmapTemplate() {
        // return "root";
        return Test4JActivator.getDefault().getPreferenceStore().getString(DOMAIN_SQLMAP_TEMPLATE);
    }

    /**
     * 返回存储的Sqlmap模板
     * 
     * @return
     */
    public static String getDomainEntityTemplate() {
        // return "root";
        return Test4JActivator.getDefault().getPreferenceStore().getString(DOMAIN_ENTITY_TEMPLATE);
    }

    public static String geDomainSqlmapPath() {
        return Test4JActivator.getDefault().getPreferenceStore().getString(DOMAIN_SQLMAP_PATH);
    }

    public static String geDomainEntityPath() {
        return Test4JActivator.getDefault().getPreferenceStore().getString(DOMAIN_ENTITY_PATH);
    }

    /**
     * 返回存储的Sqlmap Encoding
     * 
     * @return
     */
    public static String getDomainSqlmapEncoding() {
        return Test4JActivator.getDefault().getPreferenceStore().getString(DOMAIN_SQLMAP_ENCONDING);
    }

    /**
     * 返回存储的Entity Encoding
     * 
     * @return
     */
    public static String getDomainEntityEncoding() {
        return Test4JActivator.getDefault().getPreferenceStore().getString(DOMAIN_ENTITY_ENCONDING);
    }
}
