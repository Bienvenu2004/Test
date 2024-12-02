package com.Practice.ScannerPractices;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Hcalculator {

    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("JavaScript");


    public void Calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Waiting Operation: ");
        String operation = scanner.nextLine();
        

        try {
            Object result = engine.eval(operation);
            System.out.println(result);
        } catch (ScriptException e) {
            System.err.println("Error evaluating expression: " + e.getMessage());
        }

    }
}
