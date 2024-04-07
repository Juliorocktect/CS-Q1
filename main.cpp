#include <iostream>
#include <string>
#include <vector>
#include "./tree/Tree.h"

int main()
{
    Tree<int> tree(0);
    tree.setLeftTree(new Tree<int>(2));
    std::cout << tree.getLeftTree()->getContent() << "\n";
    return 0;
}