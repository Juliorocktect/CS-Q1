#include <iostream>
#include <string>
#include <vector>
#include "./tree/Tree.h"
#include "./lw29/LW29.h"

int main()
{
    // Tree<int> tree(0);
    // tree.setLeftTree(new Tree<int>(2));
    // tree.setRightTree(new Tree<int>(4));
    Tree<Ahne> *ahnen = gibAhnenbaum();
    Tree<Ahne> *ahnenBaum = new Tree<Ahne>(Ahne("Lisa","Simpson",'w'));
    ane::ausgabe(ahnenBaum);
    return 0;
}