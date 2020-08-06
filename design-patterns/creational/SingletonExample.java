class Singleton {
    private int someCumbersomeResource;
    private static Singleton instance = null;

    private Singleton() {
        this.someCumbersomeResource = 42;
    }

    public static Singleton getSingleton() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}


public class SingletonExample {
    public static void main(String[] args) {
        // static method call is the only way to retrieve Singleton object
        Singleton s = Singleton.getSingleton();
    }
}
