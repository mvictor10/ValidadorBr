/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validate.data;

/**
 *
 * @author mvictor
 */
public interface ICEP {
    public abstract boolean isValidCep(String Campo);
    public abstract boolean isEmpty(String Campo, String mascara);
}