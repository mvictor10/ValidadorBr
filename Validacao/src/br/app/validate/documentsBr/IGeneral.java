/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.app.validate.documentsBr;

/**
 *
 * @author mvictor
 */
public interface IGeneral {
    //verifica se a expressão é compatível com o valor digitado no campo.
    public abstract boolean isValid(String Campo, String Expressao);
    //verifica se o campo é compatível com a mascara.
    public abstract boolean isEmpty(String Campo, String Mascara);
}