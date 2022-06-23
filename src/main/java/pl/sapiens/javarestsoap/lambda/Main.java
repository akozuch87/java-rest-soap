package pl.sapiens.javarestsoap.lambda;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        System.out.println(getNick() != null ? getNick().length(): 0);

        maybeNick()
                .map(nick -> nick.length())
                .ifPresent(integer -> System.out.println("Nick length: " + integer));

    }



    static Optional<String> maybeNick () {
        return Optional.ofNullable(null);
    }

    static String getNick() {
        return null;
    }

}
