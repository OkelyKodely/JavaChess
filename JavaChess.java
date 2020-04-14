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
    Point2D pawnWhite, pawnWhite2, pawnWhite3, pawnWhite4, pawnWhite5, pawnWhite6, pawnWhite7, pawnWhite8;
    Point2D pawnBlack, pawnBlack2, pawnBlack3, pawnBlack4, pawnBlack5, pawnBlack6, pawnBlack7, pawnBlack8;
    
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
        pawnBlack = new Point2D() {
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
        pawnBlack.setLocation(0, 1);
        pawnBlack2 = new Point2D() {
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
        pawnBlack2.setLocation(1, 1);
        pawnBlack3 = new Point2D() {
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
        pawnBlack3.setLocation(2, 1);
        pawnBlack4 = new Point2D() {
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
        pawnBlack4.setLocation(3, 1);
        pawnBlack5 = new Point2D() {
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
        pawnBlack5.setLocation(4, 1);
        pawnBlack6 = new Point2D() {
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
        pawnBlack6.setLocation(5, 1);
        pawnBlack7 = new Point2D() {
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
        pawnBlack7.setLocation(6, 1);
        pawnBlack8 = new Point2D() {
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
        pawnBlack8.setLocation(7, 1);
        pawnWhite = new Point2D() {
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
        pawnWhite.setLocation(0, 6);
        pawnWhite2 = new Point2D() {
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
        pawnWhite2.setLocation(1, 6);
        pawnWhite3 = new Point2D() {
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
        pawnWhite3.setLocation(2, 6);
        pawnWhite4 = new Point2D() {
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
        pawnWhite4.setLocation(3, 6);
        pawnWhite5 = new Point2D() {
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
        pawnWhite5.setLocation(4, 6);
        pawnWhite6 = new Point2D() {
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
        pawnWhite6.setLocation(5, 6);
        pawnWhite7 = new Point2D() {
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
        pawnWhite7.setLocation(6, 6);
        pawnWhite8 = new Point2D() {
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
        pawnWhite8.setLocation(7, 6);
        queenWhite = new Point2D() {
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
        queenWhite.setLocation(3, 7);
        kingWhite = new Point2D() {
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
        kingWhite.setLocation(4, 7);
        queenBlack = new Point2D() {
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
        queenBlack.setLocation(3, 0);
        kingBlack = new Point2D() {
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
        kingBlack.setLocation(4, 0);
        knightWhite = new Point2D() {
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
        knightWhite.setLocation(1,7);
        bishopWhite = new Point2D() {
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
        bishopWhite.setLocation(2,7);
        knightWhite2 = new Point2D() {
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
        knightWhite2.setLocation(6,7);
        bishopWhite2 = new Point2D() {
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
        bishopWhite2.setLocation(5,7);
        knightBlack = new Point2D() {
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
        knightBlack.setLocation(1,0);
        bishopBlack = new Point2D() {
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
        bishopBlack.setLocation(2,0);
        knightBlack2 = new Point2D() {
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
        knightBlack2.setLocation(6,0);
        bishopBlack2 = new Point2D() {
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
        bishopBlack2.setLocation(5,0);
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
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) pawnBlack.getX()*100+15, (int) pawnBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) pawnBlack2.getX()*100+15, (int) pawnBlack2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) pawnBlack3.getX()*100+15, (int) pawnBlack3.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) pawnBlack4.getX()*100+15, (int) pawnBlack4.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) pawnBlack5.getX()*100+15, (int) pawnBlack5.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) pawnBlack6.getX()*100+15, (int) pawnBlack6.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) pawnBlack7.getX()*100+15, (int) pawnBlack7.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) pawnBlack8.getX()*100+15, (int) pawnBlack8.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) pawnWhite.getX()*100+15, (int) pawnWhite.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) pawnWhite2.getX()*100+15, (int) pawnWhite2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) pawnWhite3.getX()*100+15, (int) pawnWhite3.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) pawnWhite4.getX()*100+15, (int) pawnWhite4.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) pawnWhite5.getX()*100+15, (int) pawnWhite5.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) pawnWhite6.getX()*100+15, (int) pawnWhite6.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) pawnWhite7.getX()*100+15, (int) pawnWhite7.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) pawnWhite8.getX()*100+15, (int) pawnWhite8.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("queenWhite.png"));
            g.drawImage(i, (int) queenWhite.getX()*100+15, (int) queenWhite.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("kingWhite.png"));
            g.drawImage(i, (int) kingWhite.getX()*100+15, (int) kingWhite.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) queenBlack.getX()*100+15, (int) queenBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) kingBlack.getX()*100+15, (int) kingBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) knightBlack.getX()*100+15, (int) knightBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) bishopBlack.getX()*100+15, (int) bishopBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) knightBlack2.getX()*100+15, (int) knightBlack2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnBlack.png"));
            g.drawImage(i, (int) bishopBlack2.getX()*100+15, (int) bishopBlack2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) knightWhite.getX()*100+15, (int) knightWhite.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) bishopWhite.getX()*100+15, (int) bishopWhite.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) knightWhite2.getX()*100+15, (int) knightWhite2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("pawnWhite.png"));
            g.drawImage(i, (int) bishopWhite2.getX()*100+15, (int) bishopWhite2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
    }
    
    void paintBoard() {
        Thread t = new Thread() {
            public void run() {
                g.setColor(Color.RED);
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

                g.setColor(Color.RED);
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
    
    public static void main(String[] args) {
        new JavaChess();
    }
}