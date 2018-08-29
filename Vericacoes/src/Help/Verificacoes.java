package Help;


import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paulo Amosse
 */
public class Verificacoes {

    /**
     * O metodo recebe uma string e ve se ela esta vazia caso sim, true caso
     * nao, false.
     *
     * @param string
     * @return
     */
    public boolean estaVazio(String string) {
        if (string.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * O metodo recebe duas string e ve se elas estao vazias caso sim, true caso
     * nao, false.
     *
     * @param string1
     * @param string2
     * @return
     */
    public boolean estaVazio(String string1, String string2) {
        if (string1.isEmpty() && string2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Este verifica se uma JTextField esta vazia ou nao, caso sim retorna true,
     * caso contrario false
     *
     * @param txt
     * @return
     */
    public boolean estaVazio(JTextField txt) {
        if (txt.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * O metodo recebe duas JTextFields e ve se elas estao vazias caso sim, true
     * caso nao, false
     *
     * @param txt1
     * @param txt2
     * @return
     */
    public boolean estaVazio(JTextField txt1, JTextField txt2) {
        if (txt1.getText().isEmpty() && txt1.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * O metodo recebe tres JTextFields e ve se elas estao vazias caso sim, true
     * caso nao, false
     *
     * @param txt1
     * @param txt2
     * @param txt3
     * @return
     */
    public boolean estaVazio(JTextField txt1, JTextField txt2, JTextField txt3) {
        if (txt1.getText().isEmpty() && txt1.getText().isEmpty() && txt3.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * o metodo recebe 4 JTextFields e ve se elas estao vazias, caso sim, true
     * caso nao, false
     *
     * @param txt1
     * @param txt2
     * @param txt3
     * @param txt4
     * @return
     */
    public boolean estaVazio(JTextField txt1, JTextField txt2, JTextField txt3, JTextField txt4) {
        if (txt1.getText().isEmpty() && txt1.getText().isEmpty()
                && txt3.getText().isEmpty() && txt4.getText().isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
