class Main {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int l = 5; l >= i; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
