import acm.graphics.GCanvas;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.Program;

import java.awt.Color;

public class Picture extends Program
{
    public Picture()
    {
        start();
    }

    public void init()
    {
        GCanvas canvas = new GCanvas();
        add(canvas);

        GOval c = new GOval(400, 400);
        canvas.add(c, 100, 10);
        c.setFilled(true);
        c.setFillColor(Color.YELLOW);

        GOval smile = new GOval(250, 200);
        canvas.add(smile, 175, 150);
        smile.setFilled(true);

        GRect smileCut = new GRect(170, 145, 260, 105);
        canvas.add(smileCut);
        smileCut.setColor(Color.YELLOW);
        smileCut.setFilled(true);
        smileCut.setFillColor(Color.YELLOW);

        GOval eye1 = new GOval(50, 100);
        canvas.add(eye1, 200, 75);
        eye1.setFilled(true);

        GOval eye2 = new GOval(50, 100);
        canvas.add(eye2, 345, 75);
        eye2.setFilled(true);
    }

    public static void main(String[] args)
    {
        Picture p = new Picture();
    }
}