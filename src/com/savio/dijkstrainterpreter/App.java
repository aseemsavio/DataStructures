package com.savio.dijkstrainterpreter;

public class App {
    public static void main(String[] args){
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        dijkstraAlgorithm.interpretExpression("( ( 1 + 2 ) * 2 )");
        dijkstraAlgorithm.result();
    }
}
