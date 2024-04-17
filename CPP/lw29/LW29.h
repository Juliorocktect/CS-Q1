#pragma once
#include "../tree/Tree.h"
#include <iostream>

class Ahne
{
public:
    const char *vorname;
    const char *nachname;
    char geschlecht;
    Ahne();
    Ahne(const char *pVorname,const char *pNachname, char pGeschlecht);
    void ausgeben();
};
namespace ane
{
    void ausgabe(Tree<Ahne> *tree);
};

Tree<Ahne> *gibAhnenbaum();

struct Kind {
    const char* vorname;
    const char* nachname;
    char geschlecht;
};