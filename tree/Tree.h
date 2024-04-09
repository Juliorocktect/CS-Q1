#pragma once
#include <iostream>
template <typename T>
class Tree
{

public:
    class TreeNode
    {
    public:
        T content;
        Tree<T> *leftNode;
        Tree<T> *rightNode;
        TreeNode()
        {
            leftNode = nullptr;
            rightNode = nullptr;
        }
        TreeNode(T pContent)
        {
            content = pContent;
            leftNode = nullptr;
            rightNode = nullptr;
        }
    };

    Tree()
    {
        root = nullptr;
    }
    Tree(T pContent)
    {
        root = new TreeNode(pContent);
    }
    Tree<T> *getLeftTree() { return root->leftNode; }
    Tree<T> *getRightTree() { return root->rightNode; }
    void setLeftTree(Tree<T> *left) { root->leftNode = left; }
    void setRightTree(Tree<T> *right) { root->rightNode = right; }
    T getContent() { return root->content; }
    bool isEmpty() { return root == nullptr; }

private:
    TreeNode *root;
};

namespace trm
{
    template <typename T>
    int anzahlKnoten(Tree<T> *tree)
    {
        if (tree->getLeftTree() == nullptr && tree->getRightTree() == nullptr)
            return 0;
        int anzahl = 0;
        if (tree->getLeftTree() != nullptr)
        {
            anzahl++;
            anzahlKnoten<T>(tree->getLeftTree());
        }
        if (tree->getRightTree() != nullptr)
        {
            anzahl++;
            anzahlKnoten<T>(tree->getRightTree());
        }
        if (!tree->isEmpty())
            anzahl++;
        return anzahl;
    }
    template <typename T>
    void printPreorder(Tree<T> *tree)
    {
        if (!tree)
            return;
        std::cout << tree->getContent() << "\t";
        if (tree->getLeftTree())
            printPreorder(tree->getLeftTree());
        if (tree->getRightTree())
            printPreorder(tree->getRightTree());
    }
    template <typename T>
    void printInorder(Tree<T> *tree)
    {
        if (!tree)
            return;
        if (tree->getLeftTree())
        {
            //std::cout << tree->getLeftTree()->getContent() << "\t";
            printInorder(tree->getLeftTree());
        }
        std::cout << tree->getContent() << "\t";
        if (tree->getRightTree())
        {
            //std::cout << tree->getRightTree()->getContent() << "\t";
            printInorder(tree->getRightTree());
        }
    }
    template<typename T>
    void printPostorder(Tree<T> *tree)
    {
        if(!tree)
            return;
        if(tree->getLeftTree())
            printPostorder(tree->getLeftTree());
        if(tree->getRightTree())
            printPostorder(tree->getRightTree());
        std::cout << tree-> getContent() << "\t";

    }

};