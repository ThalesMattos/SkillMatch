"use client"

import React, { MouseEventHandler, useRef, useState } from "react";
import { MainNavbar } from "../navbar";
import { Input } from "@nextui-org/react";
import { Button } from "@nextui-org/react";
import { Textarea } from "@nextui-org/input";
import { Select, SelectItem } from "@nextui-org/react";
import { ContratanteResponse } from "../../types/Contratante";
import { CategoriaResponse } from "../../types/Categoria";
import { ProjetoRequest } from "../../types/Projeto";
import { userData, isLoggedIn } from "../../utils/Usuario";
import Swal from "sweetalert2";

const tiposPromise = fetch('http://127.0.0.1:8080/projeto/categorias');
const contratantePromise = fetch(`http://127.0.0.1:8080/contratante/${userData.usuario.id}`, {method:"GET"});

export default function Home() {
    const [tipos, setTipos] = useState<Array<CategoriaResponse>>([]);
    const [contratante, setContratante] = useState<ContratanteResponse>();
    if(tipos.length == 0) tiposPromise.then(async res => !res.bodyUsed ? setTipos(await res.json()) : null);
    if(contratante == null) contratantePromise.then(async res => !res.bodyUsed ? setContratante(await res.json()) : null);
    
    const tituloRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const descricaoRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const orcamentoRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const prazoRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const categoriaRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const contratanteRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    
    const cadastrar: MouseEventHandler = (event: React.MouseEvent) => {
        const tituloValue = tituloRef.current?.value ?? '';
        const descricaoValue = descricaoRef.current?.value ?? '';
        const prazoValue = prazoRef.current?.value ? new Date(prazoRef.current?.value).toISOString() : null ?? '';
        const orcamentoValue = new Number(orcamentoRef.current?.value);
        const categoriaValue = new Number((categoriaRef.current?.value.replace('tipo-', '')));
        const contratanteValue = new Number(contratanteRef.current?.value.replace('contratante-', ''));

        const projetoDTO: ProjetoRequest = {
            titulo: tituloValue,
            descricao: descricaoValue,
            prazo: prazoValue,
            orcamento: orcamentoValue,
            idCategoria: categoriaValue,
            idContratante: contratanteValue,
        };

        fetch('http://127.0.0.1:8080/projeto', { 
            method: 'POST', 
            headers: {
                "Content-Type": "application/json",
            },

            body: JSON.stringify(projetoDTO)
        }).then(response => {
            let timerInterval: NodeJS.Timeout;
            const tempoParaRedirecionar = 3;
            Swal.fire({
                icon: "success",
                title: "Sucesso!",
                html: `Inserido com sucesso! <br>Você será redirecionado automáticamente em <b timer>${tempoParaRedirecionar}</b> segundos.`,
                timer: tempoParaRedirecionar * 1000,
                timerProgressBar: true,
                didOpen: () => {
                    Swal.showLoading();
                    const timer = Swal.getPopup()?.querySelector("b[timer]");
                    timerInterval = setInterval(() => {
                        let timerLeft = Swal.getTimerLeft();
                        if(timer && timerLeft) timer.textContent = `${(timerLeft/1000).toFixed(0)}`;
                    }, 1000);
                },
                willClose: () => {
                    clearInterval(timerInterval);
                }
            }).then((result) => {
                window.location.href = '/findProject';
            });
        })
    };
    
    const sizes = ["md"];

    return (
        <main className="flex min-h-screen flex-col items-center p-5 ">
            <MainNavbar />
            <title>
                Publicar Projeto
            </title>
            <div className="flex min-h-screen flex-col items-center container mt-24">
                <label>
                    Publicar novo Projeto
                </label>
                <div className="w-full flex flex-col items-center container gap-4">
                    <Input
                        ref={tituloRef}
                        isRequired
                        type="username"
                        label="Título"
                        placeholder="Projeto"
                        className="max-w-xs p-2"
                    />
                    <Textarea
                        ref={descricaoRef}
                        isRequired
                        label="Descrição"
                        placeholder="Insira aqui a descrição do seu Projeto"
                        className="max-w-xs p-2"
                    />

                    <Input
                        ref={orcamentoRef}
                        isRequired
                        type="number"
                        label="Orçamento(R$)"
                        placeholder="R$1000,00"
                        className="max-w-xs p-2"
                    />
                    <Input
                        ref={prazoRef}
                        isRequired
                        type="date"
                        label="Prazo"
                        placeholder="dd/mm/aaaa"
                        className="max-w-xs p-2"
                    />
                    <Select
                        ref={categoriaRef}
                        label="Categoria do Projeto"
                        placeholder="Selecione a Categoria"
                        className="max-w-xs p-2"
                    >
                        {tipos.map((tipo) => (
                            <SelectItem key={'tipo-' + tipo.id} value={tipo.id.toString()}>
                                {tipo.nome}
                            </SelectItem>
                        ))}
                    </Select>
                    <Input
                        ref={contratanteRef}
                        value={contratante?.id?.toString()}
                        hidden
                        className="hidden"/>
                    <Input
                        isRequired
                        readOnly
                        label="Contratante"
                        value={`${contratante?.numDocumento} - ${contratante?.usuario}`}
                        className="max-w-xs p-2"
                    />
                    <Button onClick={cadastrar} color="warning">
                        Publicar
                    </Button>
                </div>
            </div>
        </main>

    );
}