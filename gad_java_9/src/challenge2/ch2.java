package challenge2;

import reactor.core.publisher.Mono;

public class ch2 {
    public Mono<String> emptyMono() {
        return Mono.empty();
    }

    public Mono<String> monoWithNoSignal() {
        return Mono.never();
    }

    public Mono<String> fooMono() {
        return Mono.just("foo");
    }

    public Mono<String> errorMono() {
        return Mono.error(new Exception());
    }
}
