package com.letscode.validators.aluno;

import com.letscode.validators.MotorRegraValidacao;
import com.letscode.validators.RegraValidacao;

public class ValidadorAluno {

    public boolean verificaAprovacao(Aluno aluno) {
        RegraValidacao<Aluno>[] regras = new RegraValidacao[]{ new RegraMediaNotas(), new RegraNumeroFaltas() };
        MotorRegraValidacao<Aluno> novoMotorRegraValidacao = new MotorRegraValidacao<>(regras);
        return novoMotorRegraValidacao.executa(aluno);
    }

}
