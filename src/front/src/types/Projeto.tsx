'use server';

import { CategoriaResponse } from "./Categoria";
import { ContratanteResponse } from "./Contratante";

export interface ProjetoRequest {
    titulo: String;
    descricao: String;
    prazo: String;
    orcamento: Number;
    idCategoria: Number;
    idContratante: Number;
}

export interface ProjetoResponse {
    id: Number;
    titulo: String;
    descricao: String;
    prazo: String;
    orcamento: Number;
    categoria: CategoriaResponse;
    contratante: ContratanteResponse;
}