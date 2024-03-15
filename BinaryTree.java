public class BinaryTree<T>{
     public class Node{
        private Node leftChild;
        private Node rightChild;
        private T content;
        Node(T pContent){
            content = pContent;
        }
        T getContent(){return content;}
        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        }
        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        }
        public void setContent(T content) {
            this.content = content;
        }
        public Node getLeftChild() {
            return leftChild;
        }
        public Node getRightChild() {
            return rightChild;
        }
        public boolean hasRight(){return rightChild != null;}

    }
    public Node root;
    private Node current;
    public BinaryTree(T content){
        root = new Node(content);
    }
    public void setCurrentLeft(){ // /check for null
        current = current.getLeftChild();
    }
    public void setCurrentRight(){
        if(current.hasRight()){
            current = current.getRightChild();
        }   
    }
}