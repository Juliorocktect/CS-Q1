#include <string>
#include <vector>
template <typename T>
class Vertex
{
public:
    bool mark;
    std::string id;
    T content;
    Vertex()
    {
    }
    Vertex(T pContent, std::string pId)
    {
        content = pContent;
        id = pId;
    }
    ~Vertex();
    bool isMarked() { return mark; }
    void setMarked(bool pMark) { mark = pMark; }
    std::string getId() { return id; }
};
template <typename T>
class Edge
{
public:
    double weight;
    Vertex<T> **vertices;
    bool mark;
    Edge() {}
    Edge(double pWeight)
    {
        weight = pWeight;
    }
    Edge(double pWeight, Vertex<T> *pKnoten1, Vertex<T> *pKnoten2)
    {
        weight = pWeight;
        vertices[0] = pKnoten1;
        vertices[0] = pKnoten2;
    }
    double getWeight()
    {
        return weight;
    }
    Vertex<T> **getVerteces() { return vertices; }
    void setWeight(double pWeight) { weight = pWeight; }
    void setMark(bool pMark) { mark = pMark; }
    bool isMarked() { return mark; }
};
template <typename T>
class Graph
{
private:
    std::vector<Vertex<T>> vertices;
    std::vector<Edge<T>> edges;

public:
    Graph()
    {
    }
    ~Graph() {}
    std::vector<Vertex<T>> getVertices() { return vertices; }
    std::vector<Edge<T>> getEdges() { return edges; }
    Vertex<T> getVertex(std::string id)
    {
        for (int i = 0; i < vertices.size(); i++)
        {
            if (vertices[i].id.compare(id) == 0)
            {
                return vertices[i];
            }
        }
        return nullptr;
    }
    void addVertex(Vertex<T> pVertex)
    {
        if (getVertex(pVertex)){
            
        }
    }
};
Vertex<int> *erstelleGraph();
