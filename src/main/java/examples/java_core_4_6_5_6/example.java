package examples.java_core_4_6_5_6;

import java.util.*;
import java.util.stream.Collectors;

public class example {

    public void a() {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        List<String> result = list.stream()
                .filter( s -> Character.isUpperCase(s.charAt(0)) )
                .collect( Collectors.toList() );

        ArrayList<String> a = new ArrayList<String>();
        Collections.addAll(list, "Привет", "как", "дела?");

        Set<String> resultSet = a.stream()
                .filter( s -> Character.isUpperCase(s.charAt(0)) )
                .collect( Collectors.toSet() );

        ArrayList<String> b = new ArrayList<String>();
        Collections.addAll(list, "a=2", "b=3", "c=4", "d==3", "e1");

        Map<String, String> resultMap = list.stream()
                .map( e -> e.split("=") )
                .filter( e -> e.length == 2 )
                .collect( Collectors.toMap(e -> e[0], e -> e[1]) );
    }

}
