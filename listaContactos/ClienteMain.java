package listaContactos;

import lista.PosicionIlegalException;

public class ClienteMain {
    public static void main(String[] args) {
        ListaDeContactos ldc = new ListaDeContactos();
        try{
            ldc.agregarContacto("Fernando", "Castro", "Laguna de camano 150 Ote. Las quintas. culiacan. sinaloa",
             "FernandoC@gmail.com", "667788987");
             ldc.agregarContacto("Fernando", "Castro", "Laguna de camano 150 Ote. Las quintas. culiacan. sinaloa",
             "FernandoC@gmail.com", "667788987");           
        }catch(PosicionIlegalException e){
            e.printStackTrace();
        }
    }
    
 }