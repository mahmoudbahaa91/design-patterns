package creational.singleton;

public class Test {

    public static void main(String[] args) {

        EagerConfig eagerConfig1 = EagerConfig.getInstance();
        EagerConfig eagerConfig2 = EagerConfig.getInstance();
        System.out.println(eagerConfig1);
        System.out.println(eagerConfig2);

        LazyConfig lazyConfig1 = LazyConfig.getInstance();
        LazyConfig lazyConfig2 = LazyConfig.getInstance();
        System.out.println(lazyConfig1);
        System.out.println(lazyConfig2);

        LazyConfigStaticHolder lazyConfigStaticHolder1 = LazyConfigStaticHolder.getInstance();
        LazyConfigStaticHolder lazyConfigStaticHolder2 = LazyConfigStaticHolder.getInstance();
        System.out.println(lazyConfigStaticHolder1);
        System.out.println(lazyConfigStaticHolder2);

        // it prints same object reference.

    }

}
