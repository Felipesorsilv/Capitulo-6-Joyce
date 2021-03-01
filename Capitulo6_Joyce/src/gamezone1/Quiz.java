/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.ArrayList;
/**
 *
 * @author Alexandra
 */
public class Quiz {
     private ArrayList<Pregunta> quiz;
    private Integer aciertos;

    public Quiz() {
        this.quiz = new ArrayList();
        this.aciertos = 0;
    }

    public void addPregunta(String pregunta) {
        quiz.add(new Pregunta(pregunta));
    }

    public void addInciso(Integer pr, Inciso x) {
        Pregunta r = quiz.get(pr - 1);
        r.setInciso(x.getRespuesta(), x.getCorrecto());
        quiz.set(pr - 1, r);

    }
  
    public void calificacion() {
        double a = (double)(this.aciertos);
        double s = (double)(quiz.size());
        System.out.println("Su calificacion ha sido: " + (a/s)*100);
    }

    public Boolean verificaPregunta(Integer g,Integer i) {
        if (quiz.get(g).getCorrecto(i)) {
            System.out.println("Respuesta correcta");
            this.aciertos++;
            return true;
        } else {
            System.out.println("incorrecto");
            return false;
        }
    }
    
    public int getQuizSize(){
        return quiz.size();
    }

    
    
    public void imprimir(Integer j) {

        System.out.println(quiz.get(j).toString());

    }
}
