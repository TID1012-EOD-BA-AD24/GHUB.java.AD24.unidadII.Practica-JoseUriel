package listaContactos;

import lista.PosicionIlegalException;

public class ClienteMain {
    public static void main(String[] args) {
        ListaDeContactos ldc = new ListaDeContactos();
        try{
            ldc.agregarContacto("Fernando", "Castro", "Laguna de camano 150 Ote. Las quintas. culiacan. sinaloa",
             "FernandoC@gmail.com", "667788987");
             ldc.agregarContacto("Maria","Vargas","Isla del Socorro 1085, col.las Vegas, Culiacan, Sinaloa",
             "mariav@gmail.com","667160732","6672514532" );      
        }catch(PosicionIlegalException e){
            e.printStackTrace();
        }
    }
    
 }