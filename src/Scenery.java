import java.awt.*;

public class Scenery {

    private Color
                sky = new Color(21, 101, 200),
                cloud = new Color(236, 236, 236),
                roadLines = new Color(200, 200, 200),
                dirt1 = new Color(142, 113, 97),
                dirt2 = new Color(148, 123, 103),
                dirt3 = new Color(174, 147, 120),
                dirt4 = new Color(186, 154, 126);

    
    public void draw(Graphics2D g2) {
        // Sky
        g2.setPaint(new GradientPaint(Main.width / 2, Main.height - 100, sky, Main.width / 2, -Main.height/2, Color.white));
        g2.fillRect(0, 0, Main.width, Main.height);

        // Road
        g2.setPaint(new GradientPaint(-500, 400, new Color(212, 203, 198), Main.width - 200, 1000, new Color(32, 32, 34)));
        int[] a0pfv1Xs = new int[]{-1,-1,1200,1200,-1};
        int[] ahp8bYs = new int[]{446,675,675,481,446};
        g2.fillPolygon(a0pfv1Xs, ahp8bYs, a0pfv1Xs.length);

        // Road line 1
        g2.setColor(roadLines);
        int[] q36b4Xs = new int[]{285,278,42,54,285};
        int[] kq0u3Ys = new int[]{504,506,478,477,504};
        g2.fillPolygon(q36b4Xs, kq0u3Ys, q36b4Xs.length);

        // Road line 2
        g2.setColor(roadLines);
        int[] a6hmkgXs = new int[]{867,1200,1200,858,867};
        int[] a2tswwYs = new int[]{570,607,615,575,570};
        g2.fillPolygon(a6hmkgXs, a2tswwYs, a6hmkgXs.length);

        // Background dirt 1
        g2.setColor(dirt1);
        int[] n18qsXs = new int[]{1200,1200,1068,880,815,216,172,147,95,68,0,0,283,937,1079,1200};
        int[] bm8c3Ys = new int[]{220,120,170,205,199,320,315,325,341,341,370,393,345,261,245,220};
        g2.fillPolygon(n18qsXs, bm8c3Ys, n18qsXs.length);

        // Background dirt 3
        g2.setColor(dirt3);
        int[] a3s36oXs = new int[]{846,776,699,620,571,1033,926,869,846};
        int[] aqt7voYs = new int[]{201,236,264,296,309,252,232,204,201};
        g2.fillPolygon(a3s36oXs, aqt7voYs, a3s36oXs.length);

        // Background dirt 4
        g2.setColor(dirt4);
        int[] afcmrcXs = new int[]{893,951,1021,1070,1199,1199,1077,1031,925,893};
        int[] aujd55Ys = new int[]{216,214,191,169,120,220,246,251,233,216};
        g2.fillPolygon(afcmrcXs, aujd55Ys, afcmrcXs.length);

        // Background dirt 2
        g2.setColor(dirt2);
        int[] a681klXs = new int[]{1200,1200,1075,905,276,0,0,1200};
        int[] a0olcsYs = new int[]{481,219,245,265,346,392,446,481};
        g2.fillPolygon(a681klXs, a0olcsYs, a681klXs.length);
    }
}
