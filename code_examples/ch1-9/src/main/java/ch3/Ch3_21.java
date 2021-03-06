/* Compilable code examples can be found at https://github.com/thomasnield/packt_learning_rxjava */

package ch3;

import io.reactivex.Observable;

public class Ch3_21 {
    public static void main(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma", "Delta",
                "Epsilon")
                .repeat(2)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}