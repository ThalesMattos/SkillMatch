"use client";
import React, { MouseEventHandler, useRef, useState } from "react";
import { MainNavbar } from "../navbar";
import { Button } from '@nextui-org/button'
import { Card, CardBody } from '@nextui-org/card'
import { ProjetoResponse } from "@/types/Projeto";
import './style.css';
import moment from 'moment';

const projetosPromise = fetch('http://127.0.0.1:8080/projeto');

export default function Home() {
    const [projetos, setProjetos] = useState<Array<ProjetoResponse>>([]);
    if (projetos.length == 0) projetosPromise.then(async res => !res.bodyUsed ? setProjetos(await res.json() ?? []) : null);

    return (
        <main className="flex min-h-screen flex-col items-center justify-start p-10">
            <MainNavbar />
            <div className="z-10 w-full max-w-5xl flex flex-col items-center justify-start mt-10">
                <h1 className='text-2xl font-bold text-center mb-8 text-white-600'>
                    Encontre aqui seu próximo projeto!
                </h1>
                <div className='container w-full max-w-2xl'>
                    <Card className='w-full h-auto py-1 mx-auto shadow-md rounded-lg'>
                        <CardBody className='p-6'>
                            {projetos.map((projeto, index) => (
                                <div key={index} className="projeto">
                                    <hr className="my-12 h-0.5 border-t-0 bg-neutral-100 dark:bg-white/10 divider hidden" />
                                    <div className='flex gap-6 items-center'>
                                        {/* <Image
                                            className="max-w-full h-auto rounded"
                                            width={100}
                                            alt="SkillMatch Image with Zoom"
                                            src="images/python-logo.png"
                                        /> */}
                                        <div className='flex-1 ml-auto '>
                                            <h2 className='text-2xl font-bold uppercase text-white'>
                                                {projeto.titulo}
                                            </h2>
                                            <p className='text-sm text-white-600'>
                                                {projeto.descricao}
                                            </p>
                                            <div className='mb-4 mt-2 flex flex-col flex-wrap gap-3 items-start'>
                                                <span>
                                                    <b>Prazo:&nbsp;</b>
                                                    <span className='text-white'>{moment(new Date(projeto.prazo.toString())).format('DD/MM/YYYY H:MM:SS')}</span>
                                                </span>
                                                <span>
                                                    <b>Orçamento:&nbsp;</b>
                                                    <span className='text-white'>{new Intl.NumberFormat('pt-BR', { style: 'currency', currency: 'BRL' }).format(Number(projeto.orcamento)).toString()}</span>
                                                </span>
                                                <span>
                                                    <b>Categoria:&nbsp;</b>
                                                    <span className='text-warning'>{projeto.categoria.nome}</span>
                                                </span>
                                                <span>
                                                    <b>Endereço contratante:&nbsp;</b>
                                                    <span className='text-warning'>{projeto.contratante.usuario.toString()}</span>
                                                </span>
                                            </div>
                                            <div className='mt-4 flex gap-4'>
                                                <Button color='warning'>Candidatar-se</Button>
                                                <Button color='warning' variant='bordered' radius='full'>
                                                    Adicionar aos Favoritos
                                                </Button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            ))}
                        </CardBody>
                    </Card>
                </div>
            </div>
        </main>
    );

}