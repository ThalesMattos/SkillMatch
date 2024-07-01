'use server';

export interface UsuarioRequest {
    id?: number | undefined;
    usuario: string | undefined;
    senha: string | undefined;
}

export interface UsuarioResponse {
    id: number | undefined;
    usuario: string | undefined;
}