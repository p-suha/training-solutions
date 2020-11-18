package stringmethods.url;

import java.util.List;

public class UrlManager {

    private String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;


    public UrlManager(String fullUrl) {
        this.protocol = getProtocol(fullUrl);
        this.host = getHost(fullUrl);
        this.port = getPortFromUrl(fullUrl);
        this.path = getPath(fullUrl);
        this.query = getQuery(fullUrl);
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getQuery() {
        return query;
    }


    private String getProtocol(String fullUrl) {

        int endProtocol = fullUrl.indexOf("://");

        if (endProtocol == -1 || fullUrl.substring(0, endProtocol).isEmpty()) {
            throw new IllegalArgumentException("Invalid url");
        }


        return fullUrl.substring(0, endProtocol).toLowerCase();

    }


    private String getHost(String fullUrl) {
        String host;

        int startIndex = fullUrl.indexOf("://") + 3;
        int endIndex = fullUrl.indexOf(":", startIndex);

        if (endIndex == -1) {
            endIndex = fullUrl.indexOf("/", startIndex);
        }

        if (endIndex == -1) {

            host = fullUrl.substring(startIndex).toLowerCase();
        } else {
            host = fullUrl.substring(startIndex, endIndex).toLowerCase();
        }
        if (host.isEmpty()) {

            throw new IllegalArgumentException("Invalid url");
        }


        return host;
    }


//    private Integer getPort(String fullUrl) {
//
//        int startIndex = fullUrl.indexOf("://") + 3;
//        startIndex = fullUrl.indexOf(":", startIndex);
//        if (startIndex == -1) {
//            return null;
//        }
//        int endIndex = fullUrl.indexOf("/", startIndex);
//        if (endIndex == -1) {
//
//            return Integer.valueOf(fullUrl.substring(startIndex + 1));
//        }
//
//
//        return Integer.valueOf(fullUrl.substring(startIndex + 1, endIndex));
//
//    }

    private Integer getPortFromUrl(String url) {
        int startIndex = url.indexOf("://") + 3;
        startIndex = url.indexOf(":", startIndex);
        if (startIndex == -1) {
            return null;
        }
        int endIndex = url.indexOf("/", startIndex);
        if (endIndex == -1) {
            return Integer.valueOf(url.substring(startIndex + 1));
        }
        return Integer.valueOf(url.substring(startIndex + 1, endIndex));
    }

    private String getPath(String fullUrl) {

        int startIndex = fullUrl.indexOf("://") + 3;
        startIndex = fullUrl.indexOf("/", startIndex);
        int endIndex = fullUrl.indexOf("?");
        if (startIndex == -1) {
            return "";
        }

        return fullUrl.substring(startIndex, endIndex);

    }


    private String getQuery(String fullUrl) {

        int startIndex = fullUrl.indexOf("?");
        if (startIndex == -1) {
            return "";
        }
        return fullUrl.substring(startIndex + 1);

    }


    public boolean hasProperty(String key) {

        validateString(key);

        return query.startsWith(key + "=") || query.startsWith("&" + key + "=");
    }


    public String getProperty(String key) {
        validateString(key);
        String[] props = query.split("&");
        for (String item : props) {
            String[] prop = item.split("=");
            if (prop[0].equals(key)) {
                return prop[1];
            }
        }
        return null;
    }


    private void validateString(String str) {
        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Parameter must not be empty");
        }

    }
}
