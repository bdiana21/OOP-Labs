/** DragBallPanel.java - Panel that allows dragging a ball around.
    @author Fred Swartz
    @version 2004-04-15
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/////////////////////////////////////////////////////////// class DragBallPanel
/** When the mousePressed listener is called to position is tested
    to see if it's in the area of the ball.  If it is, 
    (1) _canDrag is set true meaning pay attention to the MouseDragged events.  
    (2) Record where in the ball (relative to the upper left coordinates) 
        the mouse was clicked, because it looks best if we drag from there.
*/
public class DragBallPanel extends JPanel implements MouseListener, MouseMotionListener {

    private static final int BALL_DIAMETER = 40; // Diameter of ball
    //--- instance variables
    /** Ball coords.  Changed by mouse listeners.  Used by paintComponent. */
    private int _ballX     = 50;   // x coord - set from drag
    private int _ballY     = 50;   // y coord - set from drag
    private Color _ballColor = Color.BLUE;
    /** Position in ball of mouse press to make dragging look better. */
    private int _dragFromX = 0;    // pressed this far inside ball's
    private int _dragFromY = 0;    // bounding box.
    
    /** true means mouse was pressed in ball and still in panel.*/
    private boolean _canDrag  = false;

    private boolean _autoMoveEnabled = false;
    private int _autoMoveDirectionX = 1;
    private int _autoMoveDirectionY = 1;
    
    //============================================================= constructor
    /** Constructor sets size, colors, and adds mouse listeners.*/
    public DragBallPanel() {
        setPreferredSize(new Dimension(300, 300));
        setBackground(Color.blue);
        setForeground(Color.yellow);
        //--- Add the mouse listeners.
        this.addMouseListener(this); 
        this.addMouseMotionListener(this);
    }//endconstructor
    
    //=================================================== method paintComponent
    /** Ball is drawn at the last recorded mouse listener coordinates. */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(_ballColor);
        g.fillOval(_ballX, _ballY, BALL_DIAMETER, BALL_DIAMETER);
        String coordinates = "Coordonatele : (" + _ballX + ", " + _ballY + ")";
        g.setColor(Color.CYAN);
        g.drawString(coordinates, 10, 20);
    }//end paintComponent
    
    //===================================================== method mousePressed
    /** Set _canDrag if the click is in the ball (or in the bounding
        box, which is lazy, but close enuf for this program).
        Remember displacement (dragFromX and Y) in the ball
        to use as relative point to display while dragging.
    */

    private boolean isPointInsideBall(int x, int y) {
        int centerX = _ballX + BALL_DIAMETER / 2;
        int centerY = _ballY + BALL_DIAMETER / 2;

        double distance = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));

        return distance <= BALL_DIAMETER / 2;
    }
    private void generateRandomDirection() {
        // Generare direcție aleatoare
        _autoMoveDirectionX = Math.random() > 0.5 ? 1 : -1;
        _autoMoveDirectionY = Math.random() > 0.5 ? 1 : -1;
    }

    public void mousePressed(MouseEvent e) {
        int x = e.getX();   // Save the x coord of the click
        int y = e.getY();   // Save the y coord of the click

        if (isPointInsideBall(x, y)) {
            _canDrag = true;
            _dragFromX = x - _ballX;
            _dragFromY = y - _ballY;
        } else {
            _canDrag = false;
        }

        if (SwingUtilities.isRightMouseButton(e)) {
            generateRandomColor();
            repaint();
        }


        if (SwingUtilities.isLeftMouseButton(e)) {
            _autoMoveEnabled = !_autoMoveEnabled;

            if (_autoMoveEnabled) {
                generateRandomDirection();
                startAutoMove();
            }
        }
    }//end mousePressed

    private void moveAuto() {
        // Mișcare automată

        _ballX += _autoMoveDirectionX;
        _ballY += _autoMoveDirectionY;

        if (_ballX <= 0 || _ballX >= getWidth() - BALL_DIAMETER) {
            _autoMoveDirectionX *= -1;
        }

        if (_ballY <= 0 || _ballY >= getHeight() - BALL_DIAMETER) {
            _autoMoveDirectionY *= -1;
        }

        repaint();
    }

    private void startAutoMove() {
        Thread autoMoveThread = new Thread(() -> {
            while (_autoMoveEnabled) {
                moveAuto();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        autoMoveThread.start();
    }

    private void generateRandomColor() {
        // Generează o culoare aleatorie
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        _ballColor = new Color(red, green, blue);
        repaint();
    }
    
    //============================================================ mouseDragged
    /** Set x,y  to mouse position and repaint. */
    public void mouseDragged(MouseEvent e) {
        if (_canDrag) {   // True only if button was pressed inside ball.
            //--- Ball pos from mouse and original click displacement
            _ballX = e.getX() - _dragFromX;
            _ballY = e.getY() - _dragFromY;
            
            //--- Don't move the ball off the screen sides
            _ballX = Math.max(_ballX, 0);
            _ballX = Math.min(_ballX, getWidth() - BALL_DIAMETER);
            
            //--- Don't move the ball off top or bottom
            _ballY = Math.max(_ballY, 0);
            _ballY = Math.min(_ballY, getHeight() - BALL_DIAMETER);
            
            this.repaint(); // Repaint because position changed.
        }
    }//end mouseDragged

    //====================================================== method mouseExited
    /** Turn off dragging if mouse exits panel. */
    public void mouseExited(MouseEvent e) {
        if (_canDrag) {
            _ballX = Math.max(Math.min(e.getX(), getWidth() - BALL_DIAMETER), 0);
            _ballY = Math.max(Math.min(e.getY(), getHeight() - BALL_DIAMETER), 0);

            this.repaint();
        }
    }//end mouseExited

    //=============================================== Ignore other mouse events.
    public void mouseMoved   (MouseEvent e) {}  // ignore these events
    public void mouseEntered (MouseEvent e) {}  // ignore these events
    public void mouseClicked (MouseEvent e) {}  // ignore these events
    public void mouseReleased(MouseEvent e) {}  // ignore these events
}//endclass DragBallPanel
