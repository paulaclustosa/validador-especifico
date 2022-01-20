package com.letscode.validators.aluno;

import com.letscode.validators.RegraValidacao;

public class RegraMediaNotas implements RegraValidacao<Aluno> {

    @Override
    public boolean validar(Aluno aluno) {
        return aluno.getMediaDeNotas() > 5;
    }

}
