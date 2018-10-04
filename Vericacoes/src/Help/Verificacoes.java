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
      * Esse e um metodo generico que recebe n strings dependendo de quantas deseja verificar se estao vazias ou nao.
      * Em caso de uma delas estiver vazia ele retorna true, ou seja, ele so retorna false se todas estiverem preenchidas.
      * @param strings
      * @return 
      */
    public boolean estaVazio(String ... strings) {
        //Ele percorre cada string do array strings
        for(String s: strings){
            //verifica se a string esta vazia
            if(s.isEmpty())
                return true; //caso uma delas esteja vazia ele retorna false o que indica que no array de strings mandado como parametro uma delas esta vazia
        }
        return false;
    }

    /**
     * Este verifica se uma JTextField esta vazia ou nao, caso sim retorna true,
     * caso contrario false
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
    *Esse e um metodo generico que recebe n JTextFields dependendo de quantas deseja verificar se estao vazias ou nao.
    * Em caso de uma delas estiver vazia ele retorna true, ou seja, ele so retorna false se todas estiverem preenchidas.
     *
     * @param txt
     * @return
     */
    public boolean estaVazio(JTextField ... txt) {
        for(JTextField jtf: txt){
            if(jtf.getText().isEmpty())
                return true;
        }
        return false;
    }

}
