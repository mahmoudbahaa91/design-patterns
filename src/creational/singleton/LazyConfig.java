package creational.singleton;

public class LazyConfig {

    private static volatile LazyConfig INSTANCE;

    private LazyConfig() {

    }

    public static LazyConfig getInstance() {

        if (INSTANCE == null) {
            synchronized (LazyConfig.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyConfig();
                }
            }
        }

        return INSTANCE;
    }


}
