package challenge1;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        ch1 ch1 = new ch1();
        ch1.emptyFlux().subscribe((Consumer<? super String>) s -> System.out.println());
        ch1.fooBarFluxFromValues().subscribe((Consumer<? super String>) s -> System.out.println());

        try {
            ch1.errorFlux().subscribe((Consumer<? super String>) s -> System.out.println());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
