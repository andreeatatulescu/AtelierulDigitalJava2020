package challenge2;

import challenge1.PrintSubscriber;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ch2 ch2 = new ch2();
        PrintSubscriber subscriber = new PrintSubscriber();
        ch2.emptyMono().subscribe((Consumer<? super String>) subscriber);
        ch2.monoWithNoSignal().subscribe((Consumer<? super String>) subscriber);
        ch2.fooMono().subscribe((Consumer<? super String>) subscriber);
        ch2.errorMono().subscribe((Consumer<? super String>) subscriber);
    }
}
