package com.gpotje.estudos.bloco1_5.ex1;

public class Principal {
    public static void main(String[] args) {
        Sort bs =  new BubbleSort();
        Sort qs = new QuickSort();

        SortService service = new SortService();
        service.sort(bs);
        service.sort(qs);
    }
}
