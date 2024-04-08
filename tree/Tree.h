#pragma once

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
        TreeNode() {}
        TreeNode(T pContent)
        {
            content = pContent;
        }
    };

    Tree()
    {
        root = nullptr;
    }
    Tree(T pContent) { root = new TreeNode(pContent); }
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
};