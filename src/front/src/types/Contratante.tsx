'use server';
import { UsuarioRequest, UsuarioResponse } from './Usuario';

export interface ContratanteResponse extends UsuarioResponse {
    numDocumento: String;
}

export interface ContratanteRequest extends UsuarioRequest {
    senha: String;
    numDocumento: String;
}