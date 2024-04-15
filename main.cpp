#include <iostream>
#include <string>
#include <vector>
#include "tree/Tree.h"
#include "./lw29/LW29.h"

int main()
{
    Tree<Ahne> *ahnenBaum = new Tree<Ahne>(Ahne("Lisa","Simpson",'w'));
    ane::ausgabe(ahnenBaum);
    std::cout << 2;
    return 0;
}