package java;
 
 /* Java usa Programação Orientada a Objetos (POO), um estilo de programação
que se destina a tornar o pensamento sobre programação mais próximo do pensamento sobre o mundo real.
Na POO, cada objeto é uma unidade independente com uma identidade única,
assim como os objetos no mundo real são. */

/* na programação orientada a objetos, cada objeto tem três dimensões: identidade, atributos e comportamento.
Atributos descrevem o estado atual do objeto, e o que o objeto é capaz de fazer é demonstrado através do comportamento do objeto. */

class Main{
    public static void main(String[] args) {
        Poo test1 = new Poo();

        test1.WhatFood();
        test1.ClosedWindow();
        test1.WhatMovie();
   }
}