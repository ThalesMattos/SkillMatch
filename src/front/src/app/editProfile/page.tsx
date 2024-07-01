"use client";
import React, { MouseEventHandler, useRef, useState } from "react";
import { MainNavbar } from "../navbar";
import { Select, SelectSection, SelectItem } from "@nextui-org/select";
import { Input } from "@nextui-org/react";
import { Button } from "@nextui-org/react";
import { Image } from "@nextui-org/react";
import styles from "./index.module.css";
import { Card, CardHeader, CardBody, CardFooter, Divider } from "@nextui-org/react";

export default function Home() {
    return (
        <main className="flex min-h-screen flex-col items-center p-5">
            <MainNavbar />
            <div className="z-10 w-full max-w-5xl flex flex-col items-center mt-10">
                <Card className={styles.cardCustom}>
                    <CardHeader className={styles.cardHeader}>
                        <div className="w-full items-center justify-center">
                            <div className="flex flex-col items-center">
                                <div className="w-36 h-36 rounded-full overflow-hidden">
                                    <img
                                        className="object-cover w-full h-full"
                                        src="https://i.ibb.co/FDkcWQ9/219986.png"
                                        alt="Imagem"
                                    />
                                </div>
                                <h4 className={styles.name}>Usuário</h4>
                                <p className={styles.email}>usuário@skillmatch.com</p>
                            </div>
                        </div>
                    </CardHeader>
                    <Divider>
                    </Divider>
                    <CardBody className={styles.cardBody}>
                        <div className="p-3 py-5 col-12">
                            <div className="grid gap-4 grid-cols-2">
                                <div className={`${styles.inputGroup}`}>
                                    <label className={styles.labels}>Nome</label>
                                    <Input placeholder="Digite seu Nome Completo" isRequired />
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <label className={styles.labels}>E-mail</label>
                                    <Input placeholder="Digite ou Altere seu E-mail" isRequired />
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <label className={styles.labels}>Telefone</label>
                                    <Input placeholder="Digite seu Telefone" isRequired />
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <label className={styles.labels}>CEP</label>
                                    <Input placeholder="Digite seu CEP" isRequired />
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <label className={styles.labels}>Área de Atuação</label>
                                    <Input placeholder="Digite a Área de Atuação" isRequired />
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <label className={styles.labels}>CPF</label>
                                    <Input placeholder="Digite o CPF" isRequired />
                                </div>
                            </div>
                        </div>
                    </CardBody>
                    <Divider>
                    </Divider>
                    <CardFooter className={styles.cardFooter}>
                        <Button color="warning">
                            Salvar Perfil
                        </Button>
                    </CardFooter>
                </Card>
            </div>
        </main>
    );
}