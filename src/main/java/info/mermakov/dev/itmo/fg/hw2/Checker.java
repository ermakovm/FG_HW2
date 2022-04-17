package info.mermakov.dev.itmo.fg.hw2;

public final class Checker {
    private Checker() {
    }

    public static boolean check(final String line) {
        if (line.isEmpty()) {
            return true;
        }
        final char[] symbols = line.toCharArray();
        boolean status = false;
        int currentState = 1;
        for (char symbol : symbols) {
            switch (currentState) {
                case 1 -> {
                    switch (symbol) {
                        case 'a' -> currentState = 2;
                        case 'c' -> {
                            currentState = 3;
                            status = true;
                        }
                        default -> {
                            return false;
                        }
                    }
                }
                case 2 -> {
                    switch (symbol) {
                        case 'b' -> {
                            currentState = 4;
                            status = true;
                        }
                        default -> {
                            return false;
                        }
                    }
                }
                case 3 -> {
                    switch (symbol) {
                        case 'a' -> {
                            currentState = 4;
                            status = true;
                        }
                        case 'b' -> {
                            currentState = 5;
                            status = true;
                        }
                        default -> {
                            return false;
                        }
                    }
                }
                case 5 -> {
                    switch (symbol) {
                        case 'b' -> {
                            currentState = 5;
                            status = true;
                        }
                        default -> {
                            return false;
                        }
                    }
                }
                default -> {
                    return false;
                }
            }
        }
        return status;
    }
}
