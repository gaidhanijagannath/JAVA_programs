package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
    public static void main(String[] args) {

        CompletableFuture<String> user =
                CompletableFuture.supplyAsync(() -> "Jaggu");

        CompletableFuture<String> order =
                CompletableFuture.supplyAsync(() -> "Orders");

        CompletableFuture<String> result =
                user.thenCombine(order,
                        (u, o) -> u + " -> " + o);

        System.out.println(result.join());

    }
}
