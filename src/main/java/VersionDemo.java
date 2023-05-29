public class VersionDemo {
    public static void main(String[] args) {
        System.out.printf("Hello! This program is running version %s", VersionDemo.class.getPackage().getImplementationVersion());
    }
}
