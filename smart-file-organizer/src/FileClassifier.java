public class FileClassifier {
    public static String classify(String ext) {
        if (ext == null || ext.isBlank()) {
            return "others";
        }
        return ext.substring(1).toLowerCase();
    }
}
