package com;

import com.github.javafaker.Faker;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        System.out.println("Line 1");
        System.out.println("Line22");
        System.out.println("This is incognito guy");
        System.out.println("Incognito keeps going");
        System.out.println("More incognitos");
        System.out.println("my owm code");
        System.out.println("fdgdfgd");
        System.out.println("new line");
        System.out.println("code1");

        System.out.println("dfdsfdsfd");
        System.out.println("54");
        Faker faker = new Faker();


//String message = faker.regexify("(HI|HELLO|FUCK)");
//        System.out.println(message);
//        System.out.println(faker.regexify("M|F"));
//
//        String name = faker.regexify("(+1-)?\\d{3}-\\d{3}-\\d{4}");
//        System.out.println(name);
//        System.out.println(name.matches("(Andriy|Serhii)"));

//        String res = "";
//        String str = "501GCCCA098911HH52";
//        List<String> ar1, ar2;
//        if (str.matches("^\\d.*")){
//            ar1 = Arrays.asList(str.split("[A-Z]+"));
//            ar2 = Arrays.asList(str.split("[0-9]+"));
        //GooglePage googlePage = new GooglePage();
//LinkedInPage linkedInPage = new LinkedInPage();
//        }

        String str = "501GCCCA098911HH52";
        System.out.println(str.matches("\\w+"));
        String res = "";
        //  \\w = [A-Za-z0-9_]
        Matcher matcher = Pattern.compile("[A-Z]+|\\d+").matcher(str);
        while (matcher.find()){
            res += Arrays.stream(matcher.group().split("")).sorted().collect(Collectors.joining());
        }
        System.out.println(res);



//String message = faker.regexify("(HI|HELLO|FUCK)");
//        System.out.println(message);
//        System.out.println(faker.regexify("M|F"));
//
//        String name = faker.regexify("(+1-)?\\d{3}-\\d{3}-\\d{4}");
//        System.out.println(name);
//        System.out.println(name.matches("(Andriy|Serhii)"));
        System.out.println("Line 1");
        System.out.println("Line22");
        System.out.println("This is incognito guy");
        System.out.println("Incognito keeps going");
        System.out.println("More incognitos");
        System.out.println("my owm code");
        System.out.println("fdgdfgd");
        System.out.println("new line");
        System.out.println("code1");

        System.out.println("dfdsfdsfd");
        System.out.println("54");
//        String res = "";
//        String str = "501GCCCA098911HH52";
//        List<String> ar1, ar2;
//        if (str.matches("^\\d.*")){
//            ar1 = Arrays.asList(str.split("[A-Z]+"));
//            ar2 = Arrays.asList(str.split("[0-9]+"));
//        }
//
//        String str = "501GCCCA098911HH52";
//        System.out.println(str.matches("\\w+"));
//        String res = "";
//        //  \\w = [A-Za-z0-9_]
//        Matcher matcher = Pattern.compile("[A-Z]+|\\d+").matcher(str);
//        while (matcher.find()){
//            res += Arrays.stream(matcher.group().split("")).sorted().collect(Collectors.joining());
//        }
//        System.out.println(res);
//
//        Faker faker = new Faker();
//
//
////String message = faker.regexify("(HI|HELLO|FUCK)");
////        System.out.println(message);
////        System.out.println(faker.regexify("M|F"));
////
////        String name = faker.regexify("(+1-)?\\d{3}-\\d{3}-\\d{4}");
////        System.out.println(name);
////        System.out.println(name.matches("(Andriy|Serhii)"));
//
////        String res = "";
////        String str = "501GCCCA098911HH52";
////        List<String> ar1, ar2;
////        if (str.matches("^\\d.*")){
////            ar1 = Arrays.asList(str.split("[A-Z]+"));
////            ar2 = Arrays.asList(str.split("[0-9]+"));
////        }
//        System.out.println("Line 1");
//        System.out.println("Line22");
//        System.out.println("This is incognito guy");
//        System.out.println("Incognito keeps going");
//        System.out.println("More incognitos");
//        System.out.println("my owm code");
//        System.out.println("fdgdfgd");
//        System.out.println("new line");
//        System.out.println("code1");
//
//        System.out.println("dfdsfdsfd");
//        System.out.println("54");
//        String str = "501GCCCA098911HH52";
//        System.out.println(str.matches("\\w+"));
//        String res = "";
//        //  \\w = [A-Za-z0-9_]
//        Matcher matcher = Pattern.compile("[A-Z]+|\\d+").matcher(str);
//        while (matcher.find()){
//            res += Arrays.stream(matcher.group().split("")).sorted().collect(Collectors.joining());
//        }
//        System.out.println(res);
//
//        Faker faker = new Faker();
//
//
////String message = faker.regexify("(HI|HELLO|FUCK)");
////        System.out.println(message);
////        System.out.println(faker.regexify("M|F"));
////
////        String name = faker.regexify("(+1-)?\\d{3}-\\d{3}-\\d{4}");
////        System.out.println(name);
////        System.out.println(name.matches("(Andriy|Serhii)"));
//
////        String res = "";
////        String str = "501GCCCA098911HH52";
////        List<String> ar1, ar2;
////        if (str.matches("^\\d.*")){
////            ar1 = Arrays.asList(str.split("[A-Z]+"));
////            ar2 = Arrays.asList(str.split("[0-9]+"));
////        }
//        System.out.println("Line 1");
//        System.out.println("Line22");
//        System.out.println("This is incognito guy");
//        System.out.println("Incognito keeps going");
//        System.out.println("More incognitos");
//        System.out.println("my owm code");
//        System.out.println("fdgdfgd");
//        System.out.println("new line");
//        System.out.println("code1");
//
//        System.out.println("dfdsfdsfd");
//        System.out.println("54");
//        String str = "501GCCCA098911HH52";
//        System.out.println(str.matches("\\w+"));
//        String res = "";
//        //  \\w = [A-Za-z0-9_]
//        Matcher matcher = Pattern.compile("[A-Z]+|\\d+").matcher(str);
//        while (matcher.find()){
//            res += Arrays.stream(matcher.group().split("")).sorted().collect(Collectors.joining());
//        }
//        System.out.println(res);
    }
}
