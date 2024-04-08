#include <iostream>
#include <string>
#include <vector>
#include "./tree/Tree.h"

int main()
{
    Tree<int> tree(0);
    tree.setLeftTree(new Tree<int>(2));
    tree.setRightTree(new Tree<int>(4));
    std::cout << tree.getLeftTree()->getContent() << "\n";

    std::cout << trm::anzahlKnoten(&tree) << "\n";
    return 0;
}