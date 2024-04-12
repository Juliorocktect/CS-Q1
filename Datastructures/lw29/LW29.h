#pragma once
#include "../tree/Tree.h"
#include <iostream>

class Ahne
{
public:
    char *vorname;
    char *nachname;
    char geschlecht;
    Ahne();
    Ahne(char *pVorname, char *pNachname, char pGeschlecht);
    void ausgeben();
};
namespace ane
{
    void ausgabe(Tree<Ahne> *tree);
};

Tree<Ahne> *gibAhnenbaum();
