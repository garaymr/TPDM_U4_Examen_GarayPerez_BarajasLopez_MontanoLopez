package mx.edu.ittepic.marcogaray.recyclapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Lienzo extends View {
    String posicion="";
    Icono bpapel, bmetal, bvidrio, bresiduos, bplastico, borganico, articulo, marco, puntero;
    Icono papeluno, papeldos, papeltres, papelcuatro, papelcinco, plasticouno, plasticodos, plasticotres, plasticocuatro, plasticocinco, metaluno, metaldos, metaltres, metalcuatro, metalcinco, orguno, orgdos, orgtres, orgcuatro, orgcinco, vidriouno, vidriodos, vidriotres,vidriocuatro, vidriocinco;
    Icono resiuno, residos, resitres, resicuatro, resicinco;
    int puntos=0;
    String vidas = "Vidas: ❤❤❤";
    int n = vidas.length();
    public Lienzo(Context context) {
        super(context);
        //Botes
        bpapel = new Icono(this, R.drawable.bpapelc, 50, 300);
        bplastico = new Icono(this, R.drawable.bplasticoc, 500, 300);
        bmetal = new Icono(this, R.drawable.bmetalc, 950, 300);
        borganico = new Icono(this, R.drawable.borganicoc, 50, 1600);
        bvidrio = new Icono(this, R.drawable.bvidrioc, 500, 1600);
        bresiduos = new Icono(this, R.drawable.bresiduosc, 950, 1600);
        //Marco
        marco = new Icono(this, R.drawable.frame, 310, 850);
        //Articulos apapel
        papeluno = new Icono(this, R.drawable.papelunoc, 500, 900);
        papeldos = new Icono(this, R.drawable.papeldosc, 500, 900);
        papeltres = new Icono(this, R.drawable.papeltresc, 500, 900);
        papelcuatro = new Icono(this, R.drawable.papelcuatroc, 500, 900);
        papelcinco = new Icono(this, R.drawable.papelcincoc, 500, 900);
        //Articulos plastico
        plasticouno = new Icono(this, R.drawable.plasticounoc, 500, 900);
        plasticodos = new Icono(this, R.drawable.plasticodosc, 500, 900);
        plasticotres = new Icono(this, R.drawable.plasticotresc, 500, 900);
        plasticocuatro = new Icono(this, R.drawable.plasticocuatroc, 500, 900);
        plasticocinco = new Icono(this, R.drawable.plasticocincoc, 500, 900);
        //Articulos metal
        metaluno = new Icono(this, R.drawable.metalunoc, 500, 900);
        metaldos = new Icono(this, R.drawable.metaldosc, 500, 900);
        metaltres = new Icono(this, R.drawable.metaltresc, 500, 900);
        metalcuatro = new Icono(this, R.drawable.metalcuatroc, 500, 900);
        metalcinco = new Icono(this, R.drawable.metalcincoc, 500, 900);
        //Articulos organico
        orguno = new Icono(this, R.drawable.organicaunoc, 500, 900);
        orgdos = new Icono(this, R.drawable.organicadosc, 500, 900);
        orgtres = new Icono(this, R.drawable.organicatresc, 500, 900);
        orgcuatro = new Icono(this, R.drawable.organicacuatroc, 500, 900);
        orgcinco = new Icono(this, R.drawable.organicacinscoc, 500, 900);
        //Articulos vidrio
        vidriouno = new Icono(this, R.drawable.vidriounoc, 500, 900);
        vidriodos = new Icono(this, R.drawable.vidriodosc, 500, 900);
        vidriotres = new Icono(this, R.drawable.vidriotresc, 500, 900);
        vidriocuatro = new Icono(this, R.drawable.vidriocuatroc, 500, 900);
        vidriocinco = new Icono(this, R.drawable.vidriocincoc, 500, 900);
        //Articulos residuos
        resiuno = new Icono(this, R.drawable.residuosunoc, 500, 900);
        residos = new Icono(this, R.drawable.residuosdosc, 500, 900);
        resitres = new Icono(this, R.drawable.residuostresc, 500, 900);
        resicuatro = new Icono(this, R.drawable.residuoscuatroc, 500, 900);
        resicinco = new Icono(this, R.drawable.residuoscincoc, 500, 900);
        puntero = null;
    }

    int max = 6;
    int min = 1;
    int range = max-min+1;
    int rand = (int)(Math.random()*range)+min;
    //int rand = 1;

    int maxP = 5;
    int minP = 1;
    int rangeP = max-min+1;
    int randP = (int)(Math.random()*range)+min;
    //int randP = 1;


    protected void onDraw(Canvas c) {
        Paint p = new Paint();
        c.drawColor(Color.WHITE);
        //Rectangulo amarillo
        p.setColor(Color.rgb(255, 235, 59));
        c.drawRect(0, 0, 1440, 100, p);
        //Texto puntos
        p.setColor(Color.BLACK);
        p.setTextSize(60f);
        c.drawText("Puntos: " + puntos, 50, 70, p);
        //Texto vida
        c.drawText(vidas, 1000, 70, p);
        p.setTextSize(50f);
        c.drawText(posicion, 50, 150, p);
        //-----------------------------------Botes de basura
        //Bote papel
        bpapel.pintar(c, p);
        //Bote plastico
        bplastico.pintar(c, p);
        //Bote metal
        bmetal.pintar(c, p);
        //Bote organico
        borganico.pintar(c, p);
        //Bote vidrio
        bvidrio.pintar(c, p);
        //Bote residuos
        bresiduos.pintar(c, p);
        //Marco
        //marco.pintar(c,p);

        //Articulo Papel
        if (rand == 1) {

            switch (randP) {
                case 1:
                    papeluno.pintar(c, p);
                    break;
                case 2:
                    papeldos.pintar(c, p);
                    break;
                case 3:
                    papeltres.pintar(c, p);
                    break;
                case 4:
                    papelcuatro.pintar(c, p);
                    break;
                case 5:
                    papelcinco.pintar(c, p);
                    break;
            }

        }
        //Articulo plastico
        if (rand == 2) {

            switch (randP) {
                case 1:
                    plasticouno.pintar(c, p);
                    break;
                case 2:
                    plasticodos.pintar(c, p);
                    break;
                case 3:
                    plasticotres.pintar(c, p);
                    break;
                case 4:
                    plasticocuatro.pintar(c, p);
                    break;
                case 5:
                    plasticocinco.pintar(c, p);
                    break;
            }

        }
        //Articulo metal
        if (rand == 3) {

            switch (randP) {
                case 1:
                    metaluno.pintar(c, p);
                    break;
                case 2:
                    metaldos.pintar(c, p);
                    break;
                case 3:
                    metaltres.pintar(c, p);
                    break;
                case 4:
                    metalcuatro.pintar(c, p);
                    break;
                case 5:
                    metalcinco.pintar(c, p);
                    break;
            }

        }
        //Articulo organico
        if (rand == 4) {

            switch (randP) {
                case 1:
                    orguno.pintar(c, p);
                    break;
                case 2:
                    orgdos.pintar(c, p);
                    break;
                case 3:
                    orgtres.pintar(c, p);
                    break;
                case 4:
                    orgcuatro.pintar(c, p);
                    break;
                case 5:
                    orgcinco.pintar(c, p);
                    break;
            }

        }
        //Articulo vidrio
        if (rand == 5) {

            switch (randP) {
                case 1:
                    vidriouno.pintar(c, p);
                    break;
                case 2:
                    vidriodos.pintar(c, p);
                    break;
                case 3:
                    vidriotres.pintar(c, p);
                    break;
                case 4:
                    vidriocuatro.pintar(c, p);
                    break;
                case 5:
                    vidriocinco.pintar(c, p);
                    break;
            }

        }
        //Articulo residuos
        if (rand == 6) {

            switch (randP) {
                case 1:
                    resiuno.pintar(c, p);
                    break;
                case 2:
                    residos.pintar(c, p);
                    break;
                case 3:
                    resitres.pintar(c, p);
                    break;
                case 4:
                    resicuatro.pintar(c, p);
                    break;
                case 5:
                    resicinco.pintar(c, p);
                    break;
            }
        }
        //Rectangulo naranja
        p.setColor(Color.rgb(255, 193, 22));
        c.drawRect(144, 2250, 1305, 2350, p);
        //Texto descripción objeto
        p.setColor(Color.WHITE);
        c.drawText("¡Escoge sabiamente y cuida al planeta!", 310, 2315, p);
        p.setTextSize(50f);
    }


    public boolean onTouchEvent(MotionEvent me){
        int accion = me.getAction();
        int posx = (int) me.getX();
        int posy = (int) me.getY();

        posicion = posx + "," + posy;

        switch (accion){
            case MotionEvent.ACTION_DOWN:
             //Papel
                if(papeluno.estaEnArea(posx,posy)){
                    puntero = papeluno;
                    //break;
                }else if (papeldos.estaEnArea(posx,posy)){
                    puntero = papeldos;
                    //break;
                }else if(papeltres.estaEnArea(posx,posy)){
                    puntero = papeltres;
                    //break;
                }else if(papelcuatro.estaEnArea(posx, posy)){
                    puntero = papelcuatro;
                    //break;
                }else if(papelcinco.estaEnArea(posx, posy)){
                    puntero = papelcinco;
                    //break;
                }

            //Plastico
                if(plasticouno.estaEnArea(posx,posy)){
                    puntero = plasticouno;
                    //break;
                }else if (plasticodos.estaEnArea(posx,posy)){
                    puntero = plasticodos;
                    //break;
                }else if(plasticotres.estaEnArea(posx,posy)){
                    puntero = plasticotres;
                    //break;
                }else if(plasticocuatro.estaEnArea(posx, posy)){
                    puntero = plasticocuatro;
                    // break;
                }else if(plasticocinco.estaEnArea(posx, posy)) {
                    puntero = plasticocinco;
                    //break;
                }
            //Metal
                if(metaluno.estaEnArea(posx,posy)){
                    puntero = metaluno;
                    //break;
                }else if (metaldos.estaEnArea(posx,posy)){
                    puntero = metaldos;
                    // break;
                }else if(metaltres.estaEnArea(posx,posy)){
                    puntero = metaltres;
                    //break;
                }else if(metalcuatro.estaEnArea(posx, posy)){
                    puntero = metalcuatro;
                    //break;
                }else if(metalcinco.estaEnArea(posx, posy)){
                    puntero = metalcinco;
                    //break;
                }

            //Organico
                if(orguno.estaEnArea(posx,posy)){
                    puntero = orguno;
                    //break;
                }else if (orgdos.estaEnArea(posx,posy)){
                    puntero = orgdos;
                    //break;
                }else if(orgtres.estaEnArea(posx,posy)){
                    puntero = orgtres;
                    //break;
                }else if(orgcuatro.estaEnArea(posx, posy)){
                    puntero = orgcuatro;
                    //break;
                }else if(orgcinco.estaEnArea(posx, posy)){
                    puntero = orgcinco;
                    //break;
                }

            //Vidrio
                if(vidriouno.estaEnArea(posx,posy)){
                    puntero = vidriouno;
                    //break;
                }else if (vidriodos.estaEnArea(posx,posy)){
                    puntero = vidriodos;
                    //break;
                }else if(vidriotres.estaEnArea(posx,posy)){
                    puntero = vidriotres;
                    //break;
                }else if(vidriocuatro.estaEnArea(posx, posy)){
                    puntero = vidriocuatro;
                    //break;
                }else if(vidriocinco.estaEnArea(posx, posy)){
                    puntero = vidriocinco;
                    //break;
                }


            //Residuos
                if(resiuno.estaEnArea(posx,posy)){
                    puntero = resiuno;
                    //break;
                }else if (residos.estaEnArea(posx,posy)){
                    puntero = residos;
                    //break;
                }else if(resitres.estaEnArea(posx,posy)){
                    puntero = resitres;
                    //break;
                }else if(resicuatro.estaEnArea(posx, posy)){
                    puntero = resicuatro;
                    //break;
                }else if(resicinco.estaEnArea(posx, posy)){
                    puntero = resicinco;
                    //break;
                }

                break;
            case MotionEvent.ACTION_MOVE:
                if(puntero != null){
                    puntero.mover(posx, posy);
                }
                break;
            case MotionEvent.ACTION_UP:
                //soltó
                //---------------------
                //Colisión papel

                if(papeluno.estaEnColision(bpapel)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(papeldos.estaEnColision(bpapel)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;

                }
                if(papeltres.estaEnColision(bpapel)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;

                }
                if(papelcuatro.estaEnColision(bpapel)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(papelcinco.estaEnColision(bpapel)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(plasticouno.estaEnColision(bplastico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(plasticodos.estaEnColision(bplastico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(plasticotres.estaEnColision(bplastico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(plasticocuatro.estaEnColision(bplastico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(plasticocinco.estaEnColision(bplastico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                //Colisón metal
                if(metaluno.estaEnColision(bmetal)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(metaldos.estaEnColision(bmetal)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(metaltres.estaEnColision(bmetal)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(metalcuatro.estaEnColision(bmetal)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(metalcinco.estaEnColision(bmetal)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                //Colisión organico
                if(orguno.estaEnColision(borganico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(orgdos.estaEnColision(borganico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(orgtres.estaEnColision(borganico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(orgcuatro.estaEnColision(borganico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(orgcinco.estaEnColision(borganico)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                //Colisión vidrio
                if(vidriouno.estaEnColision(bvidrio)) {
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(vidriodos.estaEnColision(bvidrio)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(vidriotres.estaEnColision(bvidrio)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(vidriocuatro.estaEnColision(bvidrio)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(vidriocinco.estaEnColision(bvidrio)) {
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                //Colisión residuos
                if(resiuno.estaEnColision(bresiduos)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(residos.estaEnColision(bresiduos)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(resitres.estaEnColision(bresiduos)) {
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(resicuatro.estaEnColision(bresiduos)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;
                }
                if(resicinco.estaEnColision(bresiduos)){
                    Toast.makeText(getContext().getApplicationContext(), "¡Correcto!", Toast.LENGTH_SHORT).show();
                    puntos += 10;

                }

                else{
                    vidas = vidas.substring(0, n-1);
                }
                //---------------------
                puntero = null;
                break;
        }


        invalidate(); //Volver a pintar
        return true;

    }

}