/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author User
 */
public abstract class CalculateFee {

    protected int tarifa;

    protected int approximate(int valor) {
        int residuo = valor % 100;
        if (residuo != 0) {
            valor += 100 - residuo;
        }
        return valor;
    }

    abstract public int CalcularTarifa(int minutos);

}
