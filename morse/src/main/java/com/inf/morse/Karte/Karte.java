package com.inf.morse.Karte;


import com.inf.morse.include.*;
public class Karte{
    Graph karte;
    
    Karte(){
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
        findeWeg(pZiel,karte.getVertex(pStart),pStart);
    }
    private void findeWeg(String pZiel,Vertex current,String weg){
        Vertex ende = karte.getVertex(pZiel);
        if (ende != current){
           current.setMark(true);
           List<Vertex> nachbarn = karte.getNeighbours(current);
           nachbarn.toFirst();
        while(nachbarn.hasAccess()){
            if (!nachbarn.getContent().isMarked()){            
            findeWeg(pZiel,nachbarn.getContent(),weg + nachbarn.getContent().getID());
            nachbarn.next();
            }
            }
        }else{
            System.out.println(current.getID());
        }
        
        //vom start die nachbarn , für jeden nachbarn nochmal bis current == ziel
    }
}
