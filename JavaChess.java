package javachess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaChess implements MouseListener {

    JFrame j = new JFrame();
    JPanel p = new JPanel();
    Graphics g = null;

    Point2D rookBlack, knightBlack, bishopBlack, queenBlack, kingBlack, bishopBlack2, knightBlack2, rookBlack2;
    Point2D rookWhite, knightWhite, bishopWhite, queenWhite, kingWhite, bishopWhite2, knightWhite2, rookWhite2;
    Point2D pawnWhite, pawnWhite2, pawnWhite3, pawnWhite4, pawnWhite5, pawnWhite6, pawnWhite7, pawnWhite8;
    Point2D pawnBlack, pawnBlack2, pawnBlack3, pawnBlack4, pawnBlack5, pawnBlack6, pawnBlack7, pawnBlack8;
    
    int xx = -10, yy = -10;
    
    int X = -10, Y = -10;
    
    int press = 0;
    
    int selectedX = -10, selectedY = -10;

    public JavaChess() {
        setGUI();
        
        initBoard();
        
        paintBoard();
        
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    refresh();
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e) {}
                }
            }
        });
        thread.start();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

        if(press == 0) {

            X = (int)((double)e.getX()/(double)100);
            Y = (int)((double)e.getY()/(double)100);
            
            selectedX = X;
            selectedY = Y;
            
            press = 1;
            refresh();
        } else if(press == 1) {
            
            selectedX = -10;
            selectedY = -10;

            xx = (int)((double)e.getX()/(double)100);
            yy = (int)((double)e.getY()/(double)100);

            if(rookWhite.getX() == xx && rookWhite.getY() == yy) {
                rookWhite.setLocation(-1000, yy);
            }
            if(rookWhite2.getX() == xx && rookWhite2.getY() == yy) {
                rookWhite2.setLocation(-1000, yy);
            }
            if(bishopWhite.getX() == xx && bishopWhite.getY() == yy) {
                bishopWhite.setLocation(-1000, yy);
            }
            if(bishopWhite2.getX() == xx && bishopWhite2.getY() == yy) {
                bishopWhite2.setLocation(-1000, yy);
            }
            if(knightWhite.getX() == xx && knightWhite.getY() == yy) {
                knightWhite.setLocation(-1000, yy);
            }
            if(knightWhite2.getX() == xx && knightWhite2.getY() == yy) {
                knightWhite2.setLocation(-1000, yy);
            }
            if(pawnWhite.getX() == xx && pawnWhite.getY() == yy) {
                pawnWhite.setLocation(-1000, yy);
            }
            if(pawnWhite2.getX() == xx && pawnWhite2.getY() == yy) {
                pawnWhite2.setLocation(-1000, yy);
            }
            if(pawnWhite3.getX() == xx && pawnWhite3.getY() == yy) {
                pawnWhite3.setLocation(-1000, yy);
            }
            if(pawnWhite4.getX() == xx && pawnWhite4.getY() == yy) {
                pawnWhite4.setLocation(-1000, yy);
            }
            if(pawnWhite5.getX() == xx && pawnWhite5.getY() == yy) {
                pawnWhite5.setLocation(-1000, yy);
            }
            if(pawnWhite6.getX() == xx && pawnWhite6.getY() == yy) {
                pawnWhite6.setLocation(-1000, yy);
            }
            if(pawnWhite7.getX() == xx && pawnWhite7.getY() == yy) {
                pawnWhite7.setLocation(-1000, yy);
            }
            if(pawnWhite8.getX() == xx && pawnWhite8.getY() == yy) {
                pawnWhite8.setLocation(-1000, yy);
            }
            if(rookBlack.getX() == xx && rookBlack.getY() == yy) {
                rookBlack.setLocation(-1000, yy);
            }
            if(rookBlack2.getX() == xx && rookBlack2.getY() == yy) {
                rookBlack2.setLocation(-1000, yy);
            }
            if(bishopBlack.getX() == xx && bishopBlack.getY() == yy) {
                bishopBlack.setLocation(-1000, yy);
            }
            if(bishopBlack2.getX() == xx && bishopBlack2.getY() == yy) {
                bishopBlack2.setLocation(-1000, yy);
            }
            if(knightBlack.getX() == xx && knightBlack.getY() == yy) {
                knightBlack.setLocation(-1000, yy);
            }
            if(knightBlack2.getX() == xx && knightBlack2.getY() == yy) {
                knightBlack2.setLocation(-1000, yy);
            }
            if(pawnBlack.getX() == xx && pawnBlack.getY() == yy) {
                pawnBlack.setLocation(-1000, yy);
            }
            if(pawnBlack2.getX() == xx && pawnBlack2.getY() == yy) {
                pawnBlack2.setLocation(-1000, yy);
            }
            if(pawnBlack3.getX() == xx && pawnBlack3.getY() == yy) {
                pawnBlack3.setLocation(-1000, yy);
            }
            if(pawnBlack4.getX() == xx && pawnBlack4.getY() == yy) {
                pawnBlack4.setLocation(-1000, yy);
            }
            if(pawnBlack5.getX() == xx && pawnBlack5.getY() == yy) {
                pawnBlack5.setLocation(-1000, yy);
            }
            if(pawnBlack6.getX() == xx && pawnBlack6.getY() == yy) {
                pawnBlack6.setLocation(-1000, yy);
            }
            if(pawnBlack7.getX() == xx && pawnBlack7.getY() == yy) {
                pawnBlack7.setLocation(-1000, yy);
            }
            if(pawnBlack8.getX() == xx && pawnBlack8.getY() == yy) {
                pawnBlack8.setLocation(-1000, yy);
            }
            if(kingBlack.getX() == xx && kingBlack.getY() == yy) {
                kingBlack.setLocation(-1000, yy);
            }
            if(kingWhite.getX() == xx && kingWhite.getY() == yy) {
                kingWhite.setLocation(-1000, yy);
            }
            if(queenBlack.getX() == xx && queenBlack.getY() == yy) {
                queenBlack.setLocation(-1000, yy);
            }
            if(queenWhite.getX() == xx && queenWhite.getY() == yy) {
                queenWhite.setLocation(-1000, yy);
            }

            if(rookWhite.getX() == X && rookWhite.getY() == Y) {
                rookWhite.setLocation(xx, yy);
            }
            if(rookWhite2.getX() == X && rookWhite2.getY() == Y) {
                rookWhite2.setLocation(xx, yy);
            }
            if(bishopWhite.getX() == X && bishopWhite.getY() == Y) {
                bishopWhite.setLocation(xx, yy);
            }
            if(bishopWhite2.getX() == X && bishopWhite2.getY() == Y) {
                bishopWhite2.setLocation(xx, yy);
            }
            if(knightWhite.getX() == X && knightWhite.getY() == Y) {
                knightWhite.setLocation(xx, yy);
            }
            if(knightWhite2.getX() == X && knightWhite2.getY() == Y) {
                knightWhite2.setLocation(xx, yy);
            }
            if(pawnWhite.getX() == X && pawnWhite.getY() == Y) {
                pawnWhite.setLocation(xx, yy);
            }
            if(pawnWhite2.getX() == X && pawnWhite2.getY() == Y) {
                pawnWhite2.setLocation(xx, yy);
            }
            if(pawnWhite3.getX() == X && pawnWhite3.getY() == Y) {
                pawnWhite3.setLocation(xx, yy);
            }
            if(pawnWhite4.getX() == X && pawnWhite4.getY() == Y) {
                pawnWhite4.setLocation(xx, yy);
            }
            if(pawnWhite5.getX() == X && pawnWhite5.getY() == Y) {
                pawnWhite5.setLocation(xx, yy);
            }
            if(pawnWhite6.getX() == X && pawnWhite6.getY() == Y) {
                pawnWhite6.setLocation(xx, yy);
            }
            if(pawnWhite7.getX() == X && pawnWhite7.getY() == Y) {
                pawnWhite7.setLocation(xx, yy);
            }
            if(pawnWhite8.getX() == X && pawnWhite8.getY() == Y) {
                pawnWhite8.setLocation(xx, yy);
            }
            if(rookBlack.getX() == X && rookBlack.getY() == Y) {
                rookBlack.setLocation(xx, yy);
            }
            if(rookBlack2.getX() == X && rookBlack2.getY() == Y) {
                rookBlack2.setLocation(xx, yy);
            }
            if(bishopBlack.getX() == X && bishopBlack.getY() == Y) {
                bishopBlack.setLocation(xx, yy);
            }
            if(bishopBlack2.getX() == X && bishopBlack2.getY() == Y) {
                bishopBlack2.setLocation(xx, yy);
            }
            if(knightBlack.getX() == X && knightBlack.getY() == Y) {
                knightBlack.setLocation(xx, yy);
            }
            if(knightBlack2.getX() == X && knightBlack2.getY() == Y) {
                knightBlack2.setLocation(xx, yy);
            }
            if(pawnBlack.getX() == X && pawnBlack.getY() == Y) {
                pawnBlack.setLocation(xx, yy);
            }
            if(pawnBlack2.getX() == X && pawnBlack2.getY() == Y) {
                pawnBlack2.setLocation(xx, yy);
            }
            if(pawnBlack3.getX() == X && pawnBlack3.getY() == Y) {
                pawnBlack3.setLocation(xx, yy);
            }
            if(pawnBlack4.getX() == X && pawnBlack4.getY() == Y) {
                pawnBlack4.setLocation(xx, yy);
            }
            if(pawnBlack5.getX() == X && pawnBlack5.getY() == Y) {
                pawnBlack5.setLocation(xx, yy);
            }
            if(pawnBlack6.getX() == X && pawnBlack6.getY() == Y) {
                pawnBlack6.setLocation(xx, yy);
            }
            if(pawnBlack7.getX() == X && pawnBlack7.getY() == Y) {
                pawnBlack7.setLocation(xx, yy);
            }
            if(pawnBlack8.getX() == X && pawnBlack8.getY() == Y) {
                pawnBlack8.setLocation(xx, yy);
            }
            if(kingBlack.getX() == X && kingBlack.getY() == Y) {
                kingBlack.setLocation(xx, yy);
            }
            if(kingWhite.getX() == X && kingWhite.getY() == Y) {
                kingWhite.setLocation(xx, yy);
            }
            if(queenBlack.getX() == X && queenBlack.getY() == Y) {
                queenBlack.setLocation(xx, yy);
            }
            if(queenWhite.getX() == X && queenWhite.getY() == Y) {
                queenWhite.setLocation(xx, yy);
            }
            press = 0;
            refresh();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
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
            Image i = ImageIO.read(getClass().getResourceAsStream("queenBlack.png"));
            g.drawImage(i, (int) queenBlack.getX()*100+15, (int) queenBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("kingBlack.png"));
            g.drawImage(i, (int) kingBlack.getX()*100+15, (int) kingBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("knightBlack.png"));
            g.drawImage(i, (int) knightBlack.getX()*100+15, (int) knightBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("bishopBlack.png"));
            g.drawImage(i, (int) bishopBlack.getX()*100+15, (int) bishopBlack.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("knightBlack.png"));
            g.drawImage(i, (int) knightBlack2.getX()*100+15, (int) knightBlack2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("bishopBlack.png"));
            g.drawImage(i, (int) bishopBlack2.getX()*100+15, (int) bishopBlack2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("knightWhite.png"));
            g.drawImage(i, (int) knightWhite.getX()*100+15, (int) knightWhite.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("bishopWhite.png"));
            g.drawImage(i, (int) bishopWhite.getX()*100+15, (int) bishopWhite.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("knightWhite.png"));
            g.drawImage(i, (int) knightWhite2.getX()*100+15, (int) knightWhite2.getY()*100+15, 70, 70, null);
        } catch(Exception e) {}
        try {
            Image i = ImageIO.read(getClass().getResourceAsStream("bishopWhite.png"));
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
        pp.setBounds(800,0,200,900);
        JButton c = new JButton("DESELECT");
        c.setBounds(0,10,160,35);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                xx = X = selectedX = -10;
                yy = Y = selectedY = -10;
                
                press = 0;
                
                refresh();
                
            }
        });
        JButton b = new JButton("New");
        b.setBounds(0,10,40,35);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xx = X = selectedX = -10;
                yy = Y = selectedY = -10;
                press = 0;
                
                initBoard();

                refresh();
                
            }
        });
        pp.add(b);
        pp.add(c);
        j.add(pp);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setGraphics();
        j.addMouseListener(this);
    }
    
    void setGraphics() {
        g = p.getGraphics();
    }
    
    public static void main(String[] args) {
        new JavaChess();
    }
}