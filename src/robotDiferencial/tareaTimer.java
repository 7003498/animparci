/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package robotDiferencial;

import java.util.TimerTask;

public class tareaTimer extends TimerTask {

    private double omega;
    private double velocidad = 0;
    private double deltaT = 0.1 ;
    private double theta0 = 0.0;
    private double theta;
    private int  xf;
    private int xi = 0;
    private int yf ;
    private int yi = 0;
    
    private double omega2;
    private int numCol; 
    private double velocidad2 = 0;
    private double deltaT2 = 0.1 ;
    private double theta02 = 0.0;
    private double theta2;
    private int  xf2;
    private int xi2 = 0;
    private int yf2 ;
    private int yi2 = 0;
    
    private Dibujo dibujo;
  

    public tareaTimer(Dibujo dibujo) {
        this.dibujo = dibujo;
        
    }
    
    
     @Override
    public void run() {
       
         xf = (int)(velocidad*Math.cos(theta)*deltaT)+xi;
         yf = (int)(velocidad*Math.sin(theta)*deltaT)+yi;
         theta = omega*deltaT+theta0;
         
         theta0=theta;
         xi=xf;
         yi=yf;
         
        dibujo.setPosicionX(xf);
        dibujo.setPosicionY(yf);
        dibujo.setAngulo(theta);
        dibujo.repaint();
        System.out.println("Estados" + "Theta " + theta + " X "+ xf + " Y " + yf);
        //-------------------------------------
        xf2 = (int)(velocidad2*Math.cos(theta2)*deltaT2)+xi2;
        yf2 = (int)(velocidad2*Math.sin(theta2)*deltaT2)+yi2;
        theta2 = omega2*deltaT2+theta02;
         
         theta02=theta2;
         xi2=xf2;
         yi2=yf2;
         
        dibujo.setColor(numCol);
        dibujo.setPosicionX1(xf2);
        dibujo.setPosicionY1(yf2);
        dibujo.setAngulo1(theta2);
        dibujo.repaint();
        System.out.println(numCol);
    }

    public int getColor() {
        return numCol;
    }

    public void setColor(int color) {
        this.numCol = color;
    }

    public double getOmega2() {
        return omega2;
    }

    public void setOmega2(double omega2) {
        this.omega2 = omega2;
    }

    public double getVelocidad2() {
        return velocidad2;
    }

    public void setVelocidad2(double velocidad2) {
        this.velocidad2 = velocidad2;
    }

    public double getDeltaT2() {
        return deltaT2;
    }

    public void setDeltaT2(double deltaT2) {
        this.deltaT2 = deltaT2;
    }

    public double getTheta02() {
        return theta02;
    }

    public void setTheta02(double theta02) {
        this.theta02 = theta02;
    }

    public double getTheta2() {
        return theta2;
    }

    public void setTheta2(double theta2) {
        this.theta2 = theta2;
    }

    public int getXf2() {
        return xf2;
    }

    public void setXf2(int xf2) {
        this.xf2 = xf2;
    }

    public int getXi2() {
        return xi2;
    }

    public void setXi2(int xi2) {
        this.xi2 = xi2;
    }

    public int getYf2() {
        return yf2;
    }

    public void setYf2(int yf2) {
        this.yf2 = yf2;
    }

    public int getYi2() {
        return yi2;
    }

    public void setYi2(int yi2) {
        this.yi2 = yi2;
    }

    public Dibujo getDibujo() {
        return dibujo;
    }

    public void setDibujo(Dibujo dibujo) {
        this.dibujo = dibujo;
    }

    
    
    public double getDeltaT() {
        return deltaT;
    }

    public void setDeltaT(double deltaT) {
        this.deltaT = deltaT;
    }

    public double getTheta0() {
        return theta0;
    }

    public void setTheta0(double theta0) {
        this.theta0 = theta0;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    public int getXf() {
        return xf;
    }

    public void setXf(int xf) {
        this.xf = xf;
    }

    public int getXi() {
        return xi;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public int getYf() {
        return yf;
    }

    public void setYf(int yf) {
        this.yf = yf;
    }

    public int getYi() {
        return yi;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }
    
   

    public double getOmega() {
        return omega;
    }

    public void setOmega(double omega) {
        this.omega = omega;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
   
    
    
    
}
