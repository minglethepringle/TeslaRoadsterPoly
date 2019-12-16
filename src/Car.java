import java.awt.*;

public class Car {

    private Color
                paint = new Color(203, 0, 35),
                wheelOuter = new Color(24, 23, 31),
                wi1 = new Color(21, 12, 8),
                wi2 = new Color(15, 14, 19),
                wi3 = new Color(40, 32, 37),
                wi4 = new Color(82, 83, 98),
                window = new Color(79, 86, 102),
                headlights1 = new Color(41, 42, 44),
                headlights2 = new Color(213, 222, 231),
                fender = new Color(0, 3, 6),
                teslaLogo = new Color(150, 150, 150),
                shadow = new Color(21, 12, 8, 100);

    
    public void draw(Graphics2D g2) {

        // Shadow
        g2.setColor(shadow);
        int[] aapwcjXs = new int[]{304,382,550,561,605,902,922,927,863,858,830,815,807,461,297,304};
        int[] a7kkkzYs = new int[]{498,500,514,519,523,506,500,497,493,496,495,495,486,469,480,498};
        g2.fillPolygon(aapwcjXs, a7kkkzYs, aapwcjXs.length);

        // Base of car
        g2.setColor(paint);
        int[] bure6Xs = new int[]{516,451,403,346,318,296,285,290,303,360,371,550,564,602,649,667,816,900,915,907,912,897,860,751,660,600,551,516};
        int[] f4858Ys = new int[]{290,295,314,357,359,372,411,471,494,496,480,493,515,521,519,493,489,479,472,459,420,379,351,348,304,292,289,290};
        g2.fillPolygon(bure6Xs, f4858Ys, bure6Xs.length);

        // Back wheel outer
        g2.setColor(wheelOuter);
        int[] kr77wXs = new int[]{313,305,295,288,287,290,303,360,371,342,331,320,313};
        int[] k9llkYs = new int[]{388,390,399,421,434,471,495,496,480,477,422,393,388};
        g2.fillPolygon(kr77wXs, k9llkYs, kr77wXs.length);

        // Back wheel inner 1
        g2.setColor(wi1);
        int[] fgrfcXs = new int[]{306,301,295,291,289,289,290,293,298,302,311,316,320,325,326,324,322,318,313,308,306};
        int[] a88q1aYs = new int[]{400,403,409,417,430,441,455,472,482,487,488,485,478,463,444,429,418,409,403,400,400};
        g2.fillPolygon(fgrfcXs, a88q1aYs, fgrfcXs.length);

        // Back wheel inner 2
        g2.setColor(wi2);
        int[] a0kp0wXs = new int[]{305,301,298,296,296,296,299,303,307,312,315,318,319,318,315,311,308,305};
        int[] k1ufrYs = new int[]{421,424,430,436,443,451,459,463,466,464,458,451,442,433,426,421,421,421};
        g2.fillPolygon(a0kp0wXs, k1ufrYs, a0kp0wXs.length);

        // Back wheel inner 3
        g2.setColor(wi3);
        int[] ftbo7Xs = new int[]{312,309,308,308,310,312,314,316,316,315,314,312};
        int[] bno1qYs = new int[]{434,437,441,446,451,454,453,448,442,437,434,434};
        g2.fillPolygon(ftbo7Xs, bno1qYs, ftbo7Xs.length);

        // Back wheel inner 4
        g2.setColor(wi4);
        int[] akhwerXs = new int[]{315,313,313,312,313,313,314,315,316,315,315,315};
        int[] ae5tyzYs = new int[]{440,441,442,444,446,447,447,447,445,443,440,440};
        g2.fillPolygon(akhwerXs, ae5tyzYs, akhwerXs.length);

        // Front wheel outer
        g2.setColor(wheelOuter);
        int[] bioxyXs = new int[]{582,562,549,542,539,545,560,605,648,668,644,641,630,615,595,582};
        int[] htxghYs = new int[]{373,382,401,423,453,484,516,521,520,493,493,452,412,388,376,373};
        g2.fillPolygon(bioxyXs, htxghYs, bioxyXs.length);

        // Front wheel inner 1
        g2.setColor(wi1);
        int[] zfdk3Xs = new int[]{579,565,553,548,548,551,563,577,596,609,619,621,614,603,589,579};
        int[] r693wYs = new int[]{389,395,411,429,454,475,497,507,506,494,472,441,414,398,390,389};
        g2.fillPolygon(zfdk3Xs, r693wYs, zfdk3Xs.length);

        // Front wheel inner 2
        g2.setColor(wi2);
        int[] cmx6jXs = new int[]{582,576,569,565,563,562,564,567,572,574,583,591,598,602,604,603,601,596,591,586,582};
        int[] wl43pYs = new int[]{414,416,422,429,441,448,463,470,475,479,482,480,473,464,450,439,429,420,416,414,414};
        g2.fillPolygon(cmx6jXs, wl43pYs, cmx6jXs.length);

        // Front wheel inner 3
        g2.setColor(wi3);
        int[] a3kcqtXs = new int[]{584,579,580,585,591,596,597,593,589,584};
        int[] bntjaYs = new int[]{436,444,454,459,460,454,444,436,435,436};
        g2.fillPolygon(a3kcqtXs, bntjaYs, a3kcqtXs.length);

        // Front wheel inner 4
        g2.setColor(wi4);
        int[] zhpc3Xs = new int[]{586,583,584,588,591,591,586};
        int[] a3wyrcYs = new int[]{443,446,451,452,448,445,443};
        g2.fillPolygon(zhpc3Xs, a3wyrcYs, zhpc3Xs.length);

        // Front left wheel outer
        g2.setColor(wheelOuter);
        int[] ygcl2Xs = new int[]{874,858,836,818,807,874};
        int[] eh4v4Ys = new int[]{482,495,498,496,490,482};
        g2.fillPolygon(ygcl2Xs, eh4v4Ys, ygcl2Xs.length);

        // Front window
        g2.setColor(window);
        int[] piq2vXs = new int[]{465,500,542,566,752,661,601,550,465};
        int[] tsu13Ys = new int[]{294,304,345,350,348,304,291,288,293};
        g2.fillPolygon(piq2vXs, tsu13Ys, piq2vXs.length);

        // Side window
        g2.setColor(window);
        int[] boiskXs = new int[]{523,503,474,436,406,373,449,523};
        int[] i46vbYs = new int[]{354,323,305,306,320,347,356,354};
        g2.fillPolygon(boiskXs, i46vbYs, boiskXs.length);

        // Left headlight
        g2.setColor(headlights1);
        int[] a6hrubXs = new int[]{643,660,772,730,674,643};
        int[] w18flYs = new int[]{380,404,410,394,383,380};
        g2.fillPolygon(a6hrubXs, w18flYs, a6hrubXs.length);

        // Left headlight inner
        g2.setColor(headlights2);
        int[] py0dhXs = new int[]{670,686,701,762,730,674,670};
        int[] yjmvgYs = new int[]{384,398,401,407,394,383,384};
        g2.fillPolygon(py0dhXs, yjmvgYs, py0dhXs.length);

        // Right headlight
        g2.setColor(headlights1);
        int[] pi7k6Xs = new int[]{890,889,896,903,890};
        int[] ausnyYs = new int[]{401,392,379,393,401};
        g2.fillPolygon(pi7k6Xs, ausnyYs, pi7k6Xs.length);

        // Right headlight inner
        g2.setColor(headlights2);
        int[] all4reXs = new int[]{891,890,895,900,891};
        int[] ag6b1mYs = new int[]{398,392,380,391,398};
        g2.fillPolygon(all4reXs, ag6b1mYs, all4reXs.length);

        // Fender
        g2.setColor(fender);
        int[] w9f2xXs = new int[]{760,786,899,910,901,818,760};
        int[] a9rtu6Ys = new int[]{491,460,450,473,479,489,491};
        g2.fillPolygon(w9f2xXs, a9rtu6Ys, w9f2xXs.length);

        // Tesla
        g2.setColor(teslaLogo);
        int[] a6sd2Xs = new int[]{833,818,826,835,829,834,833};
        int[] g3w9jYs = new int[]{392,394,395,400,394,393,392};
        g2.fillPolygon(a6sd2Xs, g3w9jYs, a6sd2Xs.length);
    }
}
