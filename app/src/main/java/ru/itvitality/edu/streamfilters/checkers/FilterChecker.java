package ru.itvitality.edu.streamfilters.checkers;

import ru.itvitality.edu.streamfilters.model.Student;

import java.util.List;

public interface FilterChecker {
    List<Student> filter( List<Student> students );
}
