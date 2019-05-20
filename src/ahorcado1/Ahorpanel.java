package ahorcado1;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;

public class Ahorpanel extends JFrame implements ActionListener {
    
    private JPanel ima;
    private JLabel intrest, palabra, play, menu;
    private JButton rein,terminar, jugador, a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,r,s,t,u,v,w,x,y,z,o,p,q;
    private JTextField gui;
    private JTextArea ar;
    
    public Ahorpanel(){
        setLayout(null);
         
       
        
             
        ima= new JPanel();
        ima.setBounds(500,20,200,400);
        add(ima);;
               
        palabra=new JLabel("palabra");
        palabra.setBounds(20,200,100,50);
        add(palabra);
               
        jugador=new JButton("Jugador");
        jugador.setBounds(0,20,200,50);
        add(jugador);
        jugador.addActionListener(this);
        
        rein =new JButton("Reiniciar juego");
        rein.setBounds(0,70,200,50);
        add(rein);
         
        terminar=new JButton("Terminar juego");
        terminar.setBounds(0,120,200,50);
        add(terminar);
        
         
        intrest= new JLabel("intentos restantes: ");
        intrest.setBounds(20,250,100,50);
        add(intrest);
        
        gui=new JTextField("_ _ _ _ _");
        gui.setBounds(20,250,200,50);
        gui.setEditable(false);
        add(gui);
                
        a=new JButton("A");
        a.setBounds(20,430,50,50);
        add(a);
        
        b=new JButton("B");
        b.setBounds(70,430,50,50);
        add(b);
        
        c=new JButton("C");
        c.setBounds(120,430,50,50);
        add(c);
        d=new JButton("D");
        d.setBounds(170,430,50,50);
        add(d);
        e=new JButton("E");
        e.setBounds(220,430,50,50);
        add(e);
        f=new JButton("F");
        f.setBounds(270,430,50,50);
        add(f);
        g=new JButton("G");
        g.setBounds(320,430,50,50);
        add(g);
        h=new JButton("H");
        h.setBounds(370,430,50,50);
        add(h);
        i=new JButton("I");
        i.setBounds(420,430,50,50);
        add(i);
        j=new JButton("J");
        j.setBounds(470,430,50,50);
        add(j);
        k=new JButton("K");
        k.setBounds(520,430,50,50);
        add(k);
        l=new JButton("L");
        l.setBounds(570,430,50,50);
        add(l);
        m=new JButton("M");
        m.setBounds(620,430,50,50);
        add(m);
        n=new JButton("N");
        n.setBounds(670,430,50,50);
        add(n);
        ñ=new JButton("Ñ");
        ñ.setBounds(20,480,50,50);
        add(ñ);
        o=new JButton("O");
        o.setBounds(70,480,50,50);
        add(o);
        p=new JButton("P");
        p.setBounds(120,480,50,50);
        add(p);
        q=new JButton("Q");
        q.setBounds(170,480,50,50);
        add(q);
        r=new JButton("R");
        r.setBounds(220,480,50,50);
        add(r);
        s=new JButton("S");
        s.setBounds(270,480,50,50);
        add(s);
        t=new JButton("T");
        t.setBounds(320,480,50,50);
        add(t);
        u=new JButton("U");
        u.setBounds(370,480,50,50);
        add(u);
        v=new JButton("V");
        v.setBounds(420,480,50,50);
        add(v);
        w=new JButton("W");
        w.setBounds(470,480,50,50);
        add(w);
        x=new JButton("X");
        x.setBounds(520,480,50,50);
        add(x);
        y=new JButton("Y");
        y.setBounds(570,480,50,50);
        add(y);
        z=new JButton("Z");
        z.setBounds(620,480,50,50);
        add(z);
        
       
        
        
        
       
       }

    @Override
    public void actionPerformed(ActionEvent e) {
        
         if (e.getSource() == jugador){
             String a;
             a=JOptionPane.showInputDialog(null, "inserte su usuario");
                             
         
         }
    }
    
    
}
