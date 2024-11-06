package start_marathon_metodos.test;

import start_marathon_metodos.dominio.Calculadora;

import java.util.Map;
import java.util.function.BiFunction;

public class CalculadoraTest01 {
    public static void main(String[] args) {


        Map<String, BiFunction<Integer, Integer, Integer>> functionMap = Map.of(
                "add", Integer::sum,
                "subtract", (x, y) -> x - y,
                "multiply", (x, y) -> x * y,
                "divide", (x, y) -> y != 0 ? x / y : null
        );

        System.out.println(functionMap.get("add").apply(30,10));
    }
}
