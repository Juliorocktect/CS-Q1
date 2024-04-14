#include "LW29.h"

Ahne::Ahne() {}

Ahne::Ahne(char *pVorname, char *pNachname, char pGeschlecht)
{
    vorname = pVorname;
    nachname = pNachname;
    geschlecht = pGeschlecht;
}

Tree<Ahne> *gibAhnenbaum()
{
    Ahne lisa("Lisa", "Simpson", 'w');
    Tree<Ahne> *tree = new Tree<Ahne>(lisa);
    return tree;
}
void Ahne::ausgeben()
{
    std::cout << this->vorname << "\t" << this->nachname << "\t" << this->geschlecht << "\n";
}

void ane::ausgabe(Tree<Ahne> *tree)
{
    if (!tree)
        return;
    std::cout << 1;
    std::cout << tree->getContent().vorname;
    if (tree->getLeftTree())
        ausgabe(tree->getLeftTree());
    if (tree->getRightTree())
        ausgabe(tree->getRightTree());
}
