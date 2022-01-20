package com.letscode.validators.aluno;

public class Aluno {

    private double mediaDeNotas;
    private int numeroDeFaltas;

    public Aluno(double mediaDeNotas, int numeroDeFaltas) {
        this.mediaDeNotas = mediaDeNotas;
        this.numeroDeFaltas = numeroDeFaltas;
    }

    public double getMediaDeNotas() {
        return mediaDeNotas;
    }

    public int getNumeroDeFaltas() {
        return numeroDeFaltas;
    }


}
