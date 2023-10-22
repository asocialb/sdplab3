// Old System
class IOS_16 {
    public void doSomethingOld() {
        System.out.println("Old system is doing something.");
    }
}

// New System
interface IOS_17 {
    void doSomethingNew();
}

// Adapter
class OldSystemAdapter implements IOS_17 {
    private final IOS_16 ios16;

    public OldSystemAdapter(IOS_16 ios16) {
        this.ios16 = ios16;
    }

    @Override
    public void doSomethingNew() {
        ios16.doSomethingOld();
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the New System directly
        IOS_17 IOS17 = () -> System.out.println("New options added");

        IOS17.doSomethingNew();

        // Using the Old System via the Adapter
        IOS_16 iphone16 = new IOS_16();
        IOS_17 adapter = new OldSystemAdapter(iphone16);

        adapter.doSomethingNew();
    }
}