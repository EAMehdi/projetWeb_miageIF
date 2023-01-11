package com.miageif.projectweb.Alpha_Model;


import org.springframework.web.util.UriBuilder;

import java.net.URL;
import java.net.URLConnection;

public class JsonReader {

    public static void main(String[] args) {
        // Connect to the URL using java's native library
        // Url builder //
        UriBuilder
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();

        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
        String zipcode = rootobj.get("zip_code").getAsString(); //just grab the zipcode

    }
}
