#include <iostream>
#include <string>
#include <vector>

namespace Tree
{
    class Node
    {
    public:
        Node *leftChild;
        Node *rightChild;
        char *content;
        Node(char *pContent)
        {
            leftChild = nullptr;
            rightChild = nullptr;
            content = pContent;
        }
        void setLeft(Node *left) { leftChild = left; }
        void setRight(Node *right) { rightChild = right; }
    };
    class BTree
    {
    public:
        Node *root;
        BTree(char *content)
        {
            root = new Node(content);
        }
    };
};

char* decode(char *code)
{
    Tree::BTree tree("");
    tree.root->leftChild = new Tree::Node("E");
    tree.root->rightChild = new Tree::Node("T");
    std::vector<std::string> tokens;
    std::string cd(code);
    size_t pos = 0;
    while ((pos = cd.find(" ")) != std::string::npos)
    {
        tokens.push_back(cd.substr(0, pos));
        cd.erase(0, pos + 1);
    }
    for (int i = 0; i < tokens.size(); i++)
    {
        std::string token = tokens[i];
        for (int j = 0; j < token.size(); j++)
        {
            Tree::Node *current = new Tree::Node("");
            if (token[j] == '.')
            {
                
            }
            else
            {
                // gehe rechts
            }
        }
        ergebnis += tree.getContent();
    }
}

int main()
{
    Tree::BTree tree("Hallo");
    std::cout << tree.root->content << std::endl;
    tree.root->leftChild = new Tree::Node("Moritz");
    std::cout << tree.root->leftChild->content << std::endl;
    return 0;
}