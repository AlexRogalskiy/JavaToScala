import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        java.util.List<Point2D.Double> polgonPoints = new ArrayList<>();
        double n = in.nextDouble();

        for (int i = 0; i < n; i++) {
            polgonPoints.add(new Point2D.Double(in.nextDouble(), in.nextDouble()));
        }

        Point2D.Double ourPoint = new Point2D.Double(in.nextDouble(), in.nextDouble());

        out.print(polygonContains(polgonPoints, ourPoint));

        out.flush();
    }

    private static String polygonContains(java.util.List<Point2D.Double> polgonPoints, Point2D.Double ourPoint) {
        Path2D.Double polygon = new Path2D.Double();
        boolean isFirst = true;
        for (Point2D.Double point : polgonPoints) {
            if (isFirst) {
                polygon.moveTo(point.x, point.y);
                isFirst = false;
            } else {
                polygon.lineTo(point.x, point.y);
            }
        }
        polygon.closePath();

        if (polygon.contains(ourPoint)) {
            return "YES";
        }

        return "NO";
    }
}
