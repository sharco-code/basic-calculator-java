/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author god
 */
public class Calculadora {
    double n1, n2;
    int type; // 1 sum / 2 res / 3 mult / 4 div
    
    Calculadora(){
        n1=n2=0;
    }

    public double getN1() {
        return n1;
    }

    public double getN2() {
        return n2;
    }
    
    public String setN1(double n1, int type) {
        this.n1 = n1;
        this.type =  type;
        if(type==1) {
            if(n1%1==0) {
                return String.format("%.0f + ", n1);
            } else {
                return (n1+" + ");
            }
        }
        else if (type==2) {
            if(n1%1==0) {
                return String.format("%.0f - ", n1);
            } else {
                return (n1+" - ");
            }
        }
        else if (type==3) {
            if(n1%1==0) {
                return String.format("%.0f × ", n1);
            } else {
                return (n1+" × ");
            }
        }
        else if (type==4) {
            
            if(n1%1==0) {
                return String.format("%.0f ÷ ", n1);
            } else {
                return (n1+" ÷ ");
            }
        }
        return "";
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    public String operacion() {
        if(type==1) {
            if((n1+n2)%1==0) {
                return String.format("%.0f", (n1+n2));
            } else {
                return (""+(n1+n2));
            }
            
        }
        else if (type==2) {
            if((n1-n2)%1==0) {
                return String.format("%.0f", (n1-n2));
            } else {
                return (""+(n1-n2));
            }
        }
        else if (type==3) {
            if((n1*n2)%1==0) {
                return String.format("%.0f", (n1*n2));
            } else {
                return (""+(n1*n2));
            }
        }
        else if (type==4) {
            if((n1/n2)%1==0) {
                return String.format("%.0f", (n1/n2));
            } else {
                return (""+(n1/n2));
            }
        }
        return "";
    }
    public void clean() {
        n1=n2=type=0;
    }
}
