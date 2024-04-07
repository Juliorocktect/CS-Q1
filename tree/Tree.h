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

private:
    TreeNode *root;
};