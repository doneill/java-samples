package com.jdoneill.datastructures;

import com.jdoneill.datastructures.model.Turf;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JSHelper {
    
    public static void main (String[] args){

        // get angle to convert
        double angle = Double.parseDouble(args[0]);

        String script = getResourcePath("turf.js");
        String script = readFile(path);
        
        Turf turf = new Turf(script);
        double radians = turf.degrees2radians(angle);
        turf.release();

        System.out.println(angle + " degrees = " + radians + " rad");

    }

    // get js from resource
    private static String getResourcePath(String path){
        InputStream in =  JSHelper.class.getResourceAsStream(path);
        try{
            return IOUtils.toString(in, "UTF-8");
        } catch (Exception e){
            return null;
        }
    }

    // Read file content into string with - Files.lines(Path path, Charset cs)
    private static String readFile(String filePath){
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8)){
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

}