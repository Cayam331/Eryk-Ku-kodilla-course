package com.kodilla.stream;

import com.kodilla.stream.beautifer.PoemBeautifer;
import com.kodilla.stream.beautifer.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.SaySomething;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        PoemBeautifer poemBeautifer = new PoemBeautifer();

        poemBeautifer.beautify("tekst", (text) -> text.toUpperCase());
        poemBeautifer.beautify("TEKST", (text) -> text.toLowerCase());
        poemBeautifer.beautify("tekst", (text) -> text + " 123");
        poemBeautifer.beautify("tekst", (text) -> "ABC " + text);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
