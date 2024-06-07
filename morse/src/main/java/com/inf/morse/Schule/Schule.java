package com.inf.morse.Schule;

import com.inf.morse.include.Edge;
import com.inf.morse.include.Graph;
import com.inf.morse.include.List;
import com.inf.morse.include.Vertex;

public class Schule {
    private Graph schule;

    private void neuerOrt(String id){
        schule.addVertex(new Vertex(id));
    }

    private void neuerWeg(String conId,String secondId,double weight){
        Vertex v1 = schule.getVertex(conId);
        Vertex v2 = schule.getVertex(secondId);
        Edge neueStrasse = new Edge(v1,v2,weight);
        schule.addEdge(neueStrasse);
    }

    public Schule(){
        schule = new Graph();
        neuerOrt("Treppenhaus");
        neuerOrt("300Klo");
        neuerOrt("Pausenhalle");
        neuerOrt("Eingang400");
        neuerOrt("100Klo");
        neuerOrt("Musikraum");
        neuerOrt("Treppenhaus2");
        neuerOrt("200Klo");
        neuerWeg("Treppenhaus2","Pausenhalle" , 67.0);
        neuerWeg("Treppenhaus2","Eingang400", 63.0);
        neuerWeg("Treppenhaus","Pausenhalle",10.0);
        neuerWeg("Treppenhaus2","Treppenhaus1", 60.0);
        neuerWeg("Treppenhaus", "Musikraum", 64.0);
        neuerWeg("200Klo","Treppenhaus", 76.0);
        neuerWeg("200Klo","Musikraum",12.0);
        neuerWeg("Pausenhalle", "Musikraum", 57.0);
        neuerWeg("Treppenhaus","300Klo", 7.0);
    }

    public void ausgabeEntfernung(String pStart,String pZiel){
        schule.setAllVertexMarks(false);
        ausgabeEntfernung(pStart, pZiel, pStart);
    }

    private void ausgabeEntfernung(String pAkt,String pZiel,String weg){
        Vertex current = schule.getVertex(pAkt);
        current.setMark(true);
        Vertex target = schule.getVertex(pZiel);
    
        if(current == target) {
            String[] split = weg.split(",");
            double laenge = 0.0;
            for (int i = 0;i < split.length-1;i++){
                 Edge edge = schule.getEdge(schule.getVertex(split[i]),schule.getVertex(split[i+1]));
                laenge += edge.getWeight();
            }
            System.out.println("\t" + laenge);
        }
        else {
            List<Vertex> neighbors = schule.getNeighbours(current);
            neighbors.toFirst();
            while (neighbors.hasAccess()) {
                if (!neighbors.getContent().isMarked()) {
                    ausgabeEntfernung(neighbors.getContent().getID(), pZiel, weg + "," + neighbors.getContent().getID());
                }
                neighbors.next();
            }
        }
    }

    public void ausgabeAllerKnoten(){
        List<Vertex> vertices = schule.getVertices();
        vertices.toFirst();
        while(vertices.hasAccess()){
            System.out.println(vertices.getContent().getID());
            vertices.next();
        }
    }
    public void ausgabeAllerWege(){
        List<Edge> edges = schule.getEdges();
        edges.toFirst();
        while (edges.hasAccess()){
            System.out.println(edges.getContent().getWeight());
            edges.next();
        }
    }

}
