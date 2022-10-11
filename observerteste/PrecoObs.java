/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerteste;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class PrecoObs implements INotificar{
    ArrayList<Cliente> cliente = new ArrayList <> ();
    
    public void clienteAdd(Cliente cliente){
       this.cliente.add(cliente);
    }
    
    public void clienteRemover(Cliente cliente){
        this.cliente.remove(cliente);
    }

    @Override
    public void notificar(Moeda moeda) {
        for(Cliente cliente:cliente ){
            cliente.notificado(moeda.getValor());
        }
    }

}