package ru.itvitality.edu.streamfilters.checkers.impl;

import ru.itvitality.edu.streamfilters.checkers.FilterChecker;
import ru.itvitality.edu.streamfilters.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class SeveralFilterChecker implements FilterChecker {
    @Override
    public List<Student> filter( List<Student> students ) {
        return students
                .stream()
                .filter( s -> s.age() > 20 )
                .filter( s -> s.average() > 4f )
                .filter( s -> s.course() <= 3 )
                .filter( s -> s.gender() == 1 )
                .collect( Collectors.toList() );
    }
}
