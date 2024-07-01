"use client";
import React, { useEffect } from "react";
import { Navbar, NavbarBrand, NavbarContent, NavbarItem, Link, Button, Avatar } from "@nextui-org/react";
import { SkillMatchLogo } from "./SkillMatch.jsx";
import { userData, isLoggedIn } from "../utils/Usuario";
import Cookies from 'js-cookie'
import Swal from "sweetalert2";

export const MainNavbar = () => {
    //console.log('');
    const userType = userData.tipo;

    const logout = () => {
        Cookies.remove('skillmatch-token');
        localStorage.removeItem('skillmatch-data');
       
        let timerInterval: NodeJS.Timeout;
        const tempoParaRedirecionar = 3;
        Swal.fire({
            icon: "success",
            title: "Sucesso!",
            html: `Você foi desconectado com sucesso! <br>Você será redirecionado automáticamente em <b timer>${tempoParaRedirecionar}</b> segundos.`,
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
            window.location.href = '/';
        });
    }

    return (
        <Navbar isBordered>
            <NavbarBrand className="teste">
                <Link color="foreground" href="/">
                    <SkillMatchLogo />
                    <p className="font-bold text-inherit">SkillMatch</p>
                </Link>
            </NavbarBrand>
            <NavbarContent className="sm:flex" justify="center">
                {(isLoggedIn && userType === 'Contratante') ? (
                    <NavbarItem>
                        <Link color="foreground" href="signProject">
                            Publicar projeto
                        </Link>
                    </NavbarItem>
                ) : (<></>)}
                <NavbarItem>
                    <Link color="foreground" href="findProject">
                        Encontrar projetos
                    </Link>
                </NavbarItem>
                <NavbarItem>
                    <Link color="foreground" href="aboutUs" aria-current="page">
                        Sobre Nós
                    </Link>
                </NavbarItem>
            </NavbarContent>
            <NavbarContent justify="end">
                {isLoggedIn ? (
                    <>
                        <div className="flex gap-4 items-center">
                            <Avatar isBordered color="warning" src={''} />
                            <span>{userData.nome}</span>
                            <NavbarItem>
                                <Link color="foreground" href="viewProfile">
                                    Meu Perfil
                                </Link>
                            </NavbarItem>
                            <NavbarItem>
                                <Button color="warning" onClick={logout}>Logout</Button>
                            </NavbarItem>
                        </div>
                    </>
                ) : (
                    <>
                        <NavbarItem className="hidden lg:flex">
                            <Link href="logIn" color="warning">Login</Link>
                        </NavbarItem>
                        <NavbarItem>
                            <Button as={Link} color="warning" href="signIn" variant="flat">
                                Cadastrar
                            </Button>
                        </NavbarItem>
                    </>
                )}
            </NavbarContent>
        </Navbar>
    );
};
