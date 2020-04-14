package javachess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.geom.Point2D;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaChess {

    JFrame j = new JFrame();
    JPanel p = new JPanel();
    Graphics g = null;

    Point2D rookBlack, knightBlack, bishopBlack, queenBlack, kingBlack, bishopBlack2, knightBlack2, rookBlack2;
    Point2D rookWhite, knightWhite, bishopWhite, queenWhite, kingWhite, bishopWhite2, knightWhite2, rookWhite2;

    public JavaChess() {
        setGUI();
        
        initBoard();
        
        paintBoard();
        
        refresh();
    }
    
    void initBoard() {
        rookBlack = new Point2D() {
            int x, y;
            @Override
            public double getX() {
                return (double) this.x;
            }

            @Override
            public double getY() {
                return (double) this.y;
            }

            @Override
            public void setLocation(double x, double y) {
                this.x = (int) x;
                this.y = (int) y;
            }
        };
        rookBlack.setLocation(0, 0);
        rookBlack2 = new Point2D() {
            int x, y;
            @Override
            public double getX() {
                return (double) this.x;
            }

            @Override
            public double getY() {
                return (double) this.y;
            }

            @Override
            public void setLocation(double x, double y) {
                this.x = (int) x;
                this.y = (int) y;
            }
        };
        rookBlack2.setLocation(7, 0);
        rookWhite = new Point2D() {
            int x, y;
            @Override
            public double getX() {
                return (double) this.x;
            }

            @Override
            public double getY() {
                return (double) this.y;
            }

            @Override
            public void setLocation(double x, double y) {
                this.x = (int) x;
                this.y = (int) y;
            }
        };
        rookWhite.setLocation(0, 7);
        rookWhite2 = new Point2D() {
            int x, y;
            @Override
            public double getX() {
                return (double) this.x;
            }

            @Override
            public double getY() {
                return (double) this.y;
            }

            @Override
            public void setLocation(double x, double y) {
                this.x = (int) x;
                this.y = (int) y;
            }
        };
        rookWhite2.setLocation(7, 7);
    }
    
    void refresh() {
        paintBoard();
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("rookBlack.png"));
            g.drawImage(i, (int) rookBlack.getX()*100+15, (int) rookBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("rookBlack.png"));
            g.drawImage(i, (int) rookBlack2.getX()*100+15, (int) rookBlack2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("rookWhite.png"));
            g.drawImage(i, (int) rookWhite.getX()*100+15, (int) rookWhite.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("rookWhite.png"));
            g.drawImage(i, (int) rookWhite2.getX()*100+15, (int) rookWhite2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
    }
    
    void paintBoard() {
        Thread t = new Thread() {
            public void run() {
                g.setColor(Color.WHITE);
                for(int j=0; j<8; j++)
                for(int i=0; i<8; i++) {
                    if(j == 0 ||
                            j == 2 ||
                            j == 4 ||
                            j == 6)
                    if(i == 0 ||
                            i == 2 ||
                            i == 4 ||
                            i == 6)
                        g.fillRect(i*100,j*100,100,100);
                }
                g.setColor(Color.BLACK);
                for(int j=0; j<8; j++)
                for(int i=0; i<8; i++) {
                    if(j == 0 ||
                            j == 2 ||
                            j == 4 ||
                            j == 6)
                    if(i == 1 ||
                            i == 3 ||
                            i == 5 ||
                            i == 7)
                        g.fillRect(i*100,j*100,100,100);
                }

                g.setColor(Color.WHITE);
                for(int j=0; j<8; j++)
                for(int i=0; i<8; i++) {
                    if(j == 1 ||
                            j == 3 ||
                            j == 5 ||
                            j == 7)
                    if(i == 1 ||
                            i == 3 ||
                            i == 5 ||
                            i == 7)
                        g.fillRect(i*100,j*100,100,100);
                }
                g.setColor(Color.BLACK);
                for(int j=0; j<8; j++)
                for(int i=0; i<8; i++) {
                    if(j == 1 ||
                            j == 3 ||
                            j == 5 ||
                            j == 7)
                    if(i == 0 ||
                            i == 2 ||
                            i == 4 ||
                            i == 6)
                        g.fillRect(i*100,j*100,100,100);
                }
            }
        };
        t.start();
    }
    
    void setGUI() {
        j.setLayout(null);
        j.setBounds(0,0,1000,900);
        p.setBounds(0,0,800,800);
        j.add(p);
        JPanel pp = new JPanel();
        pp.setBounds(200,0,200,900);
        j.add(pp);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setGraphics();
    }
    
    void setGraphics() {
        g = p.getGraphics();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new JavaChess();
    }
    
}
