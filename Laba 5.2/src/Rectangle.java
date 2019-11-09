import java.awt.*;

public class Rectangle extends Shape {

    Rectangle() {
        //super();
        for (int i = 0; i < 3; i++) {
            rgb[i] = random.nextInt(255);
        }

        setNumberOfVertices(4);
        x = new int[4];
        y = new int[4];

        int sideX = random.nextInt(70);
        int sideY = random.nextInt(70) ;

        x[0] = random.nextInt(700) ;
        y[0] = random.nextInt(500) ;

        x[1] = x[0] + sideX;
        y[1] = y[0];

        x[2] = x[1];
        y[2] = y[1] + sideY;

        x[3] = x[0];
        y[3] = y[2];

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        g.drawPolygon(x, y, getNumberOfVertices());
        g.fillPolygon(x, y, getNumberOfVertices());
    }

}