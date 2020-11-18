package stringbuilder;

public class NameBuilder {

/*

public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title)
public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title)
public String insertTitle(String name, Title title, String where)
public String deleteNamePart(String name, String delete)
 */


    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw  new IllegalArgumentException("Family name and given name must not be empty!");
        }

        StringBuilder nameString = new StringBuilder("");
        if(title != null) {

            nameString = nameString.append(title.getTitleString()).append( " ").append(givenName);
        } else {
            nameString = nameString.append(givenName);
        }

        nameString.append(" ");

        if( middleName !=null && !middleName.isEmpty()) {

            nameString.append(middleName).append(" ");
            }


        nameString = nameString.append(familyName);

    return nameString.toString();
    }


    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title){

        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw  new IllegalArgumentException("Family name and given name must not be empty!");
        }

        StringBuilder nameString = new StringBuilder("");
        if(title != null) {

            nameString = nameString.append(title.getTitleString()).append( " ").append(familyName);
        } else {
            nameString = nameString.append(familyName);
        }

        nameString.append(" ");

        if( middleName !=null && !middleName.isEmpty()) {

            nameString.append(middleName).append(" ");
        }


        nameString = nameString.append(givenName);

        return nameString.toString();

    }

    public String insertTitle(String name, Title title, String where) {

        StringBuilder strbl = new StringBuilder(name);

        int index = strbl.indexOf(where);
        strbl.insert(index + 1,(title.getTitleString() + " "));
        return strbl.toString();
    }

    public String deleteNamePart(String name, String delete) {

        StringBuilder strbl = new StringBuilder(name);

        int index = strbl.indexOf(delete);
        strbl.delete(index, index + delete.length());
        return strbl.toString();
    }


    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
