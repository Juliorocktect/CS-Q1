package com.inf.morse.Karte;


import com.inf.morse.include.*;
public class Karte{
    Graph karte;
    
    public Karte(){
        karte = new Graph();
        neuerOrt("augustin");
        neuerOrt("holzlar");
        neuerOrt("niederpleis");
        neuerOrt("menden");
        neuerOrt("hangelar");
        neuerOrt("muelldorf");
        neueStraße("hangelar","holzlar",4.0);
        neueStraße("hangelar","augustin",2.0);
        neueStraße("augustin","menden",3.0);
        neueStraße("augustin","muelldorf",2.0);
        neueStraße("menden","muelldorf",2.0);
        neueStraße("muelldorf","niederpleis",3.0);
        neueStraße("holzlar","niederpleis",8.0);
        neueStraße("hangelar","niederpleis",5.0);
        neueStraße("augustin","niederpleis",3.0);
    }
    public void neuerOrt(String id){
        karte.addVertex(new Vertex(id));
    }
    public void neueStraße(String conId,String secondId,double weight)
    {
        Vertex v1 = karte.getVertex(conId);
        Vertex v2 = karte.getVertex(secondId);
        Edge neueStrasse = new Edge(v1,v2,weight);
        karte.addEdge(neueStrasse);
    }
    public void findeOrt(String pOrt){
        List<Vertex> list = karte.getVertices();
        while(list.hasAccess()){
            if (list.getContent().getID().equals(pOrt)){
                System.out.println("Gefunden");
            }
            list.next();
        }
    }
    public void findeWeg(String pZiel,String pStart){
        karte.setAllVertexMarks(false);
        findeWeg(pZiel,pStart,pStart);
    }
    private void findeWeg(String pNach,String akt,String bishWeg){
        Vertex current = karte.getVertex(akt);
        current.setMark(true);
        Vertex target = karte.getVertex(pNach);
    
        if(current == target) {
            System.out.println(bishWeg);
        }
        else {
            List<Vertex> neighbors = karte.getNeighbours(current);
            neighbors.toFirst();
            while (neighbors.hasAccess()) {
                if (!neighbors.getContent().isMarked()) {
                    findeWeg(neighbors.getContent().getID(), pNach, bishWeg+" - "+ neighbors.getContent().getID());
                }
                neighbors.next();
            }
        }
    }
}
