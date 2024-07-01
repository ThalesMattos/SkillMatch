"use client";
import React, { MouseEventHandler, useRef, useState } from "react";
import { MainNavbar } from "../navbar";
import { Select, SelectSection, SelectItem } from "@nextui-org/select";
import { Input } from "@nextui-org/react";
import { Button } from "@nextui-org/react";

export default function Home() {
    const usuarioRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const senhaRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const confirmarSenhaRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const tipoRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const [confirmarSenhaInvalida, setConfirmarSenhaInvalida] = useState(false);

    const cadastrar: MouseEventHandler = (event: React.MouseEvent) => {
        console.log(usuarioRef.current?.value);
        console.log(senhaRef.current?.value);
        console.log(confirmarSenhaRef.current?.value);
        console.log(tipoRef.current?.value);
    };

    return (
        <main className="flex min-h-screen flex-col items-center p-5">
            <MainNavbar />

            <title>Cadastro - Freelancer</title>
            <div className="flex min-h-screen flex-col items-center container mt-24">
                <label>Cadastro - Freelancer</label>
                <div className="w-full flex flex-col items-center container gap-4">
                    <Input
                        isRequired
                        type="name"
                        label="Nome:"
                        placeholder="Nome"
                        className="max-w-xs p-2"
                    />
                    <Input
                        isRequired
                        type="name"
                        label="CPF:"
                        placeholder="123.456.789-00"
                        className="max-w-xs p-2"
                    />
                    <Input
                        ref={usuarioRef}
                        isRequired
                        type="email"
                        label="Email:"
                        placeholder="usuário@skillmatch.com"
                        className="max-w-xs p-2"
                    />
                    <Input
                        ref={senhaRef}
                        isRequired
                        type="password"
                        label="Senha:"
                        placeholder="******"
                        className="max-w-xs p-2"
                        isInvalid={confirmarSenhaInvalida}
                        onChange={(event) => {
                            if (!!confirmarSenhaRef.current?.value) setConfirmarSenhaInvalida(event.target.value !== confirmarSenhaRef.current?.value);
                        }}
                    />
                    <Input
                        ref={confirmarSenhaRef}
                        isRequired
                        type="password"
                        label="Confirme sua senha:"
                        placeholder="******"
                        className="max-w-xs p-2"
                        isInvalid={confirmarSenhaInvalida}
                        errorMessage={confirmarSenhaInvalida ? 'As senhas devem ser iguais' : null}
                        onChange={(event) => {
                            setConfirmarSenhaInvalida(event.target.value !== senhaRef.current?.value);
                        }}
                    />
                    <Button color="warning" onClick={cadastrar}>
                        Cadastrar
                    </Button>
                </div>
            </div>
        </main>
    );
}
