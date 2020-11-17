package stringmethods.filename;

public class FileNameManipulator {


    public char findLastCharacter (String str) {

        if (str == null || str.trim().isBlank()) {
            throw new IllegalArgumentException("Empty string!");
        }
 str = str.trim();
        return str.charAt(str.length()-1);
    }


    public String findFileExtension (String filename) {

        if (filename == null || filename.isBlank() || filename.lastIndexOf('.') == 0)
        {
            throw new IllegalArgumentException("Invalid file name!");
        }

        filename = filename.trim();
        int index = filename.lastIndexOf('.');

        return filename.substring(index).toLowerCase();
    }


    public boolean identifyFilesByExtension (String fileName, String ext) {

        if (fileName == null || ext == null  || ext.contains(".") || fileName.equals("") || fileName.isBlank()|| ext.isBlank()) {
throw new IllegalArgumentException("Invalid argument!");
        }


        fileName = fileName.trim();
        ext = ext.trim();
        String originExt = fileName.substring(fileName.lastIndexOf(".")+1);

        return fileName.endsWith(ext);

    }


    public String changeExtensionToLowerCase(String filename) {

        if (filename =="" || filename.isBlank())
        {
            throw new IllegalArgumentException("Empty string!");
        }

        if (filename.indexOf(".") == 0) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        filename = filename.trim();
        int index = filename.lastIndexOf('.');

        String namePart = filename.substring(0, index);
        String extension = filename.substring(index+1).toLowerCase();
        return namePart + "." + extension;
    }

    public boolean compareFilesByName(String searched, String actual) {

        if (searched == null || searched.isBlank() || actual == null || actual.isBlank()) {
            throw new IllegalArgumentException("Invalid argument!");
        }

       String[] keresettNev = searched.trim().split("\\.",2);
       String[] aktualisNev = actual.trim().split("\\.", 0);

       String keresettCsaknev = keresettNev[0];
       String aktualCsaknev = aktualisNev[0];

       return keresettCsaknev.equals(aktualCsaknev);
    }


public String changeExtensionToLowercase(String fileName) {

        fileName = fileName.trim();
        return findFileExtension(fileName).toLowerCase();
}


    public String replaceStringPart (String fileName, String present, String target) {
        if (fileName == null || fileName.isBlank())
        {
            throw new IllegalArgumentException("Empty string!");
        }

        return fileName.replace(present, target);

    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
}
}
