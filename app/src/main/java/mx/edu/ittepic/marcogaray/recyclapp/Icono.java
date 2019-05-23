package mx.edu.ittepic.marcogaray.recyclapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Icono {
    Bitmap imagen;
    int x, y;

    public Icono(Lienzo este, int imagen, int posx, int posy) {
        this.imagen = BitmapFactory.decodeResource(este.getResources(), imagen);
        x = posx;
        y = posy;
    }

    public void mover(int dedox, int dedoy) {
        x = dedox - (imagen.getWidth() / 2);
        y = dedoy - (imagen.getHeight() / 2);
    }

    public void pintar(Canvas c, Paint p) {
        c.drawBitmap(imagen, x, y, p);
    }


    public boolean estaEnArea(int dedox, int dedoy){
        //int x2, y2;
        int x2 = x+imagen.getWidth();
        int y2 = y+imagen.getHeight();

        if(dedox>=x && dedox<=x2){
            if(dedoy>=y && dedoy<=y2){
                return true;
            }
        }
        return false;
    }
    //Tarea
    public boolean estaEnColision(Icono objetoB){
        int x2 = x+imagen.getWidth();
        int y2= y+imagen.getHeight();

        //1er caso
        if(objetoB.estaEnArea(x,y)){
            return true;
        }
        //2do
        if(objetoB.estaEnArea(x,y2)){
            return true;
        }
        //3er casoo
        if(objetoB.estaEnArea(x2,y)){
            return true;
        }
        //4to
        if(objetoB.estaEnArea(x2,y2)){
            return true;
        }

        return false;
    }

}