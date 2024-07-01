"use client";
import React, { MouseEventHandler, useRef, useState } from "react";
import { MainNavbar } from "../navbar";
import { Select, SelectSection, SelectItem } from "@nextui-org/select";
import { Input } from "@nextui-org/react";
import { Button } from "@nextui-org/react";
import { Image } from "@nextui-org/react";
import styles from "./index.module.css";


export default function Home() {
    return (
        <main className="flex min-h-screen flex-col items-center justify-start p-10">
            <MainNavbar />
            <div className="z-10 w-full max-w-5xl flex flex-col items-center justify-start mt-10">
                <div className="flex justify-center items-start w-full">
                    <div className="z-10 w-full max-w-5xl flex flex-col items-center justify-start mt-10">
                        <Image
                            isZoomed
                            className="max-w-full h-auto"
                            width={200}
                            alt="SkillMatch Image with Zoom"
                            src="images/logo2.png"
                        />
                        <div className="text-center py-8">
                            <p className="text-inherit mx-auto max-w-3xl mb-8">
                                Bem-vindo ao nosso projeto desenvolvido como parte do Trabalho Interdisciplinar: Aplicações para Processos de Negócios, do curso de Engenharia de Software da PUC Minas.
                                Nosso time é composto por cinco membros dedicados: Arthur Henrique, Davi Fernandes, Lucas Jácome, Lucas Ribeiro, Thales Mattos e Victor Ferreira. Juntos, estamos comprometidos em trazer soluções inovadoras para os desafios dos processos de negócios.
                                Nosso projeto visa abordar questões práticas e relevantes enfrentadas pelas organizações modernas, oferecendo soluções tecnológicas que otimizam eficiência, produtividade e tomada de decisões. Exploramos tecnologias de ponta e metodologias ágeis para criar aplicações que atendam às necessidades do mercado atual.
                                Estamos entusiasmados em compartilhar nossa jornada e esperamos que nossa iniciativa traga valor não apenas para nossa comunidade acadêmica, mas também para profissionais e empresas interessados em inovação e excelência em processos de negócios.
                                Obrigado por se juntar a nós nesta jornada!
                            </p>
                            <div className="mt-12 flex justify-center items-center">
                                <a href="https://www.pucminas.br/destaques/Paginas/default.aspx" target="_blank" rel="noopener noreferrer" className="mr-8">
                                    <div className={`${styles.imageContainer}`}>
                                        <img src="images/logo-puc-minas.png" alt="Logo da faculdade" className="h-20 w-30" />
                                    </div>
                                </a>
                                <a href="https://github.com/ICEI-PUC-Minas-PPLES-TI/plf-es-2024-1-ti2-1381100-skillmatch" target="_blank" rel="noopener noreferrer" className="mr-8">
                                    <div className={`${styles.imageContainer} ${styles.blurOnHover}`}>
                                        <img src="images/github logo.png" alt="Logo Github" className="h-20 w-20" />
                                    </div>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    );
}
