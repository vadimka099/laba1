import java.awt.*;

public class Circle extends Shape {
    private int radius;
    Circle() {
        for (int i = 0; i < 3; i++) {
            rgb[i] = random.nextInt(255);
        }


        x = new int[1];
        y = new int[1];


        x[0] = random.nextInt(700);
        y[0] = random.nextInt(500);

        radius = random.nextInt(60) ;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        g.drawOval(x[0], y[0], radius, radius);
        g.fillOval(x[0], y[0], radius, radius);
    }
}