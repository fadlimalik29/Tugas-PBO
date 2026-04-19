/* NIM   : 13020240242
Nama  : La Ode Muh. Fadli Malik
Hari/Tanggal : 18 April
Waktu : 14:00*/

package konversiwaktu;

public class KonversiWaktu {
    private long detik;

    public KonversiWaktu(long detik) {
        this.detik = detik;
    }

    public long jam() {
        return (detik / 3600) % 24;
    }

    public long menit() {
        return (detik / 60) % 60;
    }

    public long detik() {
        return detik % 60;
    }
}
