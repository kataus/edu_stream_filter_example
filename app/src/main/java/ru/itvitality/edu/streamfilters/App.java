
package ru.itvitality.edu.streamfilters;

import ru.itvitality.edu.streamfilters.checkers.impl.OneFilterChecker;
import ru.itvitality.edu.streamfilters.checkers.impl.SeveralFilterChecker;
import ru.itvitality.edu.streamfilters.model.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class App {
    private static final Integer LIST_SIZE = 40000000;

    public static void main( String[] args ) {
        List<Student> studentsOne = new ArrayList<>();
        List<Student> studentsTwo = new ArrayList<>();

        for ( int i = 0; i < LIST_SIZE; i++ ) {
            var student = generateStudent();
            studentsOne.add( student );
//            studentsTwo.add( student );
        }

        var startTime = new Date().getTime();
        var result = new OneFilterChecker().filter( studentsOne );
        var endTime = new Date().getTime();
        System.out.println( "One filter time = " + ( endTime - startTime ) + " result size = " + result.size() );

        startTime = new Date().getTime();
        result = new SeveralFilterChecker().filter( studentsOne );
        endTime = new Date().getTime();
        System.out.println( "One filter time = " + ( endTime - startTime ) + " result size = " + result.size() );
    }

    private static Student generateStudent() {
        var random = new Random();
        return new Student( random.nextInt( 5 ) + 1, random.nextInt( 10 ) + 15,
                random.nextFloat( 5f ), random.nextInt( 2 ) );
    }
}
