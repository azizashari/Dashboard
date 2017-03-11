package plaupi.dashboardsipeja.config;

/**
 * Created by Aziz on 09/03/2017.
 */

public class Config {

    public static final String URL = "http://sipeja.pe.hu/";

    //JSON untuk Pendapatan Per Lab
    public static final String JSON_ARRAY = "result";
    public static final String KEY_BIAYA = "biaya"; //total pendapatan per lab
    public static final String KEY_LABS = "nama"; //nama laboratorium
    public static final String KEY_TAHUN = "tahun"; //tahun

    //JSON untuk Status Pembayaran
    public static final String KEY_LUNAS = "Lunas"; //total lunas
    public static final String KEY_BELUMLUNAS = "BelumLunas"; //total belum lunas
}

