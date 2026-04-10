package com.gpotje.estudos.bloco1_4.ex3;

public class Retry implements RetryPolicy{
    @Override
    public void retry() {
        System.out.println("Retrying if fails...");
    }
}
