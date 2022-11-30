package ru.itvitality.edu.streamfilters.checkers.impl;

import ru.itvitality.edu.streamfilters.checkers.FilterChecker;
import ru.itvitality.edu.streamfilters.model.Student;

import java.util.List;
import java.util.stream.Collectors;

public class OneFilterChecker implements FilterChecker {
    @Override
    public List<Student> filter( List<Student> students ) {
        return students
                .stream()
                .filter( s-> s.age() > 20 && s.average() > 4f && s.course() <=3 && s.gender() == 1)
                .collect( Collectors.toList());
    }
}
