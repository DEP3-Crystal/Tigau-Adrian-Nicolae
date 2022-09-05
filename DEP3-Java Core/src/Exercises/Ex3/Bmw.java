package Exercises.Ex3;

public class Bmw extends Car{

    @Override
    public void showTurnSignal() throws RuntimeException{
        throw new RuntimeException("No turn signal available on BMWs!");
    }
}
