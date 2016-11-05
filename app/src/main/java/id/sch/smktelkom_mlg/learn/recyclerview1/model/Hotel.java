package id.sch.smktelkom_mlg.learn.recyclerview1.model;

import android.graphics.drawable.Drawable;

/**
 * Created by USER on 05/11/2016.
 */
public class Hotel
{
    public String Judul;
    public String Deskripsi;
    public Drawable Foto;

    public Hotel(String Judul, String Deskripsi, Drawable Foto)
    {
        this.Judul = Judul;
        this.Deskripsi = Deskripsi;
        this.Foto = Foto;
    }

}
