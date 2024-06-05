#include "Graph.h"

Vertex<int> *erstelleGraph()
{
    Vertex<int> *a = new Vertex<int>(5, std::string("1"));
    Vertex<int> *b = new Vertex<int>(2, std::string("2"));
    Edge<int> *kante = new Edge<int>(0, a, b);
}