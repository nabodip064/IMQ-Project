import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class Main
{
    /** 		Agent who knows winning strategy          **/
    public static int negMod(int x, int m) {
        return ( ( x % m ) + m ) % m;
    }


    public static final int M = 13;
    public static int RNG = 10;
    public static int[] Nim = new int[M];

    public static boolean allZero() {
        for(int i = 0; i < RNG; i ++) if( Nim[i] != 0 ) return false;
        return true;
    }

    public static int allXOR() {
        int x = 0;
        for(int i = 0; i < RNG; i ++ ) x ^= Nim[i];
        return x;
    }

    private boolean[][] visited = new boolean[M][M];

    private void makeTable()
    {
        for(int i = 0; i < RNG ; i ++ ) {
            Random rand = new Random();
            Nim[i] = negMod( rand.nextInt(), RNG ) + 1;
            System.out.printf("%d ",Nim[i]);
        }
        System.out.println();

        for(int j = 0; j < RNG; j ++ ) {

            int i = RNG-1, sz = Nim[j];
            for( ; sz>0 ; i--) {
                visited[i][j] = false;
                sz--;
            }
            System.out.printf( "%d ", i );
            while( i >= 0  ) visited[i--][j] = true;
        }
        System.out.println();
    }

    private JFrame frame  = new JFrame("Classical Nim");
    private JPanel p  = new JPanel();
    private JLabel l = new JLabel("Reduce any pile height");
    private JButton[][] b = new JButton[10][10];

    class MyActionListener implements ActionListener {
        int i , pile;
        MyActionListener(int x, int y) {
            i=x; pile=y;
        }
        public void actionPerformed(ActionEvent AE) {

            System.out.printf("Player Clicked ( %d %d )\n", i , pile );

            if( visited[ i ][ pile ] ) return;
            for(int x = i; x >= 0; x --) {

                System.out.println( visited[ i ][ pile ] );

                if( !visited[ x ][ pile ] ) {
                    Nim[ pile ] --;
                    visited[ x ][ pile ] = true;
                    b[ x ][ pile ].setBackground( Color.WHITE );
                }
            }

            if( allZero() ) {
                JOptionPane.showMessageDialog(frame,"You Win...!!!   :D");
                l.setText("You Win...!!!   :D");
                return;
            }

            /// ----------- Agent's Move ------------
            int index = 0, value = 1;
            if( allXOR() == 0 ) {
                for(int i = 0; i < RNG; i ++) if( Nim[i]!=0 ) index = i;
                Nim[index] --;
            }
            else {
                for(int p = 0; p < RNG; p ++) {
                    for(int v = 0; v < RNG ; v++) {
                        if( Nim[p] > v ) {
                            int prev = Nim[p];
                            Nim[p] = v;
                            if( allXOR()==0 ) {
                                index = p;
                                value = v;
                            }
                            Nim[p] = prev;
                        }
                    }
                }
                Nim[ index ] = value;
            }
            System.out.printf("Agent Clicked ( %d %d )", Nim[index], index );
            for(int x = RNG-1, loop = 1; x >= 0; x --, loop++) {
                if( loop > Nim[index] ) {
                    visited[x][index] = true;
                    b[x][index].setBackground(Color.WHITE);
                }
            }
            /// ---------------- Done --------------

            if( allZero() ) {
                JOptionPane.showMessageDialog(frame,"You Loose...!!!   :(");
                l.setText("You Loose...!!!   :(");
            }
        }
    }

    private void prepareGUI() {

        frame.setLayout(null);
        frame.setSize(616,690);

        p.setLayout(null);
        p.add(l);
        l.setBounds(225,50,500,50);

        frame.add(p);
        p.setBounds(0,0,700,700);
        p.setBackground(Color.PINK);

        for(int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j ++) {
                b[i][j] = new JButton();
                p.add( b[i][j] );
                b[i][j].setBounds((j * 50) + 50, (i * 50) + 100, 50, 50);
                b[i][j].setBackground(Color.DARK_GRAY);
                b[i][j].addActionListener(new MyActionListener(i, j));
            }
        }
        for(int i = 0; i < 10; i ++) {
            for(int j = 0; j < 10; j ++) {
                if( visited[i][j] ) b[i][j].setBackground(Color.WHITE);
            }
        }
        frame.setVisible(true);
    }

    public Main() {
        makeTable();
        prepareGUI();
    }

    public static void main (String[] ARGS) {
        Main ShockProof = new Main();
    }
}