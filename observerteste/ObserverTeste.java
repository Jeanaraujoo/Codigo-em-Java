package observerteste;

public class ObserverTeste {

    public static void main(String[] args) {
       Cliente pedroE = new Cliente("Pedro Erick", 60);
       Cliente pedroL = new Cliente("Pedro Leonardo", 30);
       Cliente jean = new Cliente("Jean Araujo", 45);

       
       Moeda egld = new Moeda("egld", 55.0);
       
       
       PrecoObs listaPreco = new PrecoObs();
       egld.listaPreco = listaPreco;
       
       listaPreco.clienteAdd(pedroE);
       listaPreco.clienteAdd(pedroL);
       listaPreco.clienteAdd(jean);
       
       egld.setValor(10);
       
       
    }
    
}
