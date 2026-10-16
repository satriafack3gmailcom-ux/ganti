package strukturdata;

public class Main {

    public static void main(String[] args) {
        LinkedStack<Koran> stack = new LinkedStack<>();

        // Dataset sesuai tabel: Koran nomor 1 s.d. 6
        String[] nama = {"Jawa Pos", "Jawa Pos", "Jawa Pos", "Jawa Pos", "Jawa Pos", "Jawa Pos"};
        String[] tgl  = {"08/11/2026", "07/11/2026", "06/11/2026",
                "05/11/2026", "04/11/2026", "03/11/2026"};

        // Kronologis: edisi terlama (03/11) masuk lebih dulu, edisi terbaru (08/11) terakhir
        // sehingga edisi terbaru berada di posisi paling atas stack.
        System.out.println("=== Proses Push Koran (Kronologis) ===");
        for (int i = nama.length - 1; i >= 0; i--) {
            Koran koran = new Koran();
            koran.setNama(nama[i]);
            koran.setTglTerbit(tgl[i]);

            stack.push(koran);
            System.out.println("Push Koran " + (i + 1) + " -> "
                    + koran.getNama() + " | " + koran.getTglTerbit());
        }

        System.out.println("\nJumlah koran dalam stack: " + stack.size());
        System.out.println("Koran paling atas (terbaru): "
                + stack.peek().getNama() + " | " + stack.peek().getTglTerbit());

        // Isi stack dari atas ke bawah
        System.out.println("\n=== Isi Stack (Atas -> Bawah) ===");
        int[] nomor = {1};
        stack.forEachFromTop(k -> {
            System.out.println("Koran " + nomor[0] + " | "
                    + k.getNama() + " | " + k.getTglTerbit());
            nomor[0]++;
        });

        // Simulasi pengambilan koran (pop): yang terbaru keluar lebih dulu
        System.out.println("\n=== Proses Pop (Pengambilan Koran) ===");
        while (!stack.isEmpty()) {
            Koran k = stack.pop();
            System.out.println("Pop -> " + k.getNama() + " | " + k.getTglTerbit());
        }
    }
}
