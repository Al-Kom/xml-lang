package xmlcompiler.config;

public class Configuration {
    private static final String RAW_CLASSNAME = "result";
    private static final String FILE_EXT = "java";

    public static final String PACKAGE_NAME = "compiled";
    public static final String CLASSNAME = genClassName();
    public static final String FILENAME = CLASSNAME + "." + FILE_EXT;

    private static String genClassName() {
        String className = Configuration.RAW_CLASSNAME;
        className = className.replaceAll("[.]", "_");
        return className.substring(0, 1).toUpperCase()
                + className.substring(1).toLowerCase();
    }
}
