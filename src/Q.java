package com.company;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of( 2021, 11, 30 );
        LocalDate nextBirthday = birthday.plusYears( 1 );
        LocalDate firstBirthday = birthday.minusYears( 35 );
        System.out.println( nextBirthday );
    }
    