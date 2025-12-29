package fr.ensicaen.gl;

//EXO_1
//On veut maintenant ajouter la gestion 
// des ensembles avec des arbres binaires. 
// Combien faut-il ajouter de classes pour 
// implémenter cet ajout ?
//Réponse : 4 nouvelles classes

//On veut aussi ajouter un système de gestion
//d’ensemble qui affiche à chaque fois le plus
//petit élément de la liste. 
// Combien faut-il ajouter de classes pour 
// implémenter cet ajout ?
//Réponse : 2 nouvelles classes

//EXO_2
//combien de classe doit-on écrire pour 
// ajouter les arbres binaires ? 
// 1 nouvelle classes

// Combien de classes doit-on écrire pour
//  ajouter l’implémentation qui retourne 
// l’élément minimum d’un ensemble ?
// 1 nouvelles classes

public class Main {
    public static void main( String[] args ) {
        test(new MyFifo(new MyArrayList()));         
        test(new MyLifo(new MyArrayList()));         
        test(new MyMiddle(new MyArrayList()));
        test(new MyRandom(new MyArrayList()));

        test(new MyFifo(new MyLinkedList()));
        test(new MyLifo(new MyLinkedList()));
        test(new MyMiddle(new MyLinkedList()));
        test(new MyRandom(new MyLinkedList()));
    }

    private static void test( MyList myList ) {
        System.out.println("Liste initialement vide ? " + myList.isEmpty());
        System.out.println("Push de la valeur toto");
        myList.push("toto");
        System.out.println("Liste vide ? " + myList.isEmpty());
        String s = (String) myList.pop();
        System.out.println("Pop de la valeur : " + s);
    }
}