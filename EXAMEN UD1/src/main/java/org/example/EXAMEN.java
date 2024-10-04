package org.example;

import java.util.InputMismatchException;
import java.util.Scanner; //para que vaya el Scanner

public class EXAMEN { //la clase

    public void ejercicio1(){ //pues el void

        //este es el scanner para que pueda introducir datos por teclado
        Scanner entrada = new Scanner(System.in);

        float tri1 = 0; //primera variable, en float por si tiene decimales
        float tri2 = 0; //segunda variable, en float por si tiene decimales
        float tri3 = 0; //tercera variable, en float por si tiene decimales
        float media; //esto es la nota media, en float también
        boolean notas = true; //un booleano para repetir la introduccion de notas si se van de rango o no es un numero

        while(notas==true) { //while con el booleano para que se repita

            try { //el try para controlar el no poner letras
                System.out.println("Dame la nota del primer trimestre (0-10): "); //esto dice que nos des la primera variable
                tri1 = entrada.nextFloat(); //aqui se pide la primera variable
                System.out.println("Dame la nota del segundo trimestre (0-10): ");
                tri2 = entrada.nextFloat(); //aqui la segunda
                System.out.println("Dame la nota del tercer trimestre (0-10): ");
                tri3 = entrada.nextFloat(); //aqui la tercera

                if (tri1 >= 0 & tri1 <= 10 & tri2 >= 0 & tri2 <= 10 & tri3 >= 0 & tri3 <= 10) { //no te asustes, esto tan largo es para controlar que cada variable esté entre 0-10
                    notas = false; //si las notas son correctas se niega el booleano para no hacer el while y asi no volver a pedir las notas

                } else { // lo que este fuera del rango hara lo de abajo
                    System.out.println("Nota fuera de rango (0-10). Vuelve a introducirlas..."); //esto dice que tus notas no estan en rango
                    System.out.println(""); //esto lo pongo para crear un espacio entre la siguiente linea, porque me gusta. sin mas
                }


            } catch (InputMismatchException er) { //aqui ponemos el catch, aun dentro del while, para volver a pedir las notas si las introducimos mal
                System.out.println("ERROR. Introduce un valor válido..."); //esto dice error
                System.out.println("");
                entrada.nextLine(); //para que no se pare sin mas, que siga
            }
        }

        media = (tri1+tri2+tri3)/3; //aqui calculamos la media sumando las 3 y dividiendo entre 3
        System.out.println("");
        System.out.println("Tu nota media es: " + media); //aqui decimos la media previamente calculada

        if (media>=5){ //si la media es mayor o igual que 5 hara lo de dentro

            System.out.println("ENHORABUENA, HAS APROBADO!");

        } else{ //lo demas

            System.out.println("Estás suspendido.");
        }



    }

    public void ejercicio2(){ //este me dijiste en clase que no te lo comente :D gracias

        Scanner entrada = new Scanner(System.in);

        int num = 0;
        boolean rep = true;

        while(rep==true) {

            try {

                System.out.println("Introduce un número...");
                num = entrada.nextInt();
                rep = false;

            } catch (InputMismatchException er) {
                System.out.println("ERROR. Introduce un valor válido...");
                System.out.println("");
                entrada.nextLine();
            }
        }

        if (num<0){

            num = num*(-1);
            System.out.println("El valor absoluto es " + num);

        } else {

            System.out.println("El valor absoluto es " + num);

        }



    }



}
