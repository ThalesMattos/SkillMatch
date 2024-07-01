"use client";
import React, { MouseEventHandler, useRef, useState } from "react";
import { MainNavbar } from "../navbar";
import { Select, SelectSection, SelectItem } from "@nextui-org/select";
import { Input } from "@nextui-org/react";
import { Button } from "@nextui-org/react";
import { UsuarioRequest } from "@/types/Usuario";
import Swal from 'sweetalert2';

export default function Home() {
    const usuarioRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const senhaRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const confirmarSenhaRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const tipoRef: React.RefObject<HTMLInputElement> = useRef<HTMLInputElement>(null);
    const [invalido, setInvalido] = useState<boolean>(false);

    const login: MouseEventHandler = (event: React.MouseEvent) => {
        const usuario = usuarioRef.current?.value;
        const senha = senhaRef.current?.value;

        const request: UsuarioRequest = {
            usuario, senha
        }

        fetch('http://127.0.0.1:8080/auth', { 
            method: 'POST', 
            credentials: "same-origin",
            headers: {
                "Content-Type": "application/json",
            },

            body: JSON.stringify(request)
        }).then(async response => {
            if(response.status == 403){
                setInvalido(true);
                Swal.fire({
                    title: 'Erro!',
                    text: 'Login ou senha inválidos',
                    icon: 'error',
                    confirmButtonText: 'Ok'
                });
            }else if(response.status == 200){
                const data = await response.json();
                console.log(data);

                // TODO: Validação CRSF token
                document.cookie = `skillmatch-token=${data.token}; expires=${new Date(data.expirationDate).toUTCString()}`;
                localStorage.setItem('skillmatch-data', JSON.stringify(data));
                
                let timerInterval: NodeJS.Timeout;
                const tempoParaRedirecionar = 3;
                Swal.fire({
                    icon: "success",
                    title: "Sucesso!",
                    html: `Bem vindo <b>${data.tipo}</b>! <br>Você será redirecionado automáticamente em <b timer>${tempoParaRedirecionar}</b> segundos.`,
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
                    window.location.href = '/viewProfile';
                });
            }
        })
    };

    return (
        <main className="flex min-h-screen flex-col items-center p-5">
            <MainNavbar />

            <title>Login</title>
            <div className="flex min-h-screen flex-col items-center container mt-24">
                <label>Login</label>
                <div className="w-full flex flex-col items-center container gap-4">
                    <Input
                        ref={usuarioRef}
                        isRequired
                        type="email"
                        label="Email:"
                        placeholder="usuário@skillmatch.com"
                        className="max-w-xs p-2"
                        isInvalid={invalido}
                        onChange={e => setInvalido(false)}
                    />
                    <Input
                        ref={senhaRef}
                        isRequired
                        type="password"
                        label="Senha:"
                        placeholder="******"
                        className="max-w-xs p-2"
                        isInvalid={invalido}
                        onChange={e => setInvalido(false)}
                    />

                    <Button color="warning" onClick={login}>
                        Entrar
                    </Button>
                </div>
            </div>
        </main>
    );
}
