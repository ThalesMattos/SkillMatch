"use client";
import React, { MouseEventHandler, useRef, useState } from "react";
import { MainNavbar } from "../navbar";
import { Button } from "@nextui-org/react";
import { Link } from "@nextui-org/react";
import { Card, CardHeader, CardBody, CardFooter, Divider, Image } from "@nextui-org/react";


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
            <div className="flex min-h-screen flex-col items-center container mt-24">
                <Card className="max-w">
                    <CardHeader className="flex gap-5">
                        <Image
                            alt="skillmatch logo"
                            height={40}
                            radius="sm"
                            src="/images/logoSkillMatch.png"
                            width={40}
                        />
                        <div className="flex flex-col">
                            <p className="text-large">Cadastro de Usuário</p>
                            <p className="text-tiny text-default-500">Selecione o tipo de Cadastro</p>
                        </div>
                    </CardHeader>
                    <Divider />
                    <CardBody className="flex gap-5">
                        <div className="flex items-center space-x-4">
                            <Image
                                alt="freelancer icon"
                                height={40}
                                radius="sm"
                                src="/images/contratanteicone.png"
                                width={40}
                            />
                            <Link href="signInContratante" className="w-full">
                                <Button color="warning" className="w-full">
                                    Cadastro de Contratante
                                </Button>
                            </Link>
                        </div>
                    </CardBody>
                    <Divider />
                    <CardFooter className="w-full">
                        <div className="flex items-center space-x-4 w-full" >
                            <Image
                                alt="freelancer icon"
                                height={40}
                                radius="sm"
                                src="/images/freelancericone.png"
                                width={40}
                            />
                            <Link href="signInFreelancer" className="w-full">
                                <Button color="warning" className="w-full">
                                    Cadastro de Freelancer
                                </Button>
                            </Link>
                        </div>
                    </CardFooter>
                </Card>
            </div>
        </main>
    );
}
