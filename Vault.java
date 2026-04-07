public class Vault {

    private static int securityLevel = 100;

    // статический вложенный класс
    public static class SecurityDisplayUnit {
        void showSecurityLevel() {
            System.out.println(securityLevel);
        }
    }
}
