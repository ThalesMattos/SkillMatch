"use client";
import React, { MouseEventHandler, useRef, useState } from "react";
import { MainNavbar } from "../navbar";
import { Select, SelectSection, SelectItem } from "@nextui-org/select";
import { Input } from "@nextui-org/react";
import { Button } from "@nextui-org/react";
import { Image } from "@nextui-org/react";
import styles from "./index.module.css";
import { Card, CardHeader, CardBody, CardFooter, Divider } from "@nextui-org/react";
import { userData, isLoggedIn } from "../../utils/Usuario";

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
                                <h4 className={styles.name}>{userData.usuario.nome}</h4>
                                <p className={styles.email}>{userData.usuario.usuario}</p>
                            </div>
                        </div>
                    </CardHeader>
                    <Divider>
                    </Divider>
                    <CardBody className={styles.cardBody}>
                        <div className="p-3 py-5 col-12">
                            <div className="grid gap-4 grid-cols-2">
                                <div className={`${styles.inputGroup}`}>
                                    <h4 className={styles.name}>Nome</h4>
                                    <p className={styles.email}>NomeUsuario</p>
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <h4 className={styles.name}>E-Mail</h4>
                                    <p className={styles.email}>usuario@skillmatch.com</p>
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <h4 className={styles.name}>Telefone</h4>
                                    <p className={styles.email}>(xx) xxxxx-xxxx</p>
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <h4 className={styles.name}>CEP</h4>
                                    <p className={styles.email}>xx xxxx-xxx</p>
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <h4 className={styles.name}>Área de Atuação</h4>
                                    <p className={styles.email}>Front End</p>
                                </div>
                                <div className={`${styles.inputGroup}`}>
                                    <h4 className={styles.name}>CPF</h4>
                                    <p className={styles.email}>xxx.xxx.xxx-xx</p>
                                </div>
                            </div>
                        </div>
                    </CardBody>
                    <Divider>
                    </Divider>
                    <CardFooter className={styles.cardFooter}>
                        <Button color="warning">
                            Editar Perfil
                        </Button>
                    </CardFooter>
                </Card>
            </div>
        </main>
    );
}