package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String > languages = new HashMap<>();
        if (languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else {
            languages.put("Java", "a compiled high level, object oriented, platform independent language");
            System.out.println("java added");
        }
        languages.put("Java", "a complited high level, object oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        languages.put("Lisp", "therein lies madness");

        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else {
            languages.put("Java", "this course is about Java");
        }


        System.out.println("==================================================");

        languages.remove("Lisp");
        if (languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        }else {
            System.out.println("Algol not removed");
        }

        System.out.println(languages.replace("Lisp", " a functional programming language with imperative features"));
        System.out.println(languages.remove("Scala","this will not be added"));
        for (String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
