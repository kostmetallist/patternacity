# Creational design patterns

There is a couple of ways how objects can be created. For instance, software
engineer should be aware of possible race conditions when dealing with multiple
accessors of some shared resource. Or one may need to incorporate convenient
parameters passing while instantiating objects. Creational patterns are
proposed in order to facilitate solving of such problems.

## Singleton

Uses one instance of a class, and direct constructor access is denied from
client's code.

### Motivation

In situations when it is crucial to have only one instance of a class,
singletons are used for centralized management of resources, and they provide
a global point of access to themselves. The same object can be used from
everywhere, being impossible to invoke directly each time.

It substitutes global variables usage, thus providing a possibility to create
the singleton on demand (and not lasting for the duration of a program).

### Example

```java
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
```

Full example &mdash; [Code snippet](SingletonExample.java)
