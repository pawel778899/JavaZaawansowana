public class JavaCodeFilesManager {

    private static final JavaCodeFile BASE_FILE = new JavaCodeFile("SDA License", "java");

    public JavaCodeFile createFileWithContent(final String fileName, final String content) throws CloneNotSupportedException {
        JavaCodeFile baseFileClone = BASE_FILE.createClone(); // Wykorzystanie prototypu
        baseFileClone.setCode(content); // ustawienie reszty pól obiektu
        baseFileClone.setFileName(fileName);
        return baseFileClone;
    }

}